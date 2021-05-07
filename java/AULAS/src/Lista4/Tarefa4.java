package Lista4;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
    Scanner leia =  new  Scanner (System.in);
		
		int [] [] M1  =  new  double [ 2 ] [ 2 ];
		int [] [] M2  =  new  double [ 2 ] [ 2 ];
		char opcaoMenu;
		int somandoOp3;
		
		System.out.println( " Insira valores para montar uma matriz M1: " ); 	
				
		for ( int linha = 0 ; linha < 2 ; linha ++ ) {
		for ( int coluna = 0 ; coluna < 2 ; coluna ++ ) {
		System.out.println ( " Linha "  + (linha + 1 ) +  " Coluna " + (coluna + 1 ) + " : " );
						M1 [linha] [coluna] = leia . nextDouble ();
						
					}
				}
				
		System.out.println ( " Insira valores para montar uma matriz M2: " );
				
		for( int linha = 0 ; linha < 2 ; linha ++ ) {
		for ( int coluna = 0 ; coluna < 2 ; coluna ++ ) {
		System.out.println( " Linha "  + (linha + 1 ) +  " Coluna " + (coluna + 1 ) + " : " );
						M2 [linha] [coluna] = leia . nextDouble ();
						
					}
				}
				
		System.out.println ( " Selecione uma opção: \ n (1) Somar as duas matrizes \ n (2) Subtrair a primeira matriz da segunda "
				+  " \ n (3) Adicionar uma constante às duas matrizes \ n (4) Exibir como duas matrizes " );
		opcaoMenu = leia . próximo () . charAt ( 0 );
		Sistema . para fora . println ();
		
		if (opcaoMenu ==  ' 1 ' ) {	 
			
			Sistema . para fora . println ( " --- SOMA M1 + M2 --- " );	
			para ( int linha = 0 ; linha < 2 ; linha ++ ) {
				for ( int coluna = 0 ; coluna < 2 ; coluna ++ ) {
					Sistema . para fora . printf ( " % .1f     " , ( M1 [linha] [coluna] + M2 [linha] [coluna]));
				}
				Sistema . para fora . println ();
			}
			
			
		} else  if (opcaoMenu ==  ' 2 ' ) { 
			
			Sistema . para fora . println ( " --- SUBTRAÇÃO M1 + M2 --- " );	
			para ( int linha = 0 ; linha < 2 ; linha ++ ) {
				for ( int coluna = 0 ; coluna < 2 ; coluna ++ ) {
					Sistema . para fora . printf ( " % .1f     " , ( M1 [linha] [coluna] - M2 [linha] [coluna]));
				}
				Sistema . para fora . println ();
			}
			
			
		} else  if (opcaoMenu ==  ' 3 ' ) {  
			Sistema . para fora . println ( " Digite um valor a ser somado nas matrizes: " );
			somandoOp3 = leia . nextInt ();
			
			Sistema . para fora . println ( " --- SOMA M1 + "  + somandoOp3 +  " --- " );	
			para ( int linha = 0 ; linha < 2 ; linha ++ ) {
				for ( int coluna = 0 ; coluna < 2 ; coluna ++ ) {
					Sistema . para fora . printf ( " % .1f     " , ( M1 [linha] [coluna] + somandoOp3));
				}
				Sistema . para fora . println ();
			}
			
			Sistema . para fora . println ( " --- SOMA M2 + "  + somandoOp3 +  " --- " );	
			para ( int linha = 0 ; linha < 2 ; linha ++ ) {
				for ( int coluna = 0 ; coluna < 2 ; coluna ++ ) {
					Sistema . para fora . printf ( " % .1f     " , ( M2 [linha] [coluna] + somandoOp3));
				}
				Sistema . para fora . println ();
			}
			
			
		} else  if (opcaoMenu ==  ' 4 ' ) { // imprimindo matrizes originais
			
			Sistema . para fora . println ( " --- MATRIZ M1 --- " );	
			para ( int linha = 0 ; linha < 2 ; linha ++ ) {
				for ( int coluna = 0 ; coluna < 2 ; coluna ++ ) {
					Sistema . para fora . print ( M1 [linha] [coluna] + "     " );
				}
				Sistema . para fora . println ();
			}
			
			Sistema . para fora . println ( " --- MATRIZ M2 --- " );	
			para ( int linha = 0 ; linha < 2 ; linha ++ ) {
				for ( int coluna = 0 ; coluna < 2 ; coluna ++ ) {
					Sistema . para fora . print ( M2 [linha] [coluna] + "     " );
				}
				Sistema . para fora . println ();
			}
			
			
		} else {
			Sistema . para fora . println ( " Opção inválida " );
		}
	
	}

	}
