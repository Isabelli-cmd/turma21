package Lista4;

public class Tarefa1 {

	public static void main(String[] args) {
		
		int a [] = { 1 , 0 , 5 , - 2 , - 5 , 7 };
		int soma =  0 ;
		
		soma = (a [ 0 ] + a [ 1 ] + a [ 5 ]);
		System.out.printf ( " A soma de "  + a [ 0 ] + " , "  + a [ 1 ] +  " e "  + a [ 5 ] +  " é " + soma);
		
		a [ 4 ] = 100 ;
		
		System.out. println ( " Vetor A: ");
		for ( int i = 0 ; i < a . length; i ++ ) {
		System.out.println ( " Posição "  + i +  " : " + a [i]);
		}
	}

}
