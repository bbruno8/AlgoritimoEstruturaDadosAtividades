package etapa2;

import java.util.Scanner;

public class C08EX14 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String simbolo;

        System.out.print("Digite um símbolo: ");
        simbolo = teclado.nextLine();

        System.out.print("Digite quantas vezes ele vai se repetir: ");
        n = teclado.nextInt();

        //vai criar as colunas fazendo símbolo repetindo n vezes
        for (int aux = 1; aux <= n; aux++) {
            //vai criar as linhas fazendo símbolo se repetir n vezes
            for (int aux2 = 1; aux2 <= n; aux2++)
                System.out.print(simbolo + "");
            System.out.println();
        }
     teclado.close();
    }
}
