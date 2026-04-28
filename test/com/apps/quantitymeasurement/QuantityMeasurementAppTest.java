package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches; // Import Inches

public class QuantityMeasurementAppTest {

    // ... Existing Feet Tests ...

    @Test
    public void testInchesEquality_SameValue() {
        Inches i1 = new Inches(1.0);
        Inches i2 = new Inches(1.0);
        assertEquals(i1, i2);
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        Inches i1 = new Inches(1.0);
        Inches i2 = new Inches(2.0);
        assertNotEquals(i1, i2);
    }

    @Test
    public void testInchesEquality_NullComparison() {
        Inches i1 = new Inches(1.0);
        assertFalse(i1.equals(null));
    }

    @Test
    public void testInchesEquality_DifferentClass() {
        Inches i1 = new Inches(1.0);
        Feet f1 = new Feet(1.0);
        // This ensures an Inch is not equal to a Foot object
        assertNotEquals(i1, f1);
    }

    @Test
    public void testInchesEquality_SameReference() {
        Inches i1 = new Inches(1.0);
        assertEquals(i1, i1);
    }
}