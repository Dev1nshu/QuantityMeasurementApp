package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testConversion_FeetToInches() {
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(12.0, feet.convertTo(Length.LengthUnit.INCHES), 0.00001);
    }

    @Test
    public void testConversion_YardsToInches() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(36.0, yard.convertTo(Length.LengthUnit.INCHES), 0.00001);
    }

    @Test
    public void testConversion_InchesToYards() {
        Length inches = new Length(72.0, Length.LengthUnit.INCHES);
        assertEquals(2.0, inches.convertTo(Length.LengthUnit.YARDS), 0.00001);
    }

    @Test
    public void testConversion_CentimetersToInches() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        assertEquals(0.393701, cm.convertTo(Length.LengthUnit.INCHES), 0.00001);
    }

    @Test
    public void testConversion_RoundTrip() {
        Length start = new Length(10.0, Length.LengthUnit.FEET);
        double toYards = start.convertTo(Length.LengthUnit.YARDS);
        Length middle = new Length(toYards, Length.LengthUnit.YARDS);
        assertEquals(10.0, middle.convertTo(Length.LengthUnit.FEET), 0.00001);
    }
}