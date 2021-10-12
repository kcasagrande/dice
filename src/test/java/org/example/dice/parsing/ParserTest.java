package org.example.dice.parsing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ParserTest {
    private Parser parser;

    @BeforeEach
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void parseAnIntAsTheNumberOfFaces() throws InvalidNumberOfFacesException {
        String input = "3";
        int faces = parser.parse(input);
        assertEquals(3, faces);
    }

    @Test
    public void parseAnotherIntAsTheNumberOfFaces() throws InvalidNumberOfFacesException {
        String input = "6";
        int faces = parser.parse(input);
        assertEquals(6, faces);
    }

    @Test
    public void failToParseZeroAsTheNumberOfFaces() {
        String input = "0";
        try {
            parser.parse(input);
            fail();
        }
        catch (InvalidNumberOfFacesException exception) {
            return;
        }
        catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void failToParseANegativeNumberAsTheNumberOfFaces() {
        String input = "-4";
        try {
            parser.parse(input);
            fail();
        }
        catch (InvalidNumberOfFacesException exception) {
            return;
        }
        catch (Exception exception) {
            fail();
        }
    }

    @Test
    public void failToParseAFloatAsTheNumberOfFaces() {
        String input = "1.5";
        try {
            parser.parse(input);
            fail();
        }
        catch (InvalidNumberOfFacesException exception) {
            return;
        }
        catch (Exception exception) {
            fail(exception);
        }
    }

    @Test
    public void failToParseSomeTextAsTheNumberOfFaces() {
        String input = "text";
        try {
            parser.parse(input);
            fail();
        }
        catch (InvalidNumberOfFacesException exception) {
            return;
        }
        catch (Exception exception) {
            fail(exception);
        }
    }
}
