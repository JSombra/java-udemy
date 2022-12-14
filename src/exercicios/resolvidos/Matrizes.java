package exercicios.resolvidos;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n]; 

        for	(int i = 0; i < mat.length; i++){
            for (int j =0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for(int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }
        int negativeTotal = 0;

        for	(int i = 0; i < mat.length; i++){
            for (int j =0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    negativeTotal++;
                }
            }
        }
        System.out.printf("%nNegative Numbers: %d%n", negativeTotal);

        sc.close();
    }
}
