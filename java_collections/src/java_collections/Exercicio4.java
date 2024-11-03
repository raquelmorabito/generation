// Define o pacote onde essa classe está organizada
package java_collections;

// Importa as classes HashSet e Set da biblioteca padrão do Java para criação de um conjunto de elementos
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Declara uma classe chamada "Exercicio4"
public class Exercicio4 {
    
    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado
    public static void main(String[] args) {
        
        // Cria um conjunto (Set) de inteiros chamado "numeros" usando a implementação HashSet
        Set<Integer> numeros = new HashSet<>();
        
        // Estrutura de repetição "for" para adicionar os números de 0 a 9 ao conjunto "numeros"
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        // Exibe uma mensagem no console e os números presentes no conjunto "numeros"
        System.out.println("\n-----------------------------------------------------------------");
        System.out.print("Números presentes:");
        
     // Usamos um "for-each" para mostrar cada número que está no conjunto "numeros"        for (Integer numero : numeros) {
        for (Integer numero : numeros) {
        System.out.print(numero + " ");
            }

        // Cria um novo objeto "Scanner" para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Exibe uma linha de separação e solicita ao usuário que digite um número para pesquisa
        System.out.print("\n-----------------------------------------------------------------");
        System.out.print("\nDigite o número que você deseja com base nos números presentes: ");
        
        // Lê o número digitado pelo usuário e armazena na variável "numeroProcurado"
        int numeroProcurado = scanner.nextInt();

        // Verifica se o número digitado está presente no conjunto "numeros"
        if (numeros.contains(numeroProcurado)) {
            System.out.println("-----------------------------------------------------------------");
            // Exibe mensagem de sucesso caso o número seja encontrado
            System.out.println("Parabéns! O número " + numeroProcurado + " foi encontrado!");
        } else {
            System.out.println("\n-----------------------------------------------------------------");
            // Exibe mensagem de erro caso o número não seja encontrado
            System.out.println("Tente novamente! O número " + numeroProcurado + " não foi encontrado!");
        }

        // Fecha o scanner para liberar os recursos que ele estava usando
        scanner.close();
    }
}
