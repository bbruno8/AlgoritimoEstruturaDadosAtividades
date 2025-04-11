package etapa1;

import java.util.Scanner;

public class C06EX02 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        double quantPoluente, valorMulta;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de poluente emitida: ");
        quantPoluente = teclado.nextDouble();

        System.out.print("Quantidade de poluente emitido:" + quantPoluente);

        if (quantPoluente < 1500) {
            valorMulta = 0;
        } else if (quantPoluente < 3500) {
            valorMulta = 3000;
        } else {
            valorMulta = 50000 * quantPoluente;
        }
        System.out.printf("Quantidade de poluentes emitida: " + quantPoluente +
                "\n Valor da multa: R$ %.2f", valorMulta);
        teclado.close();

    }
}
