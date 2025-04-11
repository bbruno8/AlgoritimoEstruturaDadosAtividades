package etapa1;

import java.util.Scanner;

public class C06EX07 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, plBruto, plLiquido, impostoRenda;

        System.out.print("Digite seu salário: ");
        salario = teclado.nextDouble();

        if (salario < 300) {
            plBruto = (salario * 0.7) + 500;
        } else if (salario < 1000) {
            plBruto = (salario * 0.5) + 200;
        } else {
            plBruto = salario * 0.3;
        }

        impostoRenda = 0.25 * plBruto;
        plLiquido = plBruto - impostoRenda;

        System.out.printf("O seu salário é R$ %.2f valor da participação de lucros é R$ %.2f",
                salario, plLiquido);

        teclado.close();
    }
}
