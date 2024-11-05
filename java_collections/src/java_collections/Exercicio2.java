// Define o pacote onde esta classe está organizada.
package java_collections;

// Importa as classes ArrayList e Scanner da biblioteca padrão do Java.
import java.util.ArrayList; // ArrayList para criar uma lista dinâmica de inteiros.
import java.util.Scanner; // Scanner para ler entradas do usuário.

// Declara uma classe chamada "Exercicio2".
public class Exercicio2 {

    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado.
    public static void main(String[] args) {
        // Cria uma nova lista (ArrayList) de inteiros para armazenar números.
        ArrayList<Integer> lista = new ArrayList<>();
        // Adiciona números inteiros à lista.
        lista.add(2);
        lista.add(5);
        lista.add(1);
        lista.add(3);
        lista.add(4);
        lista.add(9);
        lista.add(7);
        lista.add(8);
        lista.add(10);
        lista.add(6);

        // Cria um novo objeto Scanner para ler entradas do usuário.
        Scanner scanner = new Scanner(System.in);

        // Um loop infinito que continua a solicitar ao usuário um número para procurar na lista.
        while (true) {
            // Solicita ao usuário para digitar um número entre 1 e 10.
            System.out.print("Digite o número que você deseja encontrar de 1 a 10: ");
            int numeroBuscado = scanner.nextInt(); // Lê o número digitado pelo usuário.

            // Chama o método encontrarNumero para localizar a posição do número na lista.
            int posicao = encontrarNumero(lista, numeroBuscado);

            // Verifica se o número foi encontrado.
            if (posicao != -1) {
                // Se encontrado, exibe a posição do número na lista.
                System.out.printf("O número %d está localizado na posição: %d%n", numeroBuscado, posicao);
            } else {
                // Se não encontrado, informa ao usuário.
                System.out.printf("O número %d não foi encontrado!%n", numeroBuscado);
            }

            // Exibe uma linha de separação para melhor legibilidade no console.
            System.out.println("-------------------------------------------------");
        }
    }

    // Método para encontrar um número na lista e retornar sua posição.
    public static int encontrarNumero(ArrayList<Integer> lista, int numero) {
        // Percorre a lista de inteiros.
        for (int i = 0; i < lista.size(); i++) {
            // Verifica se o número na posição atual é igual ao número buscado.
            if (lista.get(i) == numero) {
                return i; // Retorna a posição do número encontrado.
            }
        }
        // Retorna -1 se o número não foi encontrado na lista.
        return -1; 
    }
}
