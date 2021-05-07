package Lista4;
import  java.util.Scanner ;
public class Tarefa3 {

	public static void main(String[] args) {
		  

				Scanner leia =  new  Scanner ( System.in);
				
				int [] [] matriz =  new  int [ 3 ] [ 3 ];
				int incidenciaMaiorQue10 =  0 ;
				
				
				
				System.out.println ( " Insira valores para montar uma matriz: " ); 			
				
				for ( int linha = 0 ; linha < 3 ; linha ++ ) {
				for ( int coluna = 0 ; coluna < 3 ; coluna ++ ) {
				System.out.printf ( " Linha "  + (linha + 1 ) +  " Coluna " + (coluna + 1 ) + " : " );
						matriz [linha] [coluna] = leia . nextInt ();
						if (matriz [linha] [coluna] > 10 ) {
							incidenciaMaiorQue10 ++ ;						
						}
					}
				}
				
				System.out.println( " --- MATRIZ --- " );								
				for( int linha = 0 ; linha < 3 ; linha ++ ) {
				for ( int coluna = 0 ; coluna < 3 ; coluna ++ ) {
				System.out.printf(matriz [linha] [coluna] + "     " );
					}
				System.out.println ();
				}
				
				System.out.println ( " Valores mais altos que 10 na matriz: " + incidenciaMaiorQue10);

			}



	}


