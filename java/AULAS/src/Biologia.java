
public class Biologia extends Materia{

	public Biologia(double nota, int faltas) {
		super(nota, faltas);	
	}
	
	@Override
	protected char engajamento() {
		if(super.getNota() >= 8.0 && super.getFaltas() <= 5) {
			return 'B'; 
		}
		else if (super.getNota() >= 6.0 && super.getFaltas() <= 10) {
			return 'M';
		}
		else {
			return 'R';
		}
	}
	
	@Override
	public void imprimirListaSugestoes() {
		if(engajamento() == 'B') {
			System.out.println("Seu engajamento est� bom. Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("1 - Nutri��o       (x)");
			System.out.println("2 - Educa��o Fisica    (x)");
			System.out.println("3 - Medicina    (x)");
			System.out.println("4 - Professor de Biologia       (x)");
			System.out.println("5 - Biologia Marinha (x)");
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento est� m�dio. Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("1 - Nutri��o     ( )");
			System.out.println("2 - Educa��o Fisica    (x)");
			System.out.println("3 - Medicina    ()");
			System.out.println("4 - Professor de Biologia        (x)");
			System.out.println("5 - Biologia Marinha  (x)");
		}
		else {
			System.out.println("Seu engajamento est� ruim.");
			System.out.println("1 - Nutri��o       ( )");
			System.out.println("2 - Educa��o Fisica        ( )");
			System.out.println("3 - Medicina     ( )");
			System.out.println("4 - Professor de Biologia    ( )");
			System.out.println("5 - Biologia Marinha  ( )");
		}
		
		/*
		 * LISTA DE BIOLOGIA 

Nutri��o
- Medicina voltada pra �rea de uma alimenta��o mais saud�vel. 

Educa��o f�sica 
- Profissional que trabalha as habiladades com o corpo e exerc�cios f�sicos.

Medicina 
- Profissionais que diagosticam e cuidam da sa�de da popula��o. 

Professor de biologia
- Professional que leciona em escolas ou universidades.

Biologia marinha
- Profissionais que estudam os organismos que vivem no ecossistema salgado.
		 */
	}
}

