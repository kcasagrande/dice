package org.example.dice;

import org.example.dice.parsing.Parser;
import org.example.dice.rolling.Die;

public class App {
    public static void main(String[] args) throws Exception {
        final Parser parser = new Parser();
        final Die die = new Die(parser.parse(args[0]));
        System.out.println(die.roll());
    }
}
