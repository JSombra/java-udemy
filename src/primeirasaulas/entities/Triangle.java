package primeirasaulas.entities;

public class Triangle {
    public double a, b ,c;

    public double calculateArea(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static void showResults(double value){
        System.out.printf("Larger area: %.4f%n", value);
    }

}
