// Define o pacote onde esta classe está organizada.
package java_collections;

// Importa as classes HashSet e Scanner da biblioteca padrão do Java.
import java.util.HashSet; // HashSet para armazenar números inteiros de forma única.
import java.util.Scanner; // Scanner para ler entradas do usuário.

// Declara uma classe chamada "Exercicio4".
public class Exercicio4 {
    
    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado.
    public static void main(String[] args) {
        // Cria um novo HashSet para armazenar números inteiros.
        HashSet<Integer> meuSet = new HashSet<>();
        // Cria um novo objeto Scanner para ler entradas do usuário.
        Scanner scanner = new Scanner(System.in);

        // Adiciona números inteiros ao HashSet. Números duplicados não serão adicionados.
        meuSet.add(2);
        meuSet.add(5);
        meuSet.add(1);
        meuSet.add(3);
        meuSet.add(4);
        meuSet.add(9);
        meuSet.add(7);
        meuSet.add(8);
        meuSet.add(10);
        meuSet.add(6);

        // Solicita ao usuário para digitar um número entre 1 e 10.
        System.out.println("Digite o número que você deseja encontrar de 1 a 10: ");
        int numeroBuscado = scanner.nextInt(); // Lê o número digitado pelo usuário.

        // Verifica se o HashSet contém o número buscado.
        if (meuSet.contains(numeroBuscado)) {
            // Se o número estiver presente, informa ao usuário.
            System.out.println("O número " + numeroBuscado + " foi encontrado!");
        } else {
            // Se o número não estiver presente, informa ao usuário.
            System.out.println("O número " + numeroBuscado + " não foi encontrado!");
        }

        // Fecha o scanner para liberar os recursos que ele estava usando (opcional, mas uma boa prática).
        scanner.close();
    }
}
