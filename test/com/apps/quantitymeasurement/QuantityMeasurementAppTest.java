package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testAddition_FeetAndInches_ReturnsFeet() {
        Length oneFeet = new Length(1.0, Length.LengthUnit.FEET);
        Length twelveInches = new Length(12.0, Length.LengthUnit.INCHES);
        Length result = oneFeet.add(twelveInches, Length.LengthUnit.FEET);
        assertEquals(new Length(2.0, Length.LengthUnit.FEET), result);
    }

    @Test
    public void testAddition_InchesAndFeet_ReturnsInches() {
        Length twelveInches = new Length(12.0, Length.LengthUnit.INCHES);
        Length oneFeet = new Length(1.0, Length.LengthUnit.FEET);
        Length result = twelveInches.add(oneFeet, Length.LengthUnit.INCHES);
        assertEquals(new Length(24.0, Length.LengthUnit.INCHES), result);
    }

    @Test
    public void testAddition_Commutativity() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(12.0, Length.LengthUnit.INCHES);

        Length res1 = l1.add(l2, Length.LengthUnit.INCHES);
        Length res2 = l2.add(l1, Length.LengthUnit.INCHES);

        assertEquals(res1, res2);
    }

    @Test
    public void testAddition_WithZeroValue() {
        Length fiveFeet = new Length(5.0, Length.LengthUnit.FEET);
        Length zeroInches = new Length(0.0, Length.LengthUnit.INCHES);
        Length result = fiveFeet.add(zeroInches, Length.LengthUnit.FEET);
        assertEquals(new Length(5.0, Length.LengthUnit.FEET), result);
    }

    @Test
    public void testAddition_CentimetersAndInches() {
        Length cm = new Length(2.54, Length.LengthUnit.CENTIMETERS);
        Length inch = new Length(1.0, Length.LengthUnit.INCHES);
        // 2.54cm is ~1 inch, so total is ~2 inches
        Length result = cm.add(inch, Length.LengthUnit.INCHES);
        assertEquals(2.0, result.convertTo(Length.LengthUnit.INCHES), 0.01);
    }
}