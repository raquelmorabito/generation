package java_lacos_condicionais;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean ePar = numero % 2 == 0;

        boolean ePositivo = numero > 0;

        System.out.print("O número " + numero + " é ");
        if (ePar) {
            System.out.print("par");
        } else {
            System.out.print("ímpar");
        }
        System.out.print(" e ");
        if (ePositivo) {
            System.out.println("positivo!");
        } else {
            System.out.println("negativo!");
        }

        scanner.close();
    }
}
