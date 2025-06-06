package questao7;

import java.util.Scanner;

public class questao7 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade em dias...");
		System.out.println("Digite a sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Digite os meses que passaram do seu ultimo aniversário");
		int meses = sc.nextInt();
		
		System.out.println("Digite quantos dias faltam para terminar o mês atual: ");
		int dias = sc.nextInt();
		
		int idadeDias = (idade * 365) + (meses * 30) + dias;
		
		System.out.println("A sua idade em dias é: " + idadeDias);
	}
}
