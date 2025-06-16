package questao28;

import java.util.Scanner;

public class questao28 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor1: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o valor2: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o valor3: ");
		int valor3 = sc.nextInt();
		
		if (valor1 > valor2 & valor1 > valor3) {
			System.out.println("O maior valor é: " + valor1);
		} else if ( valor2 > valor1 & valor2 > valor3) {
			System.out.println("O maior valor é: " + valor2);
		} else {
			System.out.println("O maior valor é: " + valor3);
		}
	}

}
