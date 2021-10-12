package org.example.dice.parsing;

public class Parser {
    public int parse(String command) throws InvalidNumberOfFacesException {
        try {
            int faces = Integer.parseInt(command);
            if(faces <= 0) {
                throw new InvalidNumberOfFacesException(command);
            }
            else {
                return faces;
            }
        }
        catch (NumberFormatException exception) {
            throw new InvalidNumberOfFacesException(command);
        }
    }
}