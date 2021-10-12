package org.example.dice.formula;

import java.time.Instant;
import java.util.Random;
import java.util.function.Supplier;

public class Die
    implements Formula
{
    private final Supplier<Double> randomProvider;
    public final int faces;

    public Die(int faces) {
        Random random = new Random(Instant.now().toEpochMilli());
        this.faces = faces;
        this.randomProvider = random::nextDouble;
    }

    public Die(int faces, Supplier<Double> randomProvider) {
        this.faces = faces;
        this.randomProvider = randomProvider;
    }

    public int roll() {
        return new Double(1 + this.randomProvider.get() * faces).intValue();
    }
}
