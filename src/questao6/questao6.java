package questao6;

import java.util.Scanner;

public class questao6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Área do retângulo");
		
		System.out.println("Digite a base do retângulo: ");
		int base = sc.nextInt();
		
		System.out.println("Digite a altura do retângulo: ");
		int altura = sc.nextInt();
		
		
		int area = base * altura;
		
		System.out.println("A área do retângulo é: " + area);
		
		sc.close();
	}
	
	

}
