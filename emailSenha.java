import java.util.Scanner;

public class emailSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String login, senha;
		boolean acesso = false;
		String[][] matrizLogin = {
			    {"joao@gmail.com", "abc123"},
			    {"maria@hotmail.com", "abc456"},
			    {"carla@yahoo.com", "abc789"},
			    {"rafael@outlook.com", "abc321"},
			    {"andrea@gmail.com", "abc654"},
			    {"marcos@gmail.com", "abc789"}
			};
		
		do {
			System.out.println("Digite seu Login: ");
			login = sc.nextLine();
			System.out.println("Digite sua senha: ");
			senha = sc.nextLine();
			
			for(int l = 0; l < 6; l++) {
				if(login.equals(matrizLogin[l][0])&&senha.equals(matrizLogin[l][0])) {
					acesso = true;
					break;
				}
			}
		}while(acesso=false);
		
		System.out.println("Acesso liberado.");
		
		sc.close();		
	}
}
