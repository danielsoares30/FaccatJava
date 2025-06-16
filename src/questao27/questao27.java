package questao27;

import java.util.Scanner;

public class questao27 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		
		if(numero > 0) {
			System.out.println("Número positivo");
		} else if(numero == 0) {
			System.out.println("Número igual a zero");
		}else {
			System.out.println("Número negativo");
		}
		sc.close();
	}

}
