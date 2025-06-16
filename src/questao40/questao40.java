package questao40;

import java.util.Scanner;

public class questao40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nomeProduto = sc.nextLine();
		
		System.out.println("Digite a quantidade do produto: ");
		int quantidadeProduto = sc.nextInt();
		
		System.out.println("Digite o valor do produto: ");
		int valorProduto = sc.nextInt();
		
		double valorTotal = quantidadeProduto * valorProduto;
		
		if (quantidadeProduto <= 5) {
			double valorDesconto = valorTotal * 0.02;
			double totalFinal = valorTotal - valorDesconto;
			System.out.println("O valor total é: " + totalFinal);
		}else if (quantidadeProduto > 5 && quantidadeProduto <= 10) {
			double valorDesconto = valorTotal * 0.03;
			double totalFinal = valorTotal - valorDesconto;
			System.out.println("O valor total é: " + totalFinal);
		}else {
			double valorDesconto = valorTotal * 0.05;
			double totalFinal = valorTotal - valorDesconto;
			System.out.println("O valor total é: " + totalFinal);
		}
	}

}
