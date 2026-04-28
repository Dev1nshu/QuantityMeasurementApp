package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testEquality_YardToFeet_EquivalentValue() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        assertEquals(yard, feet); // 1yd = 3ft
    }

    @Test
    public void testEquality_YardToInches_EquivalentValue() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);
        assertEquals(yard, inches); // 1yd = 36in
    }

    @Test
    public void testEquality_CentimetersToInches_EquivalentValue() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length inches = new Length(0.393701, Length.LengthUnit.INCHES);
        assertEquals(cm, inches); // 1cm = 0.393701in
    }

    @Test
    public void testEquality_AllUnits_TransitiveProperty() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);

        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches); // If A=B and B=C, then A=C
    }

    @Test
    public void testEquality_DifferentValue_ReturnsFalse() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(2.0, Length.LengthUnit.FEET);
        assertNotEquals(yard, feet);
    }

    @Test
    public void testEquality_NullComparison() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        assertNotEquals(null, yard); // Null safety
    }
}