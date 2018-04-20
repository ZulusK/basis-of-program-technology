package zulus.lab3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import zulus.lab3.grammar.MathLangLexer;
import zulus.lab3.grammar.MathLangParser;
import zulus.lab3.visitors.MathLangVisitor;

import java.io.*;
import java.util.Scanner;

public class TestANTLR {

    public static void main(String[] args) throws Exception {
        MathLangVisitor visitor = new MathLangVisitor();
        Scanner reader = new Scanner(System.in);
        String line = "";
        while (true) {
            line = reader.nextLine();
            System.out.println("Line was '" + line + "'");
            CharStream input = CharStreams.fromString(line);
            MathLangLexer lexer = new MathLangLexer(input);
            lexer.setInputStream(input);
            lexer.removeErrorListeners();
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MathLangParser parser = new MathLangParser(tokens);
            try {
                ParseTree tree = parser.init();
                System.out.println("Result: " + visitor.visit(tree).toString());
            }catch (ParseCancellationException exc){
//                System.out.println(exc);
                System.out.println(1);
            }catch (RecognitionException exc){
//                System.out.println(exc);
            }
        }
    }
}
