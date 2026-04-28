package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void demonstrateFeetEquality() {
        Length f1 = new Length(1.0, Length.LengthUnit.FEET);
        Length f2 = new Length(1.0, Length.LengthUnit.FEET);
        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + f1.equals(f2) + ")");
    }

    public static void demonstrateInchesEquality() {
        Length i1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(1.0, Length.LengthUnit.INCHES);
        System.out.println("Input: 1.0 inch and 1.0 inch");
        System.out.println("Output: Equal (" + i1.equals(i2) + ")");
    }

    public static void demonstrateYardComparison() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        System.out.println("Input: 1.0 yard and 3.0 feet");
        System.out.println("Output: Equal (" + yard.equals(feet) + ")");
    }

    public static void demonstrateCmToInch() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length inch = new Length(0.393701, Length.LengthUnit.INCHES);
        System.out.println("Input: 1.0 cm and 0.393701 inch");
        System.out.println("Output: Equal (" + cm.equals(inch) + ")");
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateYardComparison();
        demonstrateCmToInch();
    }
}