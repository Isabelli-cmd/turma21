package Lista4;

import java.util.Scanner;

public class Tarefa2 {

	private static int[] concede;

	public static void main(String[] args) {
		Scanner leia =  new Scanner (System.in);
		
		int numeros [] =  new  int [ 6 ];
		int pares [] =  new  int [ 6 ];
		int somaPares =  0 ;
		int comunes [] =  new  int [ 6 ];
		int incidenciaImpares =  0 ;
		
		for ( int i =  0 ; i < numeros.length; i ++ ) {
			System.out.println ( " Posição "  + i +  " - Digite um número para preencher o vetor: " ); 
			numeros [i] = leia . nextInt ();
			
			if ((numeros [i] % 2 ) == 0 ) {
				pares [i] = numeros [i];
				somaPares = (somaPares + numeros [i]);
				
			} else  if ((numeros [i] % 2 ) == 1 ) {
				comunes [i] = numeros [i];
				incidenciaImpares ++ ;
			}
		}
		
		System.out.println ( " ---- VETOR ---- " );
		for ( int i =  0 ; i < numeros . length; i ++ ) {
		System.out.println ( " Posição "  + i +  " valor "  + numeros [i]);
		}
		
	
		for( int i =  0 ; i < pares . length; i ++ ) {
			
			if (pares [i] == 0 ) {
				System.out.println( " " );
			} else {
			System.out.println ( " Posição "  + i +  " Valor "  + pares [i]);
			}
		}
		
		for (int i =  0 ; i < concede . length; i ++ ) {
			
			if (concede [i] == 0 ) {
				System.out.println( " " );
			} else {
			System.out.println ( " Posição "  + i +  " bravura "  + comunes [i]);
			}
		}
		
		
		System.out.println( "A soma dos números pares é igual a " + somaPares);
		System.out.println ( "Vezes que números ímpares foram inseridos: " + incidenciaImpares);

	}
		
	}
