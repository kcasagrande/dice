package org.example.dice;

import org.example.dice.parsing.Parser;
import org.example.dice.rolling.Roller;

public class App {
    public static void main(String[] args) throws Exception {
        final Parser parser = new Parser();
        final Roller roller = new Roller();
        System.out.println(roller.apply(parser.parse(args[0])));
    }
}
