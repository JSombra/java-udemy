import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, produto;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        produto = (A * B - C * D);
        System.out.println("Diferença = " + produto);
        sc.close();
    }
}
