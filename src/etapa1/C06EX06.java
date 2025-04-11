package etapa1;

import java.util.Scanner;

public class C06EX06 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, delta, raiz1, raiz2;

        System.out.print("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble();

        delta = b * b - 4 * a * c;
        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        if (delta > 0) {
            System.out.print("Teremos 2 raízes = " + raiz1 + " e " + raiz2);
        } else if (delta == 0) {
            System.out.print("Teremos uma raiz = " + raiz2);
        } else {
            System.out.print("Não teremos raizes");
        }
        teclado.close();
    }
}
