package org.example.dice.formula;

import org.example.dice.DefaultRandomProvider;

import java.util.function.Supplier;

public class Die
    implements Formula
{
    private final Supplier<Double> randomProvider;
    public final int faces;

    public Die(int faces) {
        this(faces, new DefaultRandomProvider());
    }

    public Die(int faces, Supplier<Double> randomProvider) {
        this.faces = faces;
        this.randomProvider = randomProvider;
    }

    public int roll() {
        return new Double(1 + this.randomProvider.get() * faces).intValue();
    }
}
