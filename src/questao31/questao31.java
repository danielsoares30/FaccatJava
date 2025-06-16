package questao31;

import java.util.Scanner;

public class questao31 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro lado do triângulo: ");
		int lado1 = sc.nextInt();
		
		System.out.println("Digite o valor do segundo lado do triângulo: ");
		int lado2 = sc.nextInt();
		
		System.out.println("Digite o valor do terceiro lado do triângulo: ");
		int lado3 = sc.nextInt();
		
		if (lado1 < lado2 + lado3 & lado2 < lado1 + lado3 & lado3 < lado1 + lado2) {
			System.out.println("Os lados formam um triângulo.");
		}else {
			System.out.println("Os lados não formam um triângulo.");
		}
	}

}
