package questao17;

import java.util.Scanner;

public class questao17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("Aluno aprovado com a media: " + media);
		}else {
			System.out.println("Aluno reprovado com a media: " + media);
		}
		sc.close();
	}

}
