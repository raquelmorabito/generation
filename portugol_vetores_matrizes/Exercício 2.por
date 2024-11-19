programa {
    funcao inicio() {
        inteiro vetor[10]
        inteiro i, soma = 0, quantidadePares = 0
        real media

        escreva("Digite 10 números inteiros:\n")
        para (i = 0; i < 10; i++) {
            leia(vetor[i])
        }

        escreva("Elementos nos índices ímpares:\n")
        para (i = 1; i < 10; i += 2) {
            escreva(vetor[i], " ")
        }
        escreva("\n")

        escreva("Elementos pares:\n")
        para (i = 0; i < 10; i++) {
            se (vetor[i] % 2 == 0) {
                escreva(vetor[i], " ")
                quantidadePares++
            }
        }
        escreva("\n")

        para (i = 0; i < 10; i++) {
            soma += vetor[i]
        }
        media = soma / 10.0

        escreva("Soma: ", soma, "\n")
        escreva("Média: ", media, "\n")
    }
}

