package org.example.dice;

import org.example.dice.formula.Formula;
import org.example.dice.parsing.Parser;

public class App {
    public static void main(String[] args) throws Exception {
        final Parser parser = new Parser();
        final Formula formula = parser.parse(args[0]);
        System.out.println(formula.roll());
    }
}
