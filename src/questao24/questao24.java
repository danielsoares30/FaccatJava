package questao24;

import java.util.Scanner;

public class questao24 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário fixo do vendedor: ");
		int salarioFixo = sc.nextInt();
		System.out.println("Digite o valor total das vendas:");
		int valorVendas = sc.nextInt();
		
		if (valorVendas <= 1500) {
			double comissao = valorVendas * 0.03;
			double salarioTotal = salarioFixo + comissao;
			System.out.println("O salário total do vendedor é: " + salarioTotal);
		} else {
			double comissao = valorVendas * 0.05;
			double salarioTotal = salarioFixo + comissao;
			System.out.println("O salário total do vendedor é: " + salarioTotal);
		}
	}

}
