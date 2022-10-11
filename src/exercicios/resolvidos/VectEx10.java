package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentEx;

public class VectEx10{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();

        StudentEx[] student = new StudentEx[n];

        for(int i = 0; i < student.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno%n", i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            student[i] = new StudentEx(name, n1, n2);            
        }
        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < student.length; i++){
            double avg = student[i].average(student[i].getN1(), student[i].getN2());
            if(avg >= 6.0){
                System.out.println(student[i].getName());
            }         
        }

        sc.close();
    }
}