package primeirasaulas.application;

import primeirasaulas.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CircleArea {

    public static final double PI = 3.14159; //constantes sempre com o nome com todas maiusculas

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        double c = Calculator.calculatedCircumference(radius);
        double v = Calculator.calculatedVolume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", Calculator.PI);
        sc.close();
    }

    //Constante declarada reduntate. Apenas para concluir o exercicio 3 conforme explicado em aula
    public static double circumference(double radius){
        return 2 * PI * radius;
    }

    public static double volume(double radius){
        return 4 * PI * Math.pow(radius, 3) / 3;
    }
}
