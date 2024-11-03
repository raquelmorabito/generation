// Define o pacote onde essa classe está organizada.
package java_lacos_repeticao;

// Importa a classe Scanner da biblioteca padrão do Java para ler entradas do usuário.
import java.util.Scanner;

// Declara uma classe chamada "exercicio5".
public class execicio5 {

    // O método "main" é o ponto de entrada do programa, onde o código começa a ser executado.
    public static void main(String[] args) {
        
        // Cria um novo objeto "Scanner" para ler as entradas que o usuário digitar no console.
        Scanner scanner = new Scanner(System.in);

        // Declara as variáveis necessárias para o programa.
        // "numero" guarda o número digitado pelo usuário, e "soma" armazena a soma dos números positivos.
        int numero, soma = 0;

        // Usa uma estrutura de repetição "do-while" que garante que o bloco de código será executado pelo menos uma vez.
        do {
            // Pede ao usuário para digitar um número.
            System.out.print("Digite um número: ");
            numero = scanner.nextInt(); // Lê o número digitado e o armazena na variável "numero".

            // Verifica se o número digitado é positivo.
            // Se for, ele é adicionado à variável "soma".
            if (numero > 0) {
                soma += numero;
            }

        // O loop continua até que o usuário digite 0, que encerra a execução.
        } while (numero != 0);

        // Exibe o resultado final: a soma dos números positivos digitados.
        System.out.println("A soma dos números positivos é: " + soma);

        // Fecha o scanner para liberar os recursos que ele estava usando.
        scanner.close();
    }
}
