package questao11;

import java.util.Scanner;

public class questao11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário fixo do vendedor: ");
		double salarioFixo = sc.nextDouble();
		
		System.out.println("Digite o número de vendas realizadas: ");
		int numeroVendas = sc.nextInt();
		
		System.out.println("Digite o valor total das vendas: ");
		double valorVendas = sc.nextDouble();
		
		System.out.println("Digite o valor da comissão fixa do vendedor: ");
		double comissaoFixa = sc.nextDouble();
		
		double comissaoVendas = 0.05 * valorVendas;
		
		double comissaoTotal = comissaoFixa + comissaoVendas;
		
		double salarioFinal = salarioFixo + comissaoTotal;
		
		System.out.println("O salario final do funcionário é: " + salarioFinal);
		
		
		sc.close();
	}

}
