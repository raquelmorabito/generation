package java_lacos_condicionais;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o número B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o número C: ");
        int C = scanner.nextInt();

        int soma = A + B;
        boolean eMaior = soma > C;

        if (eMaior) {
            System.out.println(A + " + " + B + " = " + soma + " > " + C);
            System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < C) {
            System.out.println(A + " + " + B + " = " + soma + " < " + C);
            System.out.println("A Soma de A + B é Menor do que C");
        } else {
            System.out.println(A + " + " + B + " = " + soma + " = " + C);
            System.out.println("A Soma de A + B é Igual a C");
        }

        scanner.close();
    }
}