package questao22;

import java.util.Scanner;

public class questao22 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas você trabalhou no mês?");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Qual o valor da sua hora de trabalho?");
		int salarioHora = sc.nextInt();
		
		double salarioTotal;
		
		if (horasTrabalhadas > 160) {
			int horasExtras = horasTrabalhadas - 160;
			double valorHoraExtra = salarioHora * 1.5;
			salarioTotal = (160 * salarioHora) + (horasExtras + valorHoraExtra);
		} else {
			salarioTotal = horasTrabalhadas * salarioHora;
		}
		System.out.println("O seu salário total é: R$ " + salarioTotal);
		
		
	}

}
