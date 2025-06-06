package questao8;

import java.util.Scanner;

public class questao8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores: ");
        int totalEleitores = sc.nextInt();

        System.out.println("Digite o número total de votos brancos: ");
        int votosBrancos = sc.nextInt();

        System.out.println("Digite o número total de votos nulos: ");
        int votosNulos = sc.nextInt();

        System.out.println("Digite o número total de votos válidos: ");
        int votosValidos = sc.nextInt();

        // Conversão para float para evitar divisão inteira
        float percBrancos = ((float) votosBrancos / totalEleitores) * 100;
        float percNulos = ((float) votosNulos / totalEleitores) * 100;
        float percValidos = ((float) votosValidos / totalEleitores) * 100;

        System.out.println("Percentual de votos em brancos: " + percBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos válidos: " + percValidos + "%");

        sc.close(); // boa prática: fechar o Scanner
    }
}
