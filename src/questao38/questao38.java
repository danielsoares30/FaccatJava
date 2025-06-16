package questao38;

import java.util.Scanner;

public class questao38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		System.out.println("Insira o código do usuário");
		int codigo = sc.nextInt();
		
		if (codigo == 1234) {
			System.out.println("Digite a senha do usuário");
			 senha = sc.nextInt();
		}else {
			System.out.println("Código inválido");
		}
		if (senha == 9999) {
			System.out.println("Acesso permitido");
		}else {
			System.out.println("Senha inválida");
		}
		
		
	}
}
