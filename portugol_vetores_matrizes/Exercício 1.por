programa
{
	funcao inicio()
	{
		inteiro vetor[10]
		inteiro i, j, aux

		escreva("Digite 10 números inteiros:\n")
		para (i = 0; i < 10; i++)
		{
			leia(vetor[i])
		}

		para (i = 0; i < 10; i++)
		{
			para (j = 0; j < 10 - 1; j++)
			{
				se (vetor[j] < vetor[j + 1])
				{
					aux = vetor[j]
					vetor[j] = vetor[j + 1]
					vetor[j + 1] = aux
				}
			}
		}

		escreva("Vetor em ordem decrescente:\n")
		para (i = 0; i < 10; i++)
		{
			escreva(vetor[i], " ")
		}
	}
}
