package etapa1;

import java.util.Scanner;

public class C05EX06 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pontoA, pontoB, pontoC, retaX, retaY, R, distancia;

        System.out.print("Digite o valor do ponto A: ");
        pontoA = teclado.nextDouble();
        System.out.print("Digite o valor do ponto B: ");
        pontoB = teclado.nextDouble();
        System.out.print("Digite o valor do ponto C: ");
        pontoC = teclado.nextDouble();
        System.out.print("Digite o valor da reta X: ");
        retaX = teclado.nextDouble();
        System.out.print("Digite o valor da reta Y: ");
        retaY = teclado.nextDouble();

        R = (pontoA * retaX) + (pontoB * retaY) + pontoC;
        distancia = R / Math.sqrt(Math.pow(pontoA, 2) + Math.pow(pontoB, 2));

        System.out.print("Distancia é igual = " + distancia);

        teclado.close();
    }
}
