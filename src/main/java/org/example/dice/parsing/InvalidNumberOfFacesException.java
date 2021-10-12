package org.example.dice.parsing;

public class InvalidNumberOfFacesException
    extends Exception
{
    public final String input;

    public InvalidNumberOfFacesException(String input) {
        this.input = input;
    }

    @Override
    public String getMessage() {
        return "Nombre de faces incorrect : " + input;
    }
}
