package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			int numero;
	
		System.out.print("Informe um numero inteiro: ");
		numero = leia.nextInt();
		
	    
		if (numero==0)
		{
			System.out.println("\nO numero "+numero+ " � neutro");
		}
		else if((numero%2)==0)
		{
			System.out.println("\nO numero "+numero+ " � par");
	
			System.out.printf("A raiz quadrada dele � :" + Math.sqrt(numero));
		}	
		else
		{
			System.out.println("\nO numero "+numero+" � impar");
			
			System.out.printf("\nO numero escolhido elevado ao quadrado � :" + Math.pow(numero, 2));
		}
		
	    leia.close();
			
		
		}
	}


