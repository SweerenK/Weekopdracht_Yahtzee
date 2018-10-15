package weekopdracht_yahtzee;

import java.util.Random;
import java.util.Scanner;

public class Dobbelsteen {
	private int waarde;
	private boolean vasthouden;
	private Scanner scan = new Scanner(System.in);
	static int aantalworpen = 0;
	/*
	public void werpDobbelsteen() {
		if(aantalworpen < 3) {
			System.out.println("WORP " + aantalworpen++);
			Worp worp = new Worp();
			worp.werpUitslag(werpen());
			
		}else {
			System.out.println("worp " + aantalworpen);
		}
	}*/
	
	public int werpen() {
		//enhanced for loop over aantal Dobbelstenen in YahtzeeSpel?
		//controleer blokkeerarray
		
		Random randomDobbel = new Random();
		waarde = 1 + randomDobbel.nextInt(6);
		
		return waarde; 
	}
	
	void setWaarde(int waarde) {
		this.waarde= waarde;
	}
	
	public int getWaarde() {
		return waarde;
	}
}
