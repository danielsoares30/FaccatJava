package questao25;

import java.util.Scanner;

public class questao25 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta:");
		String numeroConta = sc.next();
		System.out.println("Digite o saldo da conta:");
		double saldo = sc.nextDouble();
		System.out.println("Digite o valor do débito:");
		double debito = sc.nextDouble();
		System.out.println("Digite o valor do crédito:");
		double credito = sc.nextDouble();
		
		double saldoAtual = saldo - debito + credito;
		
		if (saldoAtual < 0) {
			System.out.println("Saldo negativo");
		} else {
			System.out.println("Saldo positivo");
		}
	}
}
