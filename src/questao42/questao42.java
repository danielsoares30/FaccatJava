package questao42;

import java.util.Scanner;

public class questao42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do empregado: ");
		String codigo = sc.nextLine();
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		System.out.println("Digite o ano de ingresso na empresa do empregado: ");
		int anoIngresso = sc.nextInt();
		
		int idade = 2025 - anoNascimento;
		int tempoServico = 2025 - anoIngresso;
		
		if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
			System.out.println("O empregado " + codigo + " pode se aposentar.");
		}else {
			System.out.println("O empregado " + codigo + " não pode se aposentar.");
		}
		
		
	}

}
