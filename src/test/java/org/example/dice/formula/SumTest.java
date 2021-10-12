package org.example.dice.formula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

    @Test
    public void rollOneFormulaAndReturnItsResult() {
        Formula formula = new Sum(new StaticFormula(6));
        int result = formula.roll();
        assertEquals(6, result);
    }

    @Test
    public void rollTwoFormulasAndReturnTheSumOfTheirResults() {
        Formula formula = new Sum(new StaticFormula(6), new StaticFormula(4));
        int result = formula.roll();
        assertEquals(10, result);
    }
}