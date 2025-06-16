package questao35;

import java.util.Scanner;

public class questao35 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos litros de combustível foram vendidos?");
        int litrosVendidos = sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("Qual o tipo de combustível? (A para álcool e G para gasolina)");
        String tipoCombustivel = sc.nextLine();
        
        double preco = 0.0;
        double desconto = 0.0;
        boolean tipoValido = true;
        
        if (tipoCombustivel.equalsIgnoreCase("A")) {
            preco = 2.90;
            if (litrosVendidos <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipoCombustivel.equalsIgnoreCase("G")) {
            preco = 3.30;
            if (litrosVendidos <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível errado!");
            tipoValido = false;
        }
        
        if (tipoValido) {
            double valorBruto = litrosVendidos * preco;
            double valorDesconto = valorBruto * desconto;
            double valorTotal = valorBruto - valorDesconto;
            
            System.out.printf("Valor total a pagar: R$ %.2f\n", valorTotal);
        }
        
        sc.close();
    }
}

