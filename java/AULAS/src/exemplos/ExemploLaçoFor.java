package exemplos;

import java.util.Scanner;
public class ExemploLaçoFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int habitantes =3; 
		double salario=0;
		int filhos=0;
		double Msalario=0.00;
		double salarioT=0.00;
		double mediaF=0.00;
		int totalF=0;
		double SalarioMaior=0.00;
		double percentualate100=0.00;
		double contador=0.00;
		
		for(int indice=1;indice<=habitantes; indice++) {
			System.out.printf("Digite o salario do habitante %d: ",indice);
			salario= leia.nextDouble();
			System.out.printf("Digite o numero de filhos: ");
			filhos= leia.nextInt();
		
			
			if (salario>SalarioMaior ) {
				SalarioMaior = salario;
			}
			if (salario <=100) {
				contador++;
			}
			
		// processamento
			
		Msalario= (salarioT/habitantes);
		Msalario= (totalF/habitantes);
		percentualate100=(contador/habitantes);
		
		//saida
		
		System.out.printf("Total de salarios: R$ %.2f",salarioT);
		System.out.printf("Média salarial: R$ %.2f",Msalario);
		System.out.printf("Maior Salario: R$ %.2f",SalarioMaior);
		System.out.printf("Toatl de filhos: %.0f",totalF);
		System.out.printf("Média de filhos: %.2f",mediaF);
		System.out.printf("O percentual de pessoas com salarios até R$100: %%.2f",percentualate100);
		
		}

	}

}
