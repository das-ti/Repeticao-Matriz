public class somaMatriz {

	public static void main(String[] args) {

		int[][] m1 = { { 1, 1, 1 }, { 3, 3, 3 }, { 5, 5, 5 } };
		int[][] m2 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] soma = new int[3][3];

		System.out.println("Digite os valores da matriz 1: ");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				soma[l][c] = m1[l][c] + m2[l][c];
			}
		}

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				soma[l][c] = m1[l][c] + m2[l][c];
			}
		}

		System.out.println("Soma das matrizes: ");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(soma[l][c] + " ");
			}
			System.out.println();
		}
	}
}
