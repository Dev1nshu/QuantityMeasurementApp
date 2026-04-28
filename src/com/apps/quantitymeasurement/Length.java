package com.apps.quantitymeasurement;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    public enum LengthUnit {
        INCHES(1.0),
        FEET(12.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Value must be a finite number");
        }
        this.value = value;
        this.unit = Objects.requireNonNull(unit, "Unit cannot be null");
    }

    public double convertTo(LengthUnit targetUnit) {
        return (this.value * this.unit.getConversionFactor()) / targetUnit.getConversionFactor();
    }

    // UC6: Addition logic
    public Length add(Length that, LengthUnit targetUnit) {
        Objects.requireNonNull(that, "Operand cannot be null");
        Objects.requireNonNull(targetUnit, "Target unit cannot be null");

        double sumInInches = (this.value * this.unit.getConversionFactor()) +
                (that.value * that.unit.getConversionFactor());

        double finalValue = sumInInches / targetUnit.getConversionFactor();
        return new Length(finalValue, targetUnit);
    }

    private double getBaseValue() {
        return value * unit.getConversionFactor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Math.abs(this.getBaseValue() - length.getBaseValue()) < 0.00001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBaseValue());
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }
}