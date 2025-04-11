package etapa1;

import java.util.Scanner;

public class C05EX08 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double S, angulo, pi, raio, raio2;

        System.out.print("Digite o valor de S(area e um setor circular): ");
        S = teclado.nextDouble();
        System.out.print("Digite o valor do ângulo: ");
        angulo = teclado.nextDouble();

        pi = 3.1416;

        raio = (S * 360) / (angulo * pi);
        raio2 = Math.sqrt(raio);

        System.out.print("Valor do raio = " + raio2);

        teclado.close();
    }
}
