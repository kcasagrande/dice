package org.example.dice.rolling;

import java.time.Instant;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class Roller
    implements Function<Integer, Integer>
{
    private final Supplier<Double> randomProvider;

    public Roller() {
        Random random = new Random(Instant.now().toEpochMilli());
        this.randomProvider = random::nextDouble;
    }

    public Roller(Supplier<Double> randomProvider) {
        this.randomProvider = randomProvider;
    }

    public Integer apply(Integer faces) {
        return new Double(1 + this.randomProvider.get() * faces).intValue();
    }
}
