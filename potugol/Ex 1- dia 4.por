programa
{
	
	funcao inicio()
	{
		real valores[5]
		real notaM = 0.00

		para(inteiro x=0; x<5; x++){
			escreva("Insira sua pontuação: ")
			leia(valores[x])
		
			se(valores[x]>notaM){
				notaM=valores[x]
			}
		}
			limpa()
		
		escreva("a maior pontuação foi : "+notaM)
		para(inteiro x=0;x<5;x++){
			escreva("\na nota "+(x+1)+" foi " +valores[x])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */