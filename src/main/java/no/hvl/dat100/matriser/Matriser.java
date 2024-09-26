package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] matrise = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		skrivUt(matrise);

		String resultat = tilStreng(matrise);
		System.out.println(resultat);

		int[][] skalertMat = skaler(2, matrise);
		for (int[] rad : skalertMat) {
			for (int element : rad) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {
				System.out.print(matrise[rad][kol] + " ");
			}
			System.out.println();
			/*
			 * for (int[] rad : matrise) { for (int element : rad) {
			 * System.out.print(element + " "); } System.out.println();
			 */
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder streng = new StringBuilder();

		for (int[] rad : matrise) {
			for (int element : rad) {
				streng.append(element).append(" ");
			}
			streng.append("\n");
		}

		return streng.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMat = new int[matrise.length][matrise[0].length];

		for (int rad = 0; rad < matrise.length; rad++) {
			for (int kol = 0; kol < matrise[rad].length; kol++) {

				nyMat[rad][kol] = matrise[rad][kol] * tall;
			}
		}

		return nyMat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
