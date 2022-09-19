package entities;

public class Rectangle {
    public double width, height;

    public double calculateArea(){
        return width * height;
    }
    public double calculatePerimeter(){
        return 2 * (width + height);
    }
    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
    public String toString(){
        return "AREA: "
                + String.format("%.2f%n", calculateArea())
                + "PERIMETRO: "
                + String.format("%.2f%n", calculatePerimeter())
                + "DIAGONAL: "
                + String.format("%.2f%n", calculateDiagonal());
    }
}
