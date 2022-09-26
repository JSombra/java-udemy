package aplication;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CircleArea {

    public static final double PI = 3.14159; //constantes sempre com o nome com todas maiusculas

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter Radius: ");
        c.radius = sc.nextDouble();
        System.out.printf("Circumference: %.2f%n", c.calculatedCircumference());
        System.out.printf("Volume: %.2f%n", c.calculatedVolume());
        System.out.printf("PI Value: %.2f%n", PI);
        sc.close();
    }
    public static double circumference(double radius){
        return 2 * PI * radius;
    }

    public static double volume(double radius){
        return 4 * PI * Math.pow(radius, 3) / 3;
    }
}
