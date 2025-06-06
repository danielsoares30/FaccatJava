package questao16;

import java.util.Scanner;

public class questao16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de maçãs vendidas: ");
        int macasVendidas = sc.nextInt();
        
        double valorTotal;
        if (macasVendidas >= 12) {
            valorTotal = macasVendidas * 1.00;
        } else {
            valorTotal = macasVendidas * 1.30;
        }

        System.out.println("O valor total a ser pago é: R$ " + valorTotal);
        
        sc.close();
    }
}
