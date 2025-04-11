package etapa1;

import java.util.Scanner;

public class C06EX03 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        double salario, vendas, salarioFixo;
        Scanner teclado = new Scanner(System.in);
        salarioFixo = 240.00;

        System.out.print("Digite o valor em vendas: ");
        vendas = teclado.nextDouble();

        if (vendas < 1000) {
            salario = salarioFixo;
        } else if (vendas < 10000) {
            salario = vendas * 0.1 + salarioFixo;
        } else {
            salario = salarioFixo + 1000;
        }
        System.out.printf("Seu salário em março foi de: R$%.2f", salario);

        teclado.close();
    }
}
