package zulus.lab3;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import zulus.lab3.grammar.MathLangLexer;
import zulus.lab3.grammar.MathLangParser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        MathLangEnvironment env = new MathLangEnvironment();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println(env.exec(reader.nextLine()));
        }
    }
}

