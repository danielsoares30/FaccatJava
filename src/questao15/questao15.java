package questao15;

import java.util.Scanner;

public class questao15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
		sc.close();
	}

}
