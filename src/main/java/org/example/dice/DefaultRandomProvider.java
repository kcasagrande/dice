package org.example.dice;

import java.time.Instant;
import java.util.Random;
import java.util.function.Supplier;

public class DefaultRandomProvider
    implements Supplier<Double> {

    private Random random;

    public DefaultRandomProvider() {
        this.random = new Random(Instant.now().toEpochMilli());
    }

    @Override
    public Double get() {
        return this.random.nextDouble();
    }
}
