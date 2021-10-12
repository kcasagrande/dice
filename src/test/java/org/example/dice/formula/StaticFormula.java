package org.example.dice.formula;

class StaticFormula
        implements Formula {
    private final int value;

    StaticFormula(int value) {
        this.value = value;
    }

    @Override
    public int roll() {
        return value;
    }
}
