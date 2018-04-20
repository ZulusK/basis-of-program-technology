package zulus.lab3;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import zulus.lab3.grammar.MathLangLexer;
import zulus.lab3.grammar.MathLangParser;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class MathLangEnvironment {
    Map<String, Variable> _memory;
    MathLangVisitor _visitor;

    public Map<String, Variable> getMemory() {
        return _memory;
    }

    public MathLangEnvironment() {
        this._memory = new HashMap<>();
        this._visitor = new MathLangVisitor(_memory);
    }

    private Variable exec(CharStream stream) throws MathLandParsingException {
        try {
            MathLangLexer lexer = new MathLangLexer(stream);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MathLangParser parser = new MathLangParser(tokens);
            ParseTree tree = parser.init();
            return _visitor.visit(tree);
        } catch (ParseCancellationException exc) {
            System.out.println("1   " + exc);
            throw new MathLandParsingException(exc);
        } catch (RecognitionException exc) {
            System.out.println("2   " + exc);
            throw new MathLandParsingException(exc);
        }
    }

    public String exec(String command) {
        if (command == null) throw new IllegalArgumentException("Argument 'command' must be not-null value");
        else {
            String output = "";
            Variable result = null;
            try {
                result = exec(CharStreams.fromString(command));
                _memory.put("_", result);
                output = result.getValue().toString();
            } catch (MathLandParsingException exc) {
                System.out.println(exc);
                output = exc.toString();
            }
            return output;
        }
    }

//    public String exec(InputStream input) {
//        if (input == null) throw new IllegalArgumentException("Argument 'input' must be not-null value");
//        else {
//            String output = "";
//            Variable result = null;
//            try {
//                result = exec(CharStreams.fromStream(input));
//                _memory.put("_", result);
//                output = result.getValue().toString();
//            } catch (IOException exc) {
//                output = String.format("ERROR. %s", exc.getMessage());
//            } catch (MathLandParsingException exc) {
//                System.out.println(exc);
//                output = exc.toString();
//            }
//            return output;
//        }
//    }
}
