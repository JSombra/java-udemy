package util;

public class Calculator {
    public static final double PI = 3.14159;
    public static double calculatedCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculatedVolume(double radius){
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
}
