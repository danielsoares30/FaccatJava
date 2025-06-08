package questao26;

import java.util.Scanner;

public class questao26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade máxima em estoque");
		int quantidadeMaxima = sc.nextInt();
		System.out.println("Digite a quantidade mínima em estoque");
		int quantidadeMinima = sc.nextInt();
		System.out.println("Digite a quantidade atual em estoque:");
		int quantidadeAtual = sc.nextInt();
		
		int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
		
		if (quantidadeAtual >= quantidadeMaxima) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		}
	}

}
