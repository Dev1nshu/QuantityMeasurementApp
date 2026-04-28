package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(f1, f2);
    }

    @Test
    public void testInchesEquality_SameValue() {
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(1.0, Length.LengthUnit.INCHES);
        assertEquals(i1, i2);
    }

    @Test
    public void testFeetToInchesEquality_EquivalentValue() {
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);
        assertEquals(feet, inches, "1.0 Feet should be equal to 12.0 Inches");
    }

    @Test
    public void testInchesToFeetEquality_EquivalentValue() {
        Length inches = new Length(12.0, Length.LengthUnit.INCHES);
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(inches, feet, "Symmetry check: 12.0 Inches should equal 1.0 Feet");
    }

    @Test
    public void testEquality_DifferentValue() {
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(2.0, Length.LengthUnit.FEET);
        assertNotEquals(f1, f2);
    }

    @Test
    public void testEquality_NullComparison() {
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        assertNotEquals(null, f1);
    }
}