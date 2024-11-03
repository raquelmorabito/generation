package java_entrada_saida_operadores;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu salário bruto: R$");
        float salarioBruto = leitor.nextFloat();
        
    	System.out.print("Digite seu adicional noturno: R$");
        float adicionalNoturno = leitor.nextFloat();
        
    	System.out.print("Digite suas horas extras: R$");
        float horasExtras = leitor.nextFloat();
        
    	System.out.print("Digite seus descontos: R$");
        float descontos = leitor.nextFloat();
        
        float salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos);
        System.out.print("O seu salário líquido é: R$" + salarioLiquido);
        
        leitor.close();
	}
}
