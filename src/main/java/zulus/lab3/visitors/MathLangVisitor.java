package zulus.lab3.visitors;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import zulus.lab3.ConvertationException;
import zulus.lab3.Converter;
import zulus.lab3.Variable;
import zulus.lab3.grammar.MathLangBaseVisitor;
import zulus.lab3.grammar.MathLangParser;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MathLangVisitor extends MathLangBaseVisitor<Variable> {
    private Map<String, Variable> memory;

    public MathLangVisitor() {
        this.memory = new HashMap<>();
    }

    // VARIABLE=expression
    @Override
    public Variable visitAssign(MathLangParser.AssignContext ctx) {
        String variableName = ctx.VARIABLE().getText();
        Variable value = visit(ctx.expression());
        memory.put(variableName, value);
        return value;
    }

    // VARIABLE | NUMBER | matrix
    @Override
    public Variable visitAtom(MathLangParser.AtomContext ctx) {
        if (ctx.VARIABLE() != null) {
            String varID = ctx.VARIABLE().getText();
            try {
                Variable v=memory.get(varID);
                if(v==null){
                    throw new NoSuchElementException();
                }else{
                    return v;
                }
            } catch (NoSuchElementException exception) {
                throw new ParseCancellationException(String.format("Variable '%s' is undefined", varID));
            }
        } else if (ctx.NUMBER() != null) {
            return new Variable<Double>(Double.parseDouble(ctx.NUMBER().getText()), Double.class);
        } else if (ctx.matrix() != null) {
            return visit(ctx.matrix());
        } else {
            return visit(ctx.array());
        }
    }

    // {} | {expression (, expression)+}
    @Override
    public Variable visitArray(MathLangParser.ArrayContext ctx) {
        List<Variable> array = ctx.expression().stream().map(this::visit).collect(Collectors.toList());
        if (array.stream().allMatch(p -> p.getValueType().equals(Double.class))) {
            int[] illegalArgumentsIndexes = IntStream
                    .range(0, array.size())
                    .filter(i -> !array.get(i)
                            .getValueType()
                            .equals(Double.class))
                    .toArray();
            throw new ParseCancellationException(String.format("Array declaration includes non-number members at positions: %s", Arrays.toString(illegalArgumentsIndexes)));
        } else {
            return new Variable<List>(array, List.class);
        }
    }

    // +atom |- atom | atom
    @Override
    public Variable visitInvertSign(MathLangParser.InvertSignContext ctx) {
        return visit(ctx.signedAtom()).setSign();
    }

    @Override
    public Variable visitPlainValue(MathLangParser.PlainValueContext ctx) {
        if (ctx.atom() != null) {
            return visit(ctx.atom());
        } else {
            return visit(ctx.signedAtom());
        }
    }


    // expression | assign
    @Override
    public Variable visitPrint(MathLangParser.PrintContext ctx) {
        return new Variable<>(visit(ctx.expression()).getValue().toString(), String.class);
    }

    // expression + expression
    @Override
    public Variable visitExpressionPlus(MathLangParser.ExpressionPlusContext ctx) {
        Variable left = visit(ctx.expression(0));
        Variable right = visit(ctx.expression(1));
        Class leftClass = left.getValueType();

        if (leftClass.equals(String.class)) {
            return new Variable<>(left.getValue().toString() + right.getValue().toString(), String.class);
        }
        try {
            Double leftD = Converter.convertToDouble(left);
            Double rightD = Converter.convertToDouble(right);
            return new Variable<>(rightD + leftD, Double.class);
        } catch (ConvertationException exc) {
            throw new ParseCancellationException("SUM cannot be applied:" + exc.getMessage());
        }

    }

    // expression - expression
    @Override
    public Variable visitExpressionSubtract(MathLangParser.ExpressionSubtractContext ctx) {
        Variable left = visit(ctx.expression(0));
        Variable right = visit(ctx.expression(1));
        try {
            Double leftD = Converter.convertToDouble(left);
            Double rightD = Converter.convertToDouble(right);
            return new Variable<>(  leftD-rightD, Double.class);
        } catch (ConvertationException exc) {
            throw new ParseCancellationException("SUBTRACT cannot be applied:" + exc.getMessage());
        }
    }

}
