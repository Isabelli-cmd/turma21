package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class PorcentagemExAula2 {

	public static void main(String[] args) {
	
		int ir;
		double salario = 0;
		boolean  emergencial, fralde, imposto;
		String nome;
		char G;
		char M, F, O;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Escreva seu genero:");
		G = leia.nextLine().charAt(0);
		
		System.out.println("Seu salário:");
		salario = leia.nextDouble();
		
		
		if ((salario*12)<=60000) {
			emergencial = true;
			imposto = false;
			if(imposto == false) {
				if (G=='M') {
					System.out.println("Isento IR");
				}
				else if (G=='F') {
					System.out.println("Isenta IR");
				}
				else if (G=='O') {
					System.out.println("Isente IR");
				}
			}else 
				System.out.println("Pagar IR");
				imposto = true;
				emergencial = false;		
		}
		
		
		
	}

}
