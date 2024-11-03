package java_lacos_condicionais;

import java.util.Scanner;

public class exercicio6 {
	 public static void main(String[] args) {
		 	
		 Scanner scanner = new Scanner(System.in);

	      double[] percentuaisReajuste = {0.10, 0.07, 0.09, 0.06, 0.05, 0.08};

	        String[] cargos = {"Gerente", "Vendedor", "Supervisor", "Motorista", "Estoquista", "Técnico de TI"};

	        System.out.print("Nome do colaborador: ");
	        String nome = scanner.nextLine();

	        System.out.print("Código do cargo: ");
	        int codigoCargo = scanner.nextInt();

	        System.out.print("Salário: R$ ");
	        double salario = scanner.nextDouble();

	        
	        if (codigoCargo >= 1 && codigoCargo <= 6) {
	 
	            double reajuste = salario * percentuaisReajuste[codigoCargo - 1];
	            double novoSalario = salario + reajuste;
	    
	            
	            System.out.println("\nNome do colaborador: " + nome);
	            System.out.println("Cargo: " + cargos[codigoCargo - 1]);
	            System.out.printf("Salário: R$ %.2f\n", novoSalario);
	        } else {
	            System.out.println("Código de cargo inválido.");
	        }

	        scanner.close();
	    }
	}
