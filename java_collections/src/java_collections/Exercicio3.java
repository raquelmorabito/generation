// Define o pacote onde esta classe está organizada.
package java_collections;

// Importa as classes HashSet, Iterator e Scanner da biblioteca padrão do Java.
import java.util.HashSet; // HashSet para armazenar números inteiros de forma única.
import java.util.Iterator; // Iterator para percorrer os elementos do HashSet.
import java.util.Scanner; // Scanner para ler entradas do usuário.

// Declara uma classe chamada "Exercicio3".
public class Exercicio3 {

    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado.
    public static void main(String[] args) {
        // Cria um novo objeto Scanner para ler entradas do usuário.
        Scanner scanner = new Scanner(System.in);
        // Cria um novo HashSet para armazenar números inteiros.
        HashSet<Integer> meuSet = new HashSet<>();

        // Exibe uma linha de separação para clareza no console.
        System.out.printf("-------------------------------------------------\n");
        // Solicita ao usuário para digitar 10 números aleatórios que não se repitam.
        System.out.println("Digite 10 números aleatórios que não se repitam:");

     // O loop se repetirá 10 vezes, permitindo que o usuário insira 10 números diferentes.
     // A cada iteração, o programa solicita ao usuário que insira um número, lê esse número 
     // e o adiciona ao HashSet 'meuSet', que não permite duplicatas.
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": "); // Solicita o i-ésimo número ao usuário.
            int numero = scanner.nextInt(); // Lê o número digitado pelo usuário.
            meuSet.add(numero); // Adiciona o número ao HashSet. Números duplicados não serão adicionados.
        }
        
        // Exibe uma linha de separação para clareza no console.
        System.out.printf("-------------------------------------------------\n");
        // Exibe uma mensagem antes de listar os números.
        System.out.println("\nNúmeros em ordem crescente:"); // Indica que os números serão exibidos a seguir.
        
        // Cria um iterator para percorrer os elementos do HashSet.
        Iterator<Integer> iterator = meuSet.iterator();
        // Um loop que continua enquanto houver elementos na coleção.
        while (iterator.hasNext()) {
            // Imprime cada número presente no HashSet.
            System.out.println(iterator.next());
        }
    }
}
