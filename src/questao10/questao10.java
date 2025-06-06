package questao10;

import java.util.Scanner;

public class questao10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do automóvel: ");
		double custoFabrica = sc.nextDouble();
		
		double distribuidor = 0.28 * custoFabrica; 
		double impostos = 0.45 * custoFabrica;
		
		double custoConsumidor = custoFabrica + distribuidor + impostos;
		
		System.out.println("O custo total para o consumidor é: " + custoConsumidor);
	}

}
