package mypackage;

class Application {

	
	// Das ist ein Kommentar

	// "Main Methode" Startpunkt der Anwendung
	// Shortcut Autovervollständigung: main eingeben -> STRG+LEERTASTE
	public static void main(String args[]) {

		// Befehl um Zeichenketten in der Konsole ausgeben zu lassen

		// String (Zeichenkette)

		String zeichenkette = "Hallo Welt";

		// H|a|l|l|o

//		Das geht auch
//		String zeichenkette;
//		zeichenkette = "Hallo Welt";

//		System.out.println(zeichenkette + " !!");

		// Integer

		int zahl = 1;

		int zweiteZahl = zahl + 5; // sysout -> STRG-LEERTASTE = System.out.println()
//		System.out.println(zweiteZahl + zahl + zeichenkette);

		// char

		char buchstabe = 'a';
		char buchstabe1 = 65;

//		System.out.println(buchstabe1);

		// Java ist streng typisiert. Vermischen von Datentypen nicht ohne weiteres
		// möglich
//		int y = zeichenkette + buchstabe;

		// double
		double double1 = 24.1D;

		// float
		float float1 = 25.2F;

		// boolean true false
		boolean meinBoolean = true;

//		System.out.println(meinBoolean);

		int meinInt = 4;
		
		
		//Zum vergleichen benutzt man == und zum zuweisen von variablen benutzt man =

		
		//if statement
		if(meinInt == 4) {
			System.out.println();
		}
			
		
		//if-else block
		if (meinInt == 5) {
			System.out.println("Das war wahr!");
		} else {
			System.out.println("Das war falsch!");
		} 
		
		 		
		//if-else-if block
		
		boolean meinBoolean2 = false;
		
		if (meinBoolean2 == true) {
			System.out.println("Das war wahr");
		} else if (5+5 == 11){
			System.out.println("Die aussage im ersten if block war falsch. Und nach dem else statement kam eine wahre Aussage!");
		} else if (2+2 == 4) {
			
		}
		
	
		

	}
	
	
}
