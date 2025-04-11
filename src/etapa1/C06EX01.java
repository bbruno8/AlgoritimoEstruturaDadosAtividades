package etapa1;

import java.util.Scanner;

public class C06EX01 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x, fx;

        System.out.print("Digite o valor de f(X) = ");
        x = teclado.nextDouble();

        if (x < 4) {
            fx = (5 * x + 3) / Math.sqrt(16.0 - Math.pow(x, 2));
            System.out.print("f(x)= " + fx);
        } else if (x == 4) {
            fx = 0;
            System.out.print("f(x)= " + fx);
        } else {
            fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16.0);
            System.out.print("f(x)= " + fx);
        }
        teclado.close();
    }
}
