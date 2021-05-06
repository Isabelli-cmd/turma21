package Lista3;
import  java.util.Scanner ;

public class Exercicio2 {
	
	    public  static  void  main ( String [] argss ) {
	        Scanner leia = new  Scanner (System.in);
	        int numero, par=0, impar=0, i=0;
	        
	        for (numero=1; numero<=10; numero++) {
	            System.out.printf("Digite o "+numero+"°numero: ",i++);
	            numero = leia.nextInt ();
	            
	            if ((numero%2)==0) {
	            	par++;
	            	}
	            
	            else if ((numero%2)==1) {
	            	impar++;
	            }
	            System.out.printf("Quantidade de números pares: %d\n",par); 
	            System.out.printf("Quantidade de números impares: %d\n",impar);
	        }
	    }
}


	    
