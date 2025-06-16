package questao30;

import java.util.Scanner;

public class questao30 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor1: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o valor2: ");
		int valor2 = sc.nextInt();
		System.out.println("Digite o valor3: ");
		int valor3 = sc.nextInt();
		
		if (valor1 < valor2 & valor2 < valor3 ) {
			System.out.println("A ordem crescente é: " + valor1 + ", " + valor2 + ", " + valor3);
		}else if (valor1 < valor3 & valor3 < valor2) {
			System.out.println("A ordem crescente é: " + valor1 + ", " + valor3 + ", " + valor2);
		}else if ( valor2 < valor1 & valor1 < valor3) {
			System.out.println("A ordem crescente é: " + valor2 + ", " + valor1 + ", " + valor3);
		}else if (valor2 < valor3 & valor3 < valor1) {
			System.out.println("A ordem crescente é: " + valor2 + ", " + valor3 + ", " + valor1);
		}else if (valor3 < valor1 & valor1 < valor2) {
			System.out.println("A ordem crescente é: " + valor3 + ", " + valor1 + ", " + valor2);
		}else {
			System.out.println("A ordem crescente é: " + valor3 + ", " + valor2 + ", " + valor1);
		}
}
}
