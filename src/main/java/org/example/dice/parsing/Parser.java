package org.example.dice.parsing;

import org.example.dice.formula.Formula;
import org.example.dice.formula.Die;

public class Parser {
    public Formula parse(String command) throws InvalidNumberOfFacesException {
        try {
            int faces = Integer.parseInt(command);
            if(faces <= 0) {
                throw new InvalidNumberOfFacesException(command);
            }
            else {
                return new Die(faces);
            }
        }
        catch (NumberFormatException exception) {
            throw new InvalidNumberOfFacesException(command);
        }
    }
}