package util;

public class Calculator {
    public double radius;
    public final double PI = 3.14159;
    public double calculatedCircumference(){
        return 2 * Math.PI * radius;
    }

    public double calculatedVolume(){
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
}
