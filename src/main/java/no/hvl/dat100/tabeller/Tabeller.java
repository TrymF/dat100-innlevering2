package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        if (tabell == null || tabell.length == 0) {
            System.out.println("Tabellen er tom.");
            return;
        }
        
        for (int i = 0; i < tabell.length; i++) {
            if (i == tabell.length - 1) {
                System.out.print(tabell[i]);
            } else {
                System.out.print(tabell[i] + ", ");
            }
        }
        
        System.out.println();
		
	}

	// b)
	public static String tilStreng(int[] tabell) {
        if (tabell == null || tabell.length == 0) {
            return "[]";
        }

        StringBuilder resultat = new StringBuilder("[");
        
        for (int i = 0; i < tabell.length; i++) {
            resultat.append(tabell[i]); 
            if (i < tabell.length - 1) {
                resultat.append(",");    
            }
        }
        
        resultat.append("]");
        
        return resultat.toString();
	}

	// c)
	public static int summer(int[] tabell) {
        if (tabell == null) {
            return 0;
        }
        int sum = 0;
        for (int tall : tabell) {
            sum += tall;  
        }
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        if (tabell == null || tabell.length == 0) {
            return false;
        }
        for (int element : tabell) {
            if (element == tall) { 
                return true;
            }
        }
        return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        if (tabell == null || tabell.length == 0) {
            return -1;
        }
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
        if (tabell == null || tabell.length == 0) {
            return new int[0]; 
        }
        int[] reversertTabell = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            reversertTabell[i] = tabell[tabell.length - 1 - i];
        }
        return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
        if (tabell == null || tabell.length < 2) {
            return true; 
        }
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) { 
                return false; 
            }
        }
        return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        if (tabell1 == null && tabell2 == null) {
            return new int[0];
        }
        if (tabell1 == null) {
            tabell1 = new int[0];
        }
        if (tabell2 == null) {
            tabell2 = new int[0];
        }
        int[] sammensattTabell = new int[tabell1.length + tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {
            sammensattTabell[i] = tabell1[i];
        }
        for (int i = 0; i < tabell2.length; i++) {
            sammensattTabell[tabell1.length + i] = tabell2[i];
        }
        return sammensattTabell;
	}
}
