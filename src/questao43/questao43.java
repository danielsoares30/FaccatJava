package questao43;

import java.util.Scanner;

public class questao43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida do lado a do triângulo");
		int a = sc.nextInt();
		System.out.println("Digite a medida do lado b do triângulo");
		int b = sc.nextInt();
		System.out.println("Digite a medida do lado c do triângulo");
		int c = sc.nextInt();
		
		if (a < b + c && b < a + c && c < a + b) {
			if (a == b && b == c) {
				System.out.println("O triângulo é equilátero");
			}
			else if (a == b || a == c || b == c) {
				System.out.println("O triângulo é isósceles");
			}
			else {
			    System.out.println("O triângulo é escaleno");
			}
		}
	}

}
