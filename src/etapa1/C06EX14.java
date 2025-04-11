package etapa1;

import java.util.Scanner;

public class C06EX14 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, n1, n2, n3, n4;

        System.out.print("Digite um numero de 4 digitos: ");
        num = teclado.nextInt();

        //verifica se o numero tem 4 digitos
        if (num < 999 || num > 9999) {
            System.out.print("O número tem que ter 4 dígitos.");
        }
        n1 = num % 10; //numero 4/4
        n2 = num % 100 / 10;//numero 3/4
        n3 = num % 1000 / 100;//numero 2/4
        n4 = num / 1000;//numero 1/4


        System.out.print("Resultado = " + n1 + n2 + n3 + n4);
        teclado.close();
    }
}
