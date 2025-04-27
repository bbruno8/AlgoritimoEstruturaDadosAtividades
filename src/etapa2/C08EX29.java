package etapa2;

import java.util.Scanner;

public class C08EX29 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        int X = teclado.nextInt();
        System.out.print("Digite o valor de Y: ");
        int Y = teclado.nextInt();
        int resultado = 1;
        for (int i = 1; i <= Y; i++) {
            resultado *= X;
        }
        System.out.println("O resultado de " + X + " elevado a " + Y + " é: " + resultado);
    }
}
