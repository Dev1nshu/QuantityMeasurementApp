package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void demonstrateAddition(Length l1, Length l2, Length.LengthUnit target) {
        Length result = l1.add(l2, target);
        System.out.println(l1 + " + " + l2 + " = " + result);
    }

    public static void main(String[] args) {
        System.out.println("--- UC6 Addition Demonstration ---");

        Length oneFeet = new Length(1.0, Length.LengthUnit.FEET);
        Length twelveInches = new Length(12.0, Length.LengthUnit.INCHES);

        // 1ft + 12in = 2ft
        demonstrateAddition(oneFeet, twelveInches, Length.LengthUnit.FEET);

        // 12in + 1ft = 24in
        demonstrateAddition(twelveInches, oneFeet, Length.LengthUnit.INCHES);

        // 1yd + 3ft = 2yd
        Length oneYard = new Length(1.0, Length.LengthUnit.YARDS);
        Length threeFeet = new Length(3.0, Length.LengthUnit.FEET);
        demonstrateAddition(oneYard, threeFeet, Length.LengthUnit.YARDS);
    }
}