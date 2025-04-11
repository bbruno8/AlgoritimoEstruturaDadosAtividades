package etapa1;

import java.util.Scanner;

public class C06EX05 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resto5, resto7, resultado;

        System.out.print("Digite um número inteiro: ");
        numero = teclado.nextInt();

        resto5 = numero % 5;
        resto7 = numero % 7;

        if (resto5 == 0 && resto7 == 0) {
            System.out.print("O número " + numero + " é divisivel por 5 e 7!");
        } else {
            System.out.print("O número " + numero + " não é divisivel por 5 e 7.");
        }
        teclado.close();
    }
}
