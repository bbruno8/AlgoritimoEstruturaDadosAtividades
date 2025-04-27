package etapa2;

import java.util.Scanner;

public class C08EX18 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, tabuada;
        System.out.print("Digite um número interio para gerar a tabuada: ");
        numero = teclado.nextInt();
        for (int i = 1; i <= 9; i++) {
            tabuada = numero * i;
            System.out.println(numero + "x" + i + "=" + tabuada);
        }

    }
}
