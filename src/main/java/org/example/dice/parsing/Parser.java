package org.example.dice.parsing;

import org.example.dice.formula.Formula;
import org.example.dice.formula.Die;
import org.example.dice.formula.Sum;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final Pattern pattern = Pattern.compile("(?<single>[1-9]\\d*)|(?<number>[1-9]\\d*)d(?<faces>[1-9]\\d*)");

    public Formula parse(String command) throws InvalidNumberOfFacesException {
        Matcher matcher = pattern.matcher(command);
        try {
            if(!matcher.matches()) {
                throw new InvalidNumberOfFacesException(command);
            }
            else {
                if(matcher.group("single") != null) {
                    int faces = Integer.parseInt(matcher.group("single"));
                    return new Die(faces);
                }
                else {
                    int number = Integer.parseInt(matcher.group("number"));
                    int faces = Integer.parseInt(matcher.group("faces"));
                    List<Formula> dice = new LinkedList<>();
                    for(int index = 0; index < number; index++) {
                        dice.add(new Die(faces));
                    }
                    return new Sum(dice);
                }
            }
        }
        catch (NumberFormatException exception) {
            throw new InvalidNumberOfFacesException(command);
        }
    }
}