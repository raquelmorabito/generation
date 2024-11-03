// Define o pacote onde essa classe está organizada.
package java_lacos_repeticao;

// Importa a classe Scanner da biblioteca padrão do Java para ler entradas do usuário.
import java.util.Scanner;

// Declara uma classe chamada "exercicio1".
public class exercicio1 {

    // O método "main" é o ponto de entrada do programa, onde tudo começa.
    public static void main(String[] args) {
        
        // Cria um novo objeto "Scanner" para ler as entradas que o usuário digitar no console.
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar o primeiro número do intervalo.
        System.out.print("Digite o primeiro número do intervalo: ");
        // Lê o número digitado e o armazena na variável "inicio".
        int inicio = scanner.nextInt();

        // Pede ao usuário para digitar o último número do intervalo.
        System.out.print("Digite o último número do intervalo: ");
        // Lê o número digitado e o armazena na variável "fim".
        int fim = scanner.nextInt();

        // Verifica se o primeiro número é maior ou igual ao segundo.
              if (inicio >= fim) {
            // Mostra uma mensagem de erro se o intervalo for inválido.
            System.out.println("Intervalo inválido!");
        } else {
            // Informa o usuário sobre o intervalo que será analisado.
            System.out.println("No intervalo entre " + inicio + " e " + fim + ":");

            // Inicia um loop que percorre todos os números entre "inicio" e "fim" (incluindo ambos).
            for (int i = inicio; i <= fim; i++) {
                
                // Verifica se o número atual "i" é múltiplo de 3 e 5 ao mesmo tempo.
                // Um número é múltiplo de 3 e 5 se o resto da divisão por esses números é zero.
                if (i % 3 == 0 && i % 5 == 0) {
                    // Exibe o número que é múltiplo de 3 e 5.
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }

        // Fecha o scanner para liberar os recursos que ele usou.
        scanner.close();
    }
}
