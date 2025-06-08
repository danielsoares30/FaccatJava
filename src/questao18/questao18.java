package questao18;

import java.util.Scanner;

public class questao18 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento");
		int anoNascimento = sc.nextInt();
		
		int anoAtual = 2025;
		
		int idade = anoAtual - anoNascimento;
		
		if (idade >= 18) {
			System.out.println("O voto é obrigatório");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("O voto não é obrigatório");
		} else {
			System.out.println("Não pode votar");
		}
	}
}
