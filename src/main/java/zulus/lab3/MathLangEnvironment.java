package zulus.lab3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import zulus.lab3.grammar.MathLangLexer;
import zulus.lab3.grammar.MathLangParser;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MathLangEnvironment {
    private Map<String, Variable> _memory;
    private MathLangVisitor _visitor;

    public Map<String, Variable> getMemory() {
        return _memory;
    }

    public MathLangEnvironment() {
        this._memory = new HashMap<>();
        this._visitor = new MathLangVisitor(_memory);
    }

    private Variable exec(CharStream stream) throws MathLangParsingException {
        try {
            MathLangLexer lexer = new MathLangLexer(stream);
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MathLangParser parser = new MathLangParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());
            ParseTree tree = parser.init();
            return _visitor.visit(tree);
        } catch (ParseCancellationException|RecognitionException exc) {
            throw new MathLangParsingException(exc);
        }
    }

    public String exec(String command) {
        if (command == null) throw new IllegalArgumentException("Argument 'command' must be not-null value");
        else {
            if(!command.endsWith("\n")){
                command+="\n";
            }
            String output = "";
            Variable result = null;
            try {
                result = exec(CharStreams.fromString(command));
                output = result.getValue().toString();
            } catch (MathLangParsingException exc) {
                output = exc.toString();
            }
            return output;
        }
    }

    @Override
    public String toString() {
        return "MathLang ENV: \n" + _memory.entrySet().stream().map((Map.Entry x) -> String.format("%s:%s", x.getKey(), x.getValue())).collect(Collectors.joining("\n"));
    }
}
