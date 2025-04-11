package etapa1;

import java.util.Scanner;

public class C05EX09 {
    //Bruno Constantino Gomes da Costa


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.print("Digite a nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a nota 2: ");
        nota2 = teclado.nextDouble();
        System.out.print("Digite a nota 3: ");
        nota3 = teclado.nextDouble();

        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

        System.out.print("A media ponderada é " + media);

        teclado.close();
    }
}
