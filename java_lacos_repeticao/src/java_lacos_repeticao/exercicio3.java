// Define o pacote onde essa classe está organizada.
package java_lacos_repeticao;

// Importa a classe Scanner da biblioteca padrão do Java para ler entradas do usuário.
import java.util.Scanner;

// Declara uma classe chamada "exercicio3".
public class exercicio3 {

    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado.
    public static void main(String[] args) {
        
        // Cria um novo objeto "Scanner" para ler as entradas que o usuário digitar no console.
        Scanner scanner = new Scanner(System.in);

        // Declara variáveis para armazenar as informações sobre as idades.
        int idade, menores21 = 0, maiores50 = 0;

        // Mensagem inicial informando ao usuário como encerrar o programa.
        System.out.println("Digite as idades (digite um número negativo para parar):");

        // Inicia um loop "while" que continua repetindo até que uma condição de parada ocorra.
        while (true) {
            // Pede ao usuário para digitar uma idade.
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt(); // Lê o número digitado e o armazena na variável "idade".

            // Verifica se a idade é um número negativo para encerrar o loop.
            if (idade < 0) {
                break; // Sai do loop se a idade for negativa.
            }

            // Verifica se a idade é menor que 21.
            // Se for, incrementa o contador de pessoas com menos de 21 anos.
            if (idade < 21) {
                menores21++;
            }
            // Se a idade for maior que 50, incrementa o contador de pessoas com mais de 50 anos.
            else if (idade > 50) {
                maiores50++;
            }
        }

        // Exibe o número total de pessoas com menos de 21 anos.
        System.out.println("\nTotal de pessoas menores de 21 anos: " + menores21);
        // Exibe o número total de pessoas com mais de 50 anos.
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);

        // Fecha o scanner para liberar os recursos que ele estava usando.
        scanner.close();
    }
}
