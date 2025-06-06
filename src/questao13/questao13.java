package questao13;

import java.util.Scanner;

public class questao13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		double nota3 = sc.nextDouble();
		
		double mediaFinal = ((nota1 * 2) + (nota2 * 3) + ( nota3 * 5)) / 10;
		
		System.out.println("A média final do aluno é:  " + mediaFinal);
	}

}
