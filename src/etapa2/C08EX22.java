package etapa2;

import java.util.Scanner;

public class C08EX22 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, cont = 0;

        System.out.print("Digite um número inteiro :");
        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println(numero + " é um número primo!");
        } else {
            System.out.println(numero + " NÃO é um número primo.");
        }

    }
}
