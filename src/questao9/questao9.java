package questao9;

import java.util.Scanner;

public class questao9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário atual do funcionário: ");
		double salarioAtual = sc.nextDouble();
		
		System.out.println("Digite a porcentagem do reajuste salarial do funcionário: ");
		double percReajuste = sc.nextDouble();
		
		double salarioNovo = salarioAtual + (salarioAtual * percReajuste) / 100;
		
		System.out.println("O novo salario do funcionário é: " + salarioNovo);
		
		sc.close();
	}

}
