package java_entrada_saida_operadores;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        float numero1 = leitor.nextFloat();

        System.out.print("Digite o 2ª número: ");
        float numero2 = leitor.nextFloat();

        System.out.print("Digite o 3º número: ");
        float numero3 = leitor.nextFloat();

        System.out.print("Digite o 4º número: ");
        float numero4 = leitor.nextFloat();

       
        float diferenca = (numero1 * numero2) - (numero3 * numero4);
        System.out.println("A diferença entre os produtos é: " + diferenca);
        
        leitor.close();
    }
}