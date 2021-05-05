package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ListaEx1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;
	 
		
		System.out.println("Digite o primeiro numero: ");
		num1=leia.nextInt();
				
		System.out.println("Digite o segundo numero: ");
		num2=leia.nextInt();
				
		System.out.println("Digite o terceiro numero: ");
		num3=leia.nextInt();
		
		if (num1>num2){
			System.out.printf("O numero maior é: "+num1);
		}
		
		else if (num1>num3) {
			System.out.println("O numero maior é: "+num1);
		}
		
		else if (num2>num1) {
			System.out.println("O numero maior é: "+num2);
		}
		else if (num2>num3 ) {
			System.out.println("O numero maior é: "+num2);
		}
		else {
			System.out.println("O numero maior é: "+num3);
		}
	}

}
