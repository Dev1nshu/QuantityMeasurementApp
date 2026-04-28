package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void demonstrateLengthConversion(double value, Length.LengthUnit from, Length.LengthUnit to) {
        Length source = new Length(value, from);
        double convertedValue = source.convertTo(to);
        System.out.println(source + " -> " + String.format("%.2f %s", convertedValue, to));
    }

    public static void demonstrateLengthConversion(Length length, Length.LengthUnit to) {
        double convertedValue = length.convertTo(to);
        System.out.println(length + " converted to " + to + " is " + String.format("%.2f", convertedValue));
    }

    public static void main(String[] args) {
        demonstrateLengthConversion(1.0, Length.LengthUnit.FEET, Length.LengthUnit.INCHES);
        demonstrateLengthConversion(3.0, Length.LengthUnit.YARDS, Length.LengthUnit.FEET);
        demonstrateLengthConversion(36.0, Length.LengthUnit.INCHES, Length.LengthUnit.YARDS);

        Length myCm = new Length(10.0, Length.LengthUnit.CENTIMETERS);
        demonstrateLengthConversion(myCm, Length.LengthUnit.INCHES);
    }
}