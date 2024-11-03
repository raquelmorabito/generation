// Define o pacote onde essa classe está organizada.
package java_vetores_matrizes;

// Importa a classe Scanner da biblioteca padrão do Java para ler entradas do usuário.
import java.util.Scanner;

// Declara uma classe chamada "Exercicio1".
public class Exercicio1 {

    // O método "main" é o ponto de entrada do programa, onde tudo começa.
    public static void main(String[] args) {
        
        // Cria um novo objeto "Scanner" para capturar as entradas que o usuário digitar no console.
        Scanner scanner = new Scanner(System.in);

        // Declara e inicializa um array chamado "listaDeNumeros" com 10 números inteiros.
        int[] listaDeNumeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        // Solicita ao usuário que digite um número para encontrar a posição.
        System.out.print("Digite o número de 1 a 10 para encontrar a posição dele: ");
        // Lê o número digitado pelo usuário e o armazena na variável "numeroProcurado".
        int numeroProcurado = scanner.nextInt();

        // Declara uma variável booleana chamada "encontrado" para indicar se o número foi localizado.
        boolean encontrado = false;

        // Inicia um loop que percorre todas as posições do array "listaDeNumeros".
        for (int posicao = 0; posicao < listaDeNumeros.length; posicao++) {
            
            // Verifica se o número na posição atual do array é igual ao "numeroProcurado".
            if (listaDeNumeros[posicao] == numeroProcurado) {
                // Exibe a posição onde o número foi encontrado.
                System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
                // Define a variável "encontrado" como true, pois o número foi encontrado.
                encontrado = true;
                // Interrompe o loop, pois o número já foi localizado.
                break;
            }
        }

        // Se o número não foi encontrado após percorrer o array, exibe uma mensagem informando "o número X não foi encontrado!"
        if (!encontrado) {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }

        // Fecha o objeto "scanner" para liberar os recursos que ele usou.
        scanner.close();
    }
}
