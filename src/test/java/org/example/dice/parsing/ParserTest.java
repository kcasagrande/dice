package org.example.dice.parsing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {
    private Parser parser;

    @BeforeEach
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void parseAnIntAsTheNumberOfFaces() {
        String input = "3";
        int faces = parser.parse(input);
        assertEquals(3, faces);
    }

    @Test
    public void parseAnotherIntAsTheNumberOfFaces() {
        String input = "6";
        int faces = parser.parse(input);
        assertEquals(6, faces);
    }
}
