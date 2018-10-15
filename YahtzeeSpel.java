package weekopdracht_yahtzee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.event.ListSelectionEvent;

public class YahtzeeSpel {
	static Scanner scan = new Scanner(System.in);
	static boolean doorgaan = true;
	ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<Dobbelsteen>();
	
	int[] blokkeerArray = {0,0,0,0,0};
	
	YahtzeeSpel(){
		for(int i = 0; i < 5; i++) {
			dobbelstenen.add(new Dobbelsteen());
		}
	}
	
	public void spelen() {
		boolean continueLoop = true;
		while((doorgaan == true) && (continueLoop == true)){
			System.out.println("Druk op enter om te beginnen of op 'q' om te stoppen");
			String invoer = scan.nextLine();
			if(invoer.equals("q")){
				System.out.println("Het programma wordt gesloten.");
				doorgaan = false;
			}else if(invoer.length() == 0) {
				continueLoop = false;
				System.out.println("Het spel begint.");
			}	
		}
	}
	
	public void checkAndResetBlokkeerArray() {
		if(Dobbelsteen.aantalworpen == 1) {
			for(int u : blokkeerArray) {
				u = 0;
			}
		}
		System.out.println("De array is: " + blokkeerArray[0] + blokkeerArray[1]+ blokkeerArray[2]+ blokkeerArray[3]+ blokkeerArray[4]);
	}
	
	public void vasthouden() {
		System.out.println("Welke posities wilt u vasthouden?\n0 voor geen, anders bv. 124");
		String blokkeren = scan.nextLine();
		
		for(int j = 0; j < blokkeren.length() ; j++) {
			try {
				int k = Integer.parseInt(Character.toString(blokkeren.charAt(j)));
				if(k > 0 && k < 7) {
					blokkeerArray[k-1] = 1;
				}else {
					System.out.println("Dobbelsteen " + k + " bestaat niet en wordt niet vastgehouden.");
				}
				
				System.out.println(blokkeerArray[0] + "" + blokkeerArray[1] + "" + blokkeerArray[2] + "" + blokkeerArray[3] + "" + blokkeerArray[4] + "" + blokkeerArray[5] + "" + blokkeerArray[6]);
			}catch(Exception e) {
				//System.out.println(blokkeren.charAt(j)+ " is geen getal tussen de 1 en 5.");
			}
		}
	}
	
	
}
