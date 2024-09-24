package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        // Sjekk om tabellen er tom
        if (tabell == null || tabell.length == 0) {
            System.out.println("Tabellen er tom.");
            return;
        }
        
        // Iterer gjennom arrayet og skriv ut elementene
        for (int i = 0; i < tabell.length; i++) {
            // Skriv ut elementet, men uten komma etter siste element
            if (i == tabell.length - 1) {
                System.out.print(tabell[i]);
            } else {
                System.out.print(tabell[i] + ", ");
            }
        }
        
        // Gå til neste linje etter at arrayet er skrevet ut
        System.out.println();
		
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
