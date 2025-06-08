package questao21;

import java.util.Scanner;

public class questao21 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite que horas começou a partida: ");
		int inicioJogo = sc.nextInt();
		
		System.out.println("Digite o horário que terminou a partida: ");
		int fimJogo = sc.nextInt();
		
		int duracaoJogo = fimJogo - inicioJogo;
		
		if (duracaoJogo < 0) {
			duracaoJogo = duracaoJogo + 24;
		}
		System.out.println(duracaoJogo + ":00 de jogo");
		
	}

}
