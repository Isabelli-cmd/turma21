programa
{
	
	funcao inicio()
	{
	/*4) Faça um sistema que leia um número inteiro inteiro numero
	 * e mostre uma mensagem indicando se este número é par ou ímpar, 
	 * e se é positivo ou negativo.
	 * 
	 */
		inteiro numero
		escreva("Digite um numero: ")
		leia(numero)

		se(numero==0){
		escreva("Numero neutro")
		}
 		senao se(numero%2==0 e numero>0){
 			escreva("Este numero é par e positivo") 
 		}
 		senao se(numero%2==0 e numero<0){
 			escreva("Este numero é par e negativo.")
 			
 		}
 		senao se(numero%2==1 e numero>0){
 			escreva("Este numero é impar e positivo") 
 		}
 		senao se(numero%2==-1 e numero<0){
 			escreva("Este numero é impar e negativo.")
 		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */