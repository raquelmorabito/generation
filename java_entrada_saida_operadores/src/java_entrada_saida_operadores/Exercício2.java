package java_entrada_saida_operadores;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite sua 1ª nota: ");
        float nota1 = leitor.nextFloat();
        
    	System.out.print("Digite sua 2ª nota: ");
        float nota2 = leitor.nextFloat();
        
    	System.out.print("Digite sua 3ª nota: ");
        float nota3 = leitor.nextFloat();
        
    	System.out.print("Digite sua 4ª nota: ");
        float nota4 = leitor.nextFloat();
        
        float media = (nota1 + nota2 +nota3 +nota4)/4;
        System.out.print("A sua média é: " + media);
        
        leitor.close();

	}
}
