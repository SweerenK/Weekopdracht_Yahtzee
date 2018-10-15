package weekopdracht_yahtzee;

public class Main {

	
	public static void main(String[] args) {
		YahtzeeSpel spelletje = new YahtzeeSpel();
		Dobbelsteen db = new Dobbelsteen();
		GameOutput output = new GameOutput();
		spelletje.spelen();
		
		while (spelletje.doorgaan = true) {
			while (Dobbelsteen.aantalworpen < 3) {
				spelletje.checkAndResetBlokkeerArray();
				Worp worp = new Worp();

				for (Dobbelsteen x : spelletje.dobbelstenen) {
					x.setWaarde(db.werpen());
					worp.setWorpuitslag(spelletje.dobbelstenen.indexOf(x), x.getWaarde());
				}

				output.worpTekst();
				System.out.println(worp.getWorpUitslag());
				spelletje.vasthouden();
				System.out.println("---");
				worp.getWorpUitslag();
			}
		}

		

		// spelletje.vasthouden();
	}
	
}
