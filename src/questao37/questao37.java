package questao37;

import java.util.Scanner;

public class questao37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos kilos de maçãs foram adquiridas? ");
		float kgMaca = sc.nextFloat();
		System.out.println("Quantos kilos de morangos foram adquiridas? ");
		float kgMorango = sc.nextFloat();
		
		double precoMaca = 0.0;
		double precoMorango = 0.0;
		
		if (kgMaca <= 5) {
			precoMaca = 1.80;
		}else {
			precoMaca = 1.50;
		}
		if (kgMorango <= 5) {
			precoMorango = 2.50;
		}else {
			precoMorango = 2.20;
		}
		
		double valorTotal = (kgMaca * precoMaca) + (kgMorango * precoMorango);
		
		if((kgMaca + kgMorango) > 8 || valorTotal > 25){
			double desconto = valorTotal * 0.10;
			valorTotal = valorTotal - desconto;
		}
		
		System.out.println("O valor a ser pago: R$ " + valorTotal);
	}

}
