package etapa1;

import java.util.Scanner;

public class C03EX02 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        long n1, n2, n3, soma;
        double media;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        n1 = teclado.nextLong();
        System.out.print("Informe um número: ");
        n2 = teclado.nextLong();
        System.out.print("Informe um número: ");
        n3 = teclado.nextLong();

        soma = n1 + n2 + n3;
        //Calculo da media
        media = soma / 3.0;

        System.out.print("Média = " + media);

        teclado.close();
    }
}
