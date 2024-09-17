package org.example;

public class GeometryUtils {


    public static double convertToMeters(double valueInCentimeters) {
        return valueInCentimeters / 100;
    }

    public static boolean compareAreas(double area1, double area2) {
        return area1 > area2;
    }
}
