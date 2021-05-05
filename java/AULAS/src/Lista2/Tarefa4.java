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
			System.out.println("\nO numero "+numero+ " é neutro");
		}
		else if((numero%2)==0)
		{
			System.out.println("\nO numero "+numero+ " é par");
	
			System.out.printf("A raiz quadrada dele é :" + Math.sqrt(numero));
		}	
		else
		{
			System.out.println("\nO numero "+numero+" é impar");
			
			System.out.printf("\nO numero escolhido elevado ao quadrado é :" + Math.pow(numero, 2));
		}
		
	    leia.close();
			
		
		}
	}


