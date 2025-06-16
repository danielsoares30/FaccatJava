package questao32;

import java.util.Scanner;

public class questao32 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time: ");
		String timeA = sc.nextLine();
		System.out.println("Digite o nome do segundo time: ");
		String timeB = sc.nextLine();
		
		
		System.out.println("Digite a quantidade de gols que o primeiro time fez: ");
		int golsTimeA = sc.nextInt();
		System.out.println("Digite a quantidade de gols que o segundo time fez: ");
		int golsTimeB = sc.nextInt();
		
		
		if (golsTimeA > golsTimeB) {
			System.out.println("O " + timeA + " venceu o " + timeB + " por " + golsTimeA + " a " + golsTimeB);
		}else if (golsTimeB > golsTimeA) {
			System.out.println("O " + timeB + " venceu o " + timeA + " por " + golsTimeB + " a " + golsTimeA);
		}else {
			System.out.println("O " + timeA + " empatou com o " + timeA + " por " + golsTimeA + " a " + golsTimeB);
		}
		
	}

}
