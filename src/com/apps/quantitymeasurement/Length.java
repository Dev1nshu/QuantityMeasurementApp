package com.apps.quantitymeasurement;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    // Step 1: Define the Enum with all supported units for UC4
    public enum LengthUnit {
        INCHES(1.0),
        FEET(12.0),
        YARDS(36.0),           // 1 yard = 3 feet = 36 inches
        CENTIMETERS(0.393701); // 1 cm = 0.393701 inches

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Step 2: Centralized conversion logic
    private double convertToBaseUnit() {
        return value * unit.getConversionFactor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Reference check
        if (o == null || getClass() != o.getClass()) return false; // Null and Type check
        Length length = (Length) o;

        // Handle floating-point precision for UC4 (especially for CM)
        return Math.abs(this.convertToBaseUnit() - length.convertToBaseUnit()) < 0.00001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(convertToBaseUnit());
    }
}