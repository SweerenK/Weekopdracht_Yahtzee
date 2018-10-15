package weekopdracht_yahtzee;

public class Worp {
	int[] worpUitslag = new int[5];
	StringBuilder worpOutput = new StringBuilder();
	
	void werpUitslag(int uitslag) {
		for(int i = 0; i < worpUitslag.length ; i++) {
			worpUitslag[i] = uitslag;
		}
	}
	
	void setWorpuitslag(int index, int uitslag) {
		worpUitslag[index] = uitslag; 
	}
	
	StringBuilder getWorpUitslag() {
		worpOutput.setLength(0);
		for(int x : worpUitslag) {
			worpOutput.append(x + "\t");
		}
		return worpOutput;
	}
	
}



