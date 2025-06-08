package questao23;

import java.util.Scanner;

public class questao23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o seu sexo (M para masculino / F para feminino):");
        String sexo = sc.nextLine();

        System.out.println("Digite sua altura em metros (ex: 1.75):");
        float altura = sc.nextFloat();

        if (sexo.equalsIgnoreCase("M")) {
            float pesoIdeal = (float) ((72.7 * altura) - 58);
            System.out.println(nome + ", seu peso ideal é: " + pesoIdeal + " kg");
        } else if (sexo.equalsIgnoreCase("F")) {
            float pesoIdeal = (float) ((62.1 * altura) - 44.7);
            System.out.println(nome + ", seu peso ideal é: " + pesoIdeal + " kg");
        } else {
            System.out.println("Sexo inválido. Por favor, digite M ou F.");
        }

        sc.close();
    }
}
