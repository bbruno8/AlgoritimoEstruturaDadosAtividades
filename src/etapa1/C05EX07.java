package etapa1;

import java.util.Scanner;

public class C05EX07 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double fX, valorX;

        System.out.print("Digite o valor de X: ");
        valorX = teclado.nextDouble();

        fX = Math.sqrt(Math.pow(valorX / 4.0 + 1, 2) + 1 / 5.0 * valorX);
        System.out.print("Valor de F(X)= " + fX);

        teclado.close();
    }
}
