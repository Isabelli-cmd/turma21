package Lista3;

public class Exercicio1 {

	public static void main (String args[])
	{
		int numero = 1000;
		
		for (numero=1000; numero<=1999; numero++)
		{
			if((numero%11)==5)
			{
				System.out.printf("numero %d / 11 = 5 \n", numero);
			}
		}
	}
}
