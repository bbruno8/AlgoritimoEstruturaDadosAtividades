package etapa2;

import java.util.Scanner;

public class C08EX01 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        double raio, pi, area;
        pi = 3.1416;
        Scanner teclado = new Scanner(System.in);
        for (int aux = 1; aux <= 10; aux++) {
            System.out.print("Digite o valor do raio: ");
            raio = teclado.nextDouble();

            area = pi * Math.pow(raio, 2);

            System.out.println("Raio = " + raio + " Área = " + area + "\n");
        }
        teclado.close();
    }
}
