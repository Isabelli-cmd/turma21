programa
{
	
	funcao inicio()
	{
	
	 real base, altura
	 real areaT

	 escreva("Qual o valor da base: ")
	 leia(base)
	 escreva("Qual o valor da altura: ")
	 leia(altura)
	
	 se (base>0 e altura>0){
	 	escreva("A area do triangulo é ", areaT=(base*altura/2))
	 }
	senao se (base<0 e altura<0) {
		escreva("Não é possivel formar triangulo")
	}
	 
	 
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */