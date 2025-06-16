package questao41;

import java.util.Scanner;

public class questao41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();
        System.out.println("Digite a média dos exercícios: ");
        float mediaExercicios = sc.nextFloat();
        
        float media = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;
        
        if (media >= 9) {
            System.out.println("Nota A");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("Nota B");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("Nota C");
        } else {
            System.out.println("Nota D");
        }

        sc.close();
    }
}
