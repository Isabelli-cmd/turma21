programa
{
	
	funcao inicio()
	{
		real peso
		const real multa = 4
		const real excesso = 50

		escreva("Qual o pesodo tomate: ")
		leia(peso)

		se(peso>50){
			escreva("Excesso de peso " + (peso-excesso)*multa)
		}
		senao {
		escreva("OK\n")
		escreva("Não há multa")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 98; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */