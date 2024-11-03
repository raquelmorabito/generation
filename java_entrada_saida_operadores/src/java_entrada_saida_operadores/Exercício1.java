package java_entrada_saida_operadores;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o valor do seu salário: R$");
        float salario = leitor.nextFloat();
        System.out.println("O valor do seu salário é R$:" + salario);
        
        System.out.print("Digite o valor seu abono: R$");
        float abono = leitor.nextFloat();
        System.out.println("O valor do seu abono é R$" + abono);
        
        float novoSalario = salario + abono;      
        System.out.println("O seu novo salário é: R$" + novoSalario);
       
        leitor.close();
	}

}
