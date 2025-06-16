package questao36;

import java.util.Scanner;

public class questao36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade do primeiro homem: ");
		int idadeHomem1 = sc.nextInt();
		System.out.println("Digite a idade do segundo homem: ");
		int idadeHomem2 = sc.nextInt();
		System.out.println("Digite a idade da primeira mulher: ");
		int idadeMulher1 = sc.nextInt();
		System.out.println("Digite a idade da segunda mulher: ");
		int idadeMulher2 = sc.nextInt();
		
		if (idadeHomem1 > idadeHomem2 & idadeMulher1 > idadeMulher2) {
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (idadeHomem1 + idadeMulher2));
			System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + idadeHomem2 * idadeMulher1);
		}else if (idadeHomem1 > idadeHomem2 & idadeMulher1 < idadeMulher2) {
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (idadeHomem1 + idadeMulher1));
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (idadeHomem2 + idadeMulher2));
		}else if (idadeHomem1 < idadeHomem2 & idadeMulher1 > idadeMulher2) {
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (idadeHomem2 + idadeMulher2));
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (idadeHomem1 + idadeMulher1));
		}else {
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (idadeHomem2 + idadeMulher1));
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + (idadeHomem1 + idadeMulher2));
		}
	}
}
