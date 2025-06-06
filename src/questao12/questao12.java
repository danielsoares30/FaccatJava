package questao12;

import java.util.Scanner;

public class questao12 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		float fahrenheit = sc.nextFloat();
		
		double celsius = (5f / 9) * (fahrenheit - 32);
		
		System.out.println("A conversão dessa temperatura em celsius é: " + celsius + " °C");
		
		sc.close();
	}
}
