package primeirasaulas.entities;

public class Student {
    public String name;
    public double note1, note2, note3;

    public double finalAverage(){
        return note1 + note2 + note3;
    }
    public double checkNote(){
        return 60 - finalAverage();
    }
    public String toString(){
        if (finalAverage() > 60){
            return "FINAL GRADE = " + String.format("%.2f%n",finalAverage()) + "PASS";
        } else {
            return "FINAL GRADE = " + String.format("%.2f%n",finalAverage()) + String.format("%s%n", "FAILED") + "MISSING = " + String.format("%.2f",checkNote());
        }
    }
}
