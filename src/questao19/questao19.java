package questao19;

import java.util.Scanner;

public class questao19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O " + numero1 + " é maior que o " + numero2 );
		} else if (numero1 == numero2) { 
			System.out.println("Os dois número são iguais");
		}else {
			System.out.println("O " + numero2 + " é maior que o " + numero1 );
		}
	}
}
