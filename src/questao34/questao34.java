package questao34;

import java.util.Scanner;

public class questao34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int y = sc.nextInt();
		
		int z = (x * y) + 5;
		
		if ( z < 0) {
			System.out.println("A");
		} else if ( z <= 100) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}

}
