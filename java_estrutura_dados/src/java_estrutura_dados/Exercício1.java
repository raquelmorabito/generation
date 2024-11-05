// Define o pacote onde esta classe está organizada.
package java_estrutura_dados;

// Importa as classes LinkedList, Queue e Scanner da biblioteca padrão do Java.
import java.util.LinkedList; // LinkedList para implementar a fila.
import java.util.Queue; // Queue para criar a estrutura de fila.
import java.util.Scanner; // Scanner para ler entradas do usuário.

// Declara uma classe chamada "Exercício1".
public class Exercício1 {

    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado.
    public static void main(String[] args) {
        
        // Cria uma nova fila (Queue) de Strings para armazenar os nomes dos clientes.
        Queue<String> fila = new LinkedList<>();
        
        // Usa um bloco try-with-resources para abrir o Scanner e garantir que ele seja fechado automaticamente.
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Declara a variável "opcao" que irá armazenar a escolha do usuário.
            int opcao;

            // Estrutura de repetição "do-while" que exibe o menu e executa as ações até que o usuário escolha sair (opção 0).
            do {
                // Exibe o menu de opções para o usuário.
                System.out.println("\n**************Menu******************");
                System.out.println("1 - Adicionar cliente na fila");
                System.out.println("2 - Listar todos os clientes na fila");
                System.out.println("3 - Chamar uma pessoa da fila");
                System.out.println("0 - Sair");
                System.out.println("\n------------------------------------");
                System.out.print("Digite um número relacionado a opção desejada: ");
                
                // Lê a opção escolhida pelo usuário como um número inteiro.
                opcao = scanner.nextInt();

                // Usa uma estrutura "switch" para executar ações com base na opção escolhida.
                switch (opcao) {
                    case 1:
                        // Caso o usuário escolha adicionar um cliente na fila.
                        System.out.print("Digite o nome do(a) cliente a ser adicionado na fila: ");
                        String nomeParaAdicionar = scanner.next(); // Lê o nome do cliente.
                        fila.add(nomeParaAdicionar); // Adiciona o cliente à fila.
                        System.out.println("---------------Fila-----------------");
                        // Exibe todos os clientes atualmente na fila.
                        for (String cliente : fila) {
                            System.out.println("-" + cliente);
                        }
                        System.out.println("Cliente adicionado!");
                        break;

                    case 2:
                        // Caso o usuário escolha listar todos os clientes na fila.
                        System.out.println("Lista de clientes na fila:");
                        // Exibe cada cliente presente na fila.
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                        break;

                    case 3:
                        // Caso o usuário escolha chamar um cliente da fila.
                        if (fila.isEmpty()) {
                            // Verifica se a fila está vazia antes de tentar remover um cliente.
                            System.out.println("\n************************************");
                            System.out.println("A fila de clientes está vazia!");
                        } else {
                            // Remove o cliente na frente da fila e armazena o nome na variável "clienteChamado".
                            String clienteChamado = fila.poll();
                            System.out.println("Fila:");
                            // Exibe os clientes restantes na fila após a remoção.
                            for (String cliente : fila) {
                                System.out.println(cliente);
                            }
                            // Informa o usuário sobre o cliente que foi chamado.
                            System.out.println("O(A) cliente " + clienteChamado + " foi chamado(a)!");
                        }
                        break;

                    case 0:
                        // Caso o usuário escolha sair.
                        System.out.println("Programa finalizado!");
                        break;

                    default:
                        // Caso o usuário digite uma opção que não é válida.
                        System.out.println("Opção inválida!");
                }
            // O loop continua enquanto a opção for diferente de 0.
            } while (opcao != 0);
        } 
    } 
}
