// Define o pacote onde esta classe está organizada.
package java_collections;

// Importa as classes ArrayList, Collections e Scanner da biblioteca padrão do Java.
import java.util.ArrayList; // ArrayList para criar uma lista dinâmica de cores.
import java.util.Collections; // Collections para usar métodos utilitários de coleção.
import java.util.Scanner; // Scanner para ler entradas do usuário.

// Declara uma classe chamada "Exercicio1".
public class Exercicio1 {

    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado.
    public static void main(String[] args) {
        
        // Cria um novo objeto Scanner para ler entradas do usuário.
        Scanner scanner = new Scanner(System.in);
        
        // Cria uma nova lista (ArrayList) de Strings para armazenar as cores.
        ArrayList<String> cores = new ArrayList<>();

        // Solicita ao usuário que digite 5 cores.
        System.out.println("------------------");
        System.out.println("Digite 5 cores:");
        
     // O loop se repetirá 5 vezes, permitindo que o usuário insira 5 cores diferentes.
     // A cada iteração, o programa lê a cor digitada e a armazena na lista 'cores'.
        for (int i = 0; i < 5; i++) {
            String cor = scanner.nextLine(); // Lê uma cor digitada pelo usuário.
            cores.add(cor); // Adiciona a cor à lista de cores.
        }

        // Exibe as cores que foram digitadas pelo usuário.
        System.out.println("------------------");
        System.out.println("Você digitou essas cores:");
        System.out.println("------------------");
        
        // Um loop que percorre a lista de cores e as exibe.
        for (String cor : cores) {
            System.out.println("- " + cor); // Exibe cada cor com um hífen.
        }
        
        // Ordena a lista de cores em ordem alfabética.
        Collections.sort(cores);
        
        // Exibe a lista de cores ordenadas.
        System.out.println("------------------");
        System.out.println("Cores em ordem alfabética:");
        System.out.println("------------------");
        
        // Um loop que percorre a lista ordenada de cores e as exibe.
        for (String cor : cores) {
            System.out.println("- " + cor); // Exibe cada cor ordenada com um hífen.
        }

        // Fecha o scanner para liberar os recursos que ele estava usando.
        scanner.close();
    }
}
