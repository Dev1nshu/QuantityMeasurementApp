package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        assertEquals(feet1, feet2);
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(2.0);
        assertNotEquals(feet1, feet2);
    }

    @Test
    public void testFeetEquality_NullComparison() {
        Feet feet1 = new Feet(1.0);
        assertFalse(feet1.equals(null));
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet feet1 = new Feet(1.0);
        assertEquals(feet1, feet1);
    }
}