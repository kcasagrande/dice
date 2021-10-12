package org.example.dice.parsing;

class Parser {
    public int parse(String command) throws InvalidNumberOfFacesException {
        int faces = Integer.parseInt(command);
        if(faces == 0) {
            throw new InvalidNumberOfFacesException(command);
        }
        else {
            return faces;
        }
    }
}