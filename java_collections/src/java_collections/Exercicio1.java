// Define o pacote onde essa classe está organizada
package java_collections;

// Importa a classe ArrayList da biblioteca padrão do Java para criar uma lista de elementos
import java.util.ArrayList;
// Importa a classe Collections, que fornece métodos para manipulação de coleções, como ordenação
import java.util.Collections;
// Importa a classe Scanner da biblioteca padrão do Java para ler entradas do usuário
import java.util.Scanner;

// Declara uma classe chamada "Exercicio1"
public class Exercicio1 {

    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado
    public static void main(String[] args) {
        
        // Cria um novo objeto "Scanner" para ler as entradas que o usuário digitar no console
        Scanner scanner = new Scanner(System.in);
        
        // Cria um ArrayList de Strings chamado "cores" para armazenar as cores que o usuário digitar
        ArrayList<String> cores = new ArrayList<>();

        // Exibe uma mensagem no console para separar a entrada das instruções do programa
        System.out.println("------------------");
        System.out.println("Digite 5 cores:");
        
        // Estrutura de repetição "for" que permite ao usuário digitar 5 cores, que são adicionadas à lista "cores"
        for (int i = 0; i < 5; i++) {
            // Lê a cor digitada pelo usuário e a adiciona à lista "cores"
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        // Exibe a lista de cores digitadas pelo usuário
        System.out.println("------------------");
        System.out.println("Você digitou essas cores::");
        System.out.println("------------------");
        
        // Usamos um "for-each" para mostrar cada cor que está no conjunto "cores"    
        for (String cor : cores) {
            System.out.println("- " + cor);
        }
        
        // Ordena a lista de cores em ordem alfabética usando o método "sort" da classe Collections
        Collections.sort(cores);
        
        // Exibe a lista de cores ordenadas em ordem alfabética
        System.out.println("------------------");
        System.out.println("Cores em ordem alfabética:");
        System.out.println("------------------");
        
        // Estrutura de repetição "for-each" para exibir cada cor na lista "cores" após a ordenação
        for (String cor : cores) {
            System.out.println("- " + cor);
        }

        // Fecha o scanner para liberar os recursos que ele estava usando
        scanner.close();
    }
}
	

