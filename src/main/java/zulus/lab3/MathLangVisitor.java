package zulus.lab3;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import zulus.lab1.Matrix;
import zulus.lab3.grammar.MathLangBaseVisitor;
import zulus.lab3.grammar.MathLangParser;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MathLangVisitor extends MathLangBaseVisitor<Variable> {
    private Map<String, Variable> memory;

    public MathLangVisitor(Map<String, Variable> storage) {
        if (storage == null) {
            throw new IllegalArgumentException("Argument 'storage' is null");
        }
        this.memory = storage;
    }

    // VARIABLE=expression
    @Override
    public Variable visitAssign(MathLangParser.AssignContext ctx) {
        String variableName = ctx.VAR().getText();
        Variable value = visit(ctx.expression());
        memory.put(variableName, value);
        return value;
    }

    // expression | assign
    @Override
    public Variable visitPrint(MathLangParser.PrintContext ctx) {
        Variable result = visit(ctx.expression() != null ? ctx.expression() : ctx.assign());
        memory.put("_", result);
        return new Variable<>(String.valueOf(result.getValue()));
    }


    @Override
    public Variable visitScientific(MathLangParser.ScientificContext ctx) {
        try {
            return new Variable<>(Double.parseDouble(ctx.SCIENTIFIC_NUMBER().getText()));
        } catch (NumberFormatException exc) {
            throw new ParseCancellationException(String.format("Invalid number format '%s'", ctx.SCIENTIFIC_NUMBER().getText()));
        }
    }

    // VARIABLE | NUMBER | matrix
    @Override
    public Variable visitAtom(MathLangParser.AtomContext ctx) {
        if (ctx.variable() != null) {
            String varID = ctx.variable().getText();
            try {
                Variable v = memory.get(varID);
                if (v == null) {
                    throw new NoSuchElementException();
                } else {
                    return v;
                }
            } catch (NoSuchElementException exception) {
                throw new ParseCancellationException(String.format("Variable '%s' is undefined", varID));
            }
        } else if (ctx.scientific() != null) {
            return visit(ctx.scientific());
        } else if (ctx.expression() != null) {
            return visit(ctx.expression());
        } else if (ctx.matrix() != null) {
            return visit(ctx.matrix());
        } else if (ctx.array() != null) {
            return visit(ctx.array());
        } else if (ctx.pi() != null) {
            return visit(ctx.pi());
        } else {
            throw new ParseCancellationException(String.format("Cannot recognize type of atom"));
        }
    }

    @Override
    public Variable visitPi(MathLangParser.PiContext ctx) {
        return new Variable<>(Math.PI);
    }

    // +atom |- atom | atom
    @Override
    public Variable visitInvertSignedAtom(MathLangParser.InvertSignedAtomContext ctx) {
        return visit(ctx.signedAtom()).setSign();
    }

    @Override
    public Variable visitPlainFactor(MathLangParser.PlainFactorContext ctx) {
        return visit(ctx.factor());
    }

    @Override
    public Variable visitPlainAtom(MathLangParser.PlainAtomContext ctx) {
        if (ctx.atom() != null) {
            return visit(ctx.atom());
        } else {
            return visit(ctx.signedAtom());
        }
    }


    // expression + expression
    @Override
    public Variable visitSumExpression(MathLangParser.SumExpressionContext ctx) {
        Variable left = visit(ctx.expression(0));
        Variable right = visit(ctx.expression(1));
        if (left == null || right == null) {
            throw new ParseCancellationException("Invalid operation form. It's a binary operation");
        }
        if (!left.getValueType().equals(right.getValueType())) {
            throw new ParseCancellationException(String.format("SUM cannot be applied to operands of type %s and %s", left.getValueType().getSimpleName(), right.getValueType().getSimpleName()));
        }
        try {
            if (left.getValueType().equals(Double.class)) {
                Double leftD = Converter.convertToDouble(left);
                Double rightD = Converter.convertToDouble(right);
                return new Variable<>(leftD + rightD);
            } else if (left.getValueType().equals(Matrix.class)) {
                Matrix leftM = Converter.convertToMatrix(left);
                Matrix rightM = Converter.convertToMatrix(right);
                return new Variable<>(leftM.add(rightM));
            }
        } catch (IllegalArgumentException | ConvertationException exc) {
            throw new ParseCancellationException("SUM cannot be applied:" + exc.getMessage());
        }
        throw new ParseCancellationException(String.format("SUM cannot be applied to operands of type %s and %s", left.getValueType().getSimpleName(), right.getValueType().getSimpleName()));
    }

    // expression - expression
    @Override
    public Variable visitSubtractExpression(MathLangParser.SubtractExpressionContext ctx) {
        Variable left = visit(ctx.expression(0));
        Variable right = visit(ctx.expression(1));
        if (left == null || right == null) {
            throw new ParseCancellationException("Invalid operation form. It's a binary operation");
        }
//        if (!left.getValueType().equals(right.getValueType())) {
//            throw new ParseCancellationException(String.format("SUBTRACT cannot be applied to operands of type %s and %s", left.getValueType().getSimpleName(), right.getValueType().getSimpleName()));
//        }
        try {
            if (left.getValueType().equals(Double.class)) {
                Double leftD = Converter.convertToDouble(left);
                Double rightD = Converter.convertToDouble(right);
                return new Variable<>(leftD - rightD);
            } else if (left.getValueType().equals(Matrix.class)) {
                Matrix leftM = Converter.convertToMatrix(left);
                Matrix rightM = Converter.convertToMatrix(right);
                return new Variable<>(leftM.add(rightM.multiply(-1)));
            }
        } catch (ConvertationException | IllegalArgumentException exc) {
            throw new ParseCancellationException("SUBTRACT cannot be applied:" + exc.getMessage());
        }
        throw new ParseCancellationException(String.format("SUBTRACT cannot be applied to operands of type %s and %s", left.getValueType().getSimpleName(), right.getValueType().getSimpleName()));
    }

    private Matrix getMatrixFromLists(List<Variable> members) {
        List first = (List) members.get(0).getValue();
        List<List> arrays = members.stream().map(x -> (List) x.getValue()).collect(Collectors.toList());
        if (arrays.stream().anyMatch(x -> x.size() != first.size())) {
            throw new ParseCancellationException("Matrix definition includes lists with different length");
        }
        return Matrix.fromDoubleMatrix(arrays.stream().map(x -> x.stream().toArray(Double[]::new)).toArray(Double[][]::new));
    }

    @Override
    public Variable visitArray(MathLangParser.ArrayContext ctx) {
        // collect all members
        List<Variable> members = ctx.expression().stream().map(this::visit).collect(Collectors.toList());
        if (members.size() == 0 || members.get(0) == null)
            throw new ParseCancellationException("Array definition is empty");
        if (members.stream().anyMatch(x -> !x.getValueType().equals(Double.class))) {
            throw new ParseCancellationException("Array can only contain doubles");
        } else {
            return new Variable<>(
                    members.stream().mapToDouble(x -> (Double) x.getValue()).boxed().collect(Collectors.toList()));
        }
    }

    // [...]
    @Override
    public Variable visitMatrix(MathLangParser.MatrixContext ctx) {
        // collect all members
        List<Variable> members = ctx.expression().stream().map(this::visit).collect(Collectors.toList());
        if (members.size() == 0 || members.get(0) == null)
            throw new ParseCancellationException("Matrix definition is empty");
        Variable first = members.get(0);

        // check, all members has the same type
        if (members.stream().anyMatch(x -> !x.getValueType().equals(first.getValueType()))) {
            throw new ParseCancellationException("Matrix definition includes non-identical members");
        } else if (first.getValueType().equals(Double.class)) {
            // check all members are Double
            double[] source = members.stream().mapToDouble(x -> (Double) x.getValue()).toArray();
            return new Variable<>(new Matrix(new double[][]{source}));
        } else if (first.getValueType().equals(ArrayList.class)) {
            // check all members are Lists
            return new Variable<>(getMatrixFromLists(members));
        } else {
            throw new ParseCancellationException(String.format("Matrix definition includes illegal types: %s", first.getValueType().getSimpleName()));
        }
    }

    @Override
    public Variable visitDeterminantExpression(MathLangParser.DeterminantExpressionContext ctx) {
        Variable arg = visit(ctx.expression());
        try {
            return new Variable<>(Converter.convertToMatrix(arg).determinant());
        } catch (ConvertationException exc) {
            throw new ParseCancellationException("Cannot calculate determinant of not a matrix member");
        } catch (IllegalArgumentException exc) {
            throw new ParseCancellationException(exc.getMessage());
        }
    }

    private Variable multiplyMatrixByVariable(Matrix matrix, Variable var) {
        if (var.getValueType().equals(Matrix.class)) {
            throw new ParseCancellationException("Multiplication of matrix is not supported yet");
        } else if (var.getValueType().equals(Double.class) || var.getValueType().equals(String.class)) {
            try {
                Double val = Converter.convertToDouble(var);
                return new Variable<>(matrix.multiply((Double) var.getValue()));
            } catch (ConvertationException exc) {
                throw new ParseCancellationException(String.format("MULT cannot be applied to operands of type %s and %s", Matrix.class.getSimpleName(), var.getValueType().getSimpleName()));
            }
        } else {
            throw new ParseCancellationException(String.format("MULT cannot be applied to operands of type %s and %s", Matrix.class.getSimpleName(), var.getValueType().getSimpleName()));
        }
    }

    private Variable multiplyArrayByDouble(List<Double> list, Double val) {
        return new Variable<>(list.stream().map((Double x) -> ((Double) x) * val).collect(Collectors.toList()));
    }

    private Variable multiplyArrayByVariable(List<Double> list, Variable var) {
        if (var.getValueType().equals(ArrayList.class)) {
            throw new ParseCancellationException("Multiplication of arrays is not supported yet");
        } else if (var.getValueType().equals(Double.class) || var.getValueType().equals(String.class)) {
            try {
                Double val = Converter.convertToDouble(var);
                return multiplyArrayByDouble(list, val);
            } catch (ConvertationException exc) {
                throw new ParseCancellationException(String.format("MULT cannot be applied to operands of type %s and %s", Matrix.class.getSimpleName(), var.getValueType().getSimpleName()));
            }
        } else {
            throw new ParseCancellationException(String.format("MULT cannot be applied to operands of type %s and %s", Matrix.class.getSimpleName(), var.getValueType().getSimpleName()));
        }
    }

    @Override
    public Variable visitMultExpression(MathLangParser.MultExpressionContext ctx) {
        Variable left = visit(ctx.expression(0));
        Variable right = visit(ctx.expression(1));
        if (left == null || right == null) {
            throw new ParseCancellationException("Invalid operation form. It's a binary operation");
        }
        if (left.getValueType().equals(Matrix.class)) {
            return multiplyMatrixByVariable((Matrix) left.getValue(), right);
        } else if (right.getValueType().equals(Matrix.class)) {
            return multiplyMatrixByVariable((Matrix) right.getValue(), left);
        } else if (left.getValueType().equals(Double.class) && right.getValueType().equals(Double.class)) {
            return new Variable<>(((Double) left.getValue()) * ((Double) right.getValue()));
        } else if (left.getValueType().equals(ArrayList.class)) {
            return multiplyArrayByVariable((List) left.getValue(), right);
        } else if (right.getValueType().equals(ArrayList.class)) {
            return multiplyArrayByVariable((List) right.getValue(), left);
        } else {
            throw new ParseCancellationException(String.format("MULT cannot be applied to operands of type %s and %s", left.getValueType().getSimpleName(), right.getValueType().getSimpleName()));
        }
    }


    private Variable divMatrixByVariable(Matrix matrix, Variable var) {
        if (var.getValueType().equals(Matrix.class)) {
            throw new ParseCancellationException("Division of matrix is not supported");
        } else if (var.getValueType().equals(Double.class) || var.getValueType().equals(String.class)) {
            try {
                Double val = Converter.convertToDouble(var);
                return new Variable<>(matrix.multiply(1 / val));
            } catch (ConvertationException exc) {
                throw new ParseCancellationException(String.format("DIV cannot be applied to operands of type %s and %s", Matrix.class.getSimpleName(), var.getValueType().getSimpleName()));
            }
        } else {
            throw new ParseCancellationException(String.format("DIV cannot be applied to operands of type %s and %s", Matrix.class.getSimpleName(), var.getValueType().getSimpleName()));
        }
    }

    private Variable divArrayByVariable(List<Double> list, Variable var) {
        if (var.getValueType().equals(ArrayList.class)) {
            throw new ParseCancellationException("Division of arrays is not allowed");
        } else if (var.getValueType().equals(Double.class) || var.getValueType().equals(String.class)) {
            try {
                Double val = Converter.convertToDouble(var);
                return multiplyArrayByDouble(list, 1 / val);
            } catch (ConvertationException exc) {
                throw new ParseCancellationException(String.format("DIV cannot be applied to operands of type %s and %s", ArrayList.class.getSimpleName(), var.getValueType().getSimpleName()));
            }
        } else {
            throw new ParseCancellationException(String.format("DIV cannot be applied to operands of type %s and %s", ArrayList.class.getSimpleName(), var.getValueType().getSimpleName()));
        }
    }

    @Override
    public Variable visitDivExpression(MathLangParser.DivExpressionContext ctx) {
        Variable left = visit(ctx.expression(0));
        Variable right = visit(ctx.expression(1));
        if (left == null || right == null) {
            throw new ParseCancellationException("Invalid operation form. It's a binary operation");
        }
        if (left.getValueType().equals(Matrix.class)) {
            return divMatrixByVariable((Matrix) left.getValue(), right);
        } else if (left.getValueType().equals(Double.class) && right.getValueType().equals(Double.class)) {
            return new Variable<>(((Double) left.getValue()) / ((Double) right.getValue()));
        } else if (left.getValueType().equals(ArrayList.class)) {
            return divArrayByVariable((List) left.getValue(), right);
        } else {
            throw new ParseCancellationException(String.format("DIV cannot be applied to operands of type %s and %s", left.getValueType().getSimpleName(), right.getValueType().getSimpleName()));
        }
    }

    @Override
    public Variable visitFactor(MathLangParser.FactorContext ctx) {
        Variable base = visit(ctx.signedAtom(0));
        if (ctx.signedAtom(1) != null) {
            Variable power = visit(ctx.signedAtom(1));
            if (power.getValueType().equals(Double.class) && base.getValueType().equals(Double.class)) {
                return new Variable<>(Math.pow((Double) base.getValue(), (Double) power.getValue()));
            } else {
                throw new ParseCancellationException(String.format("POW cannot be applied to object of types %s and %s", base.getValueType().getSimpleName(), power.getValueType().getSimpleName()));
            }
        } else {
            return base;
        }
    }

    @Override
    public Variable visitModuleExpression(MathLangParser.ModuleExpressionContext ctx) {
        Variable v = visit(ctx.expression());
        if (v.getValueType().equals(Double.class)) {
            return new Variable(-(Double) v.getValue());
        } else if (v.getValueType().equals(Matrix.class)) {
            return new Variable(((Matrix) v.getValue()).module());
        } else {
            throw new ParseCancellationException("MODULE cannot be applied to object of type " + v.getValueType().getSimpleName());
        }
    }
}
