import java.util.Scanner;

public class transpMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] palavras = new String[3][3];
		String[][] transposta = new String[3][3];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Digite uma palavra: ");
				palavras[l][c] = sc.nextLine();
				transposta[c][l] = palavras[l][c];				
			}
		}
		
		System.out.println();
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(palavras[l][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(transposta[l][c]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}  
