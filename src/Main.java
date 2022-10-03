import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        showResults(max(n1, n2, n3));
        sc.close();
    }
    public static int max(int a, int b, int c){
        int aux;
        if (a > b && a > c){
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResults(int value){
        System.out.println("Higher = " + value);
    }
}
