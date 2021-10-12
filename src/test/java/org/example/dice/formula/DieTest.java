package org.example.dice.formula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {
    @Test
    public void resultIsOneWhenTheRandomProviderProvidesItsMinimumValue() {
        Die die = new Die(6, () -> 0.0);
        int result = die.roll();
        assertEquals(1, result);
    }

    @Test
    public void resultIsTheNumberOfFacesWhenTheRandomProviderProvidesItsMaximumValue() {
        Die die = new Die(6, () -> 0.99999);
        int result = die.roll();
        assertEquals(6, result);
    }

    @Test
    public void resultIsHalfTheNumberOfFacesWhenTheRandomProviderProvidesAMediumValue() {
        Die die = new Die(6, () -> 0.5);
        int result = die.roll();
        assertTrue(result == 3 || result == 4);
    }
}
