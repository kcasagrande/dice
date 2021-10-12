package org.example.dice.formula;

import java.util.Arrays;
import java.util.List;

public class Sum
    implements Formula
{
    public final List<Formula> formulas;

    public Sum(Formula... formulas) {
        this.formulas = Arrays.asList(formulas);
    }

    @Override
    public int roll() {
        return formulas.stream().map(Formula::roll).reduce(0, Integer::sum);
    }
}
