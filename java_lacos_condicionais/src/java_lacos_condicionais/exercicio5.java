package java_lacos_condicionais;

import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] precos = {10.0, 15.0, 18.0, 12.0, 8.0, 13.0};

        String[] produtos = {"Cachorro Quente", "X-Salada", "X-Bacon", "Bauru", "Refrigerante", "Suco de laranja"};

        System.out.print("Código do Produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        if (codigo >= 1 && codigo <= 6) {
            double valorTotal = precos[codigo - 1] * quantidade;
            System.out.println("Produto: " + produtos[codigo - 1]);
            System.out.printf("Valor total: R$ %.2f\n", valorTotal);
        } else {
            System.out.println("Código de produto inválido.");
        }

        scanner.close();
    }
}
