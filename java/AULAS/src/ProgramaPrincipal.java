import java.util.Locale;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("PROGRAMA DE SUGEST�O DE CARREIRA");
		System.out.println(
				"Aqui voc� encontrar� sugest�es de �reas � seguir profissionalmente considerando seu desempenho atual.");

		char op = ' ';
		do {
			System.out.println();
			System.out.println("1 - Portugu�s");
			System.out.println("2 - Matem�tica");
			System.out.println("3 - Ci�ncias");
			System.out.println("4 - Hist�ria");
			System.out.println("5 - Geografia");
			System.out.println("6 - Sair");
			System.out.print("Escolha para qual mat�ria voc� deseja visualizar seu engajamento, ou sair do programa: ");
			op = leia.next().charAt(0);
			System.out.println();

			double nota = 0.0;
			int faltas = 0;
			if (op != '6') {
				System.out.print("Insira a nota: ");
				nota = leia.nextDouble();
				System.out.print("Insira as faltas: ");
				faltas = leia.nextInt();
			}

			System.out.println();
			switch (op) {
			case '1':

				break;
			case '2':
				Biologia bio = new Biologia(nota, faltas);
				bio.imprimirListaSugestoes();
				break;
			case '3':

				break;
			case '4':

				break;
			case '5':

				break;
			case '6':

				break;
			default:

				break;
			}

		} while (op != '6');

		System.out.println("FIM DE PROGRAMA.");

		leia.close();
	}

}
