// Define o pacote onde esta classe está organizada.
package java_estrutura_dados;

// Importa as classes Scanner, Stack e InputMismatchException da biblioteca padrão do Java.
import java.util.Scanner; // Scanner para ler entradas do usuário.
import java.util.Stack; // Stack para criar uma pilha de livros.
import java.util.InputMismatchException; // InputMismatchException para tratar entradas inválidas.

// Declara uma classe chamada "Exercicio2".
public class Exercicio2 {

    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado.
    public static void main(String[] args) {
        
        // Cria uma nova pilha (Stack) de Strings para armazenar os livros.
        Stack<String> pilhaLivros = new Stack<>();
        
        // Usa um bloco try-with-resources para abrir o Scanner e garantir que ele seja fechado automaticamente.
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Inicializa a variável "opcao" com -1 para controlar o loop do menu.
            int opcao = -1;

            // Estrutura de repetição "do-while" que exibe o menu e executa as ações até que o usuário escolha sair (opção 0).
            do {
                // Exibe o menu de opções para o usuário.
                System.out.println("\n**************Menu******************");
                System.out.println("1 - Adicionar um novo livro");
                System.out.println("2 - Listar todos os livros");
                System.out.println("3 - Retirar um livro");
                System.out.println("0 - Sair");
                System.out.println("\n------------------------------------");
                System.out.print("Digite um número relacionado à opção desejada: ");
                
                // Tenta ler a opção escolhida pelo usuário.
                try {
                    opcao = scanner.nextInt(); // Lê a opção como um número inteiro.
                } catch (InputMismatchException e) {
                    // Caso o usuário digite um valor inválido, exibe uma mensagem e continua o loop.
                    System.out.println("Opção inválida!");
                    scanner.nextLine(); // Limpa a entrada inválida para evitar loop infinito.
                    continue;
                }

                // Avança a linha para permitir leitura de entradas de texto após números.
                scanner.nextLine(); 

                // Usa uma estrutura "switch" para executar ações com base na opção escolhida.
                switch (opcao) {
                    case 1:
                        // Caso o usuário escolha adicionar um livro.
                        System.out.print("Digite o nome do livro a ser adicionado: ");
                        String livro = scanner.nextLine(); // Lê o nome do livro.
                        pilhaLivros.push(livro); // Adiciona o livro à pilha.
                        System.out.println("---------------Pilha-----------------");
                        // Exibe todos os livros atualmente na pilha.
                        for (String livroNaPilha : pilhaLivros) {
                            System.out.println("-" + livroNaPilha);
                        }
                        System.out.println("Livro adicionado!");
                        break;

                    case 2:
                        // Caso o usuário escolha listar todos os livros.
                        System.out.println("Lista de livros na pilha:");
                        // Exibe cada livro presente na pilha.
                        for (String livroNaPilha : pilhaLivros) {
                            System.out.println("-" + livroNaPilha);
                        }
                        break;

                    case 3:
                        // Caso o usuário escolha retirar um livro da pilha.
                        if (pilhaLivros.isEmpty()) {
                            // Verifica se a pilha está vazia antes de tentar remover.
                            System.out.println("A pilha está vazia!");
                        } else {
                            // Remove o livro no topo da pilha.
                            String livroRemovido = pilhaLivros.pop();
                            System.out.println("Pilha atual:");
                            // Exibe os livros restantes na pilha após a remoção.
                            for (String livroNaPilha : pilhaLivros) {
                                System.out.println("-" + livroNaPilha);
                            }
                            // Informa o usuário sobre o livro que foi removido.
                            System.out.println("Um livro foi retirado: " + livroRemovido);
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
