package exemplos;

import java.util.Scanner;

	public class temperatura {
		public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
	//variaveis
		String nome;
		double F = 0.0;
		double C = 0.0;
		
		//entrada
		System.out.println("Qual a temperatura em F? ");
		F = leia.nextDouble();
		
		//processamento
		C = (F - 32) / 1.8;
		
		//saida
		System.out.println("A temperatura em C ?: "+C);
		
		}
	}
