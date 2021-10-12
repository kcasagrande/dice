package org.example.dice.rolling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RollerTest {
    @Test
    public void resultIsOneWhenTheRandomProviderProvidesItsMinimumValue() {
        Roller roller = new Roller(() -> 0.0);
        int result = roller.apply(6);
        assertEquals(1, result);
    }

    @Test
    public void resultIsTheNumberOfFacesWhenTheRandomProviderProvidesItsMaximumValue() {
        Roller roller = new Roller(() -> 0.99999);
        int result = roller.apply(6);
        assertEquals(6, result);
    }

    @Test
    public void resultIsHalfTheNumberOfFacesWhenTheRandomProviderProvidesAMediumValue() {
        Roller roller = new Roller(() -> 0.5);
        int result = roller.apply(6);
        assertTrue(result == 3 || result == 4);
    }
}
