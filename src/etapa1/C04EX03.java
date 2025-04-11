package etapa1;

import java.util.Scanner;

public class C04EX03 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long minPoluente, maxPoluente;
        float multa1, multa2, multa3;

        System.out.println("Minímo poluente: ");
        minPoluente = teclado.nextLong();
        System.out.println("Máximo poluente: ");
        maxPoluente = teclado.nextLong();
        System.out.println("Valor da multa 1: ");
        multa1 = teclado.nextFloat();
        System.out.println("Valor da multa 2: ");
        multa2 = teclado.nextFloat();
        System.out.println("Valor da multa 3: ");
        multa3 = teclado.nextFloat();

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");//70
        System.out.println("          Quantidade de Poluente Emitido x Valor da Multa");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");//70
        System.out.println("Até " + minPoluente + " multa de R$" + multa1);
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");//70
        System.out.println("Entre " + minPoluente + " e " + maxPoluente + " multa de R$" + multa2);
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");//70
        System.out.println("Acima de  " + maxPoluente + " multa de R$" + multa3 + " por poluente emitido.");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");//70

        teclado.close();
    }

}
