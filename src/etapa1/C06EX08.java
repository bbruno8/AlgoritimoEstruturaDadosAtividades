package etapa1;

import java.util.Scanner;


public class C06EX08 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double altura, pesoMin, pesoMax, icmMin, icmMax;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite suaaltura(em metros): ");
        altura = teclado.nextDouble();

        icmMax = 25;
        icmMin = 20;

        pesoMin = icmMin * (altura * altura);
        pesoMax = icmMax * (altura * altura);

        System.out.print("Olá" + nome);
        System.out.printf("\nSua altura é %.2f", altura);
        System.out.printf("\nO peso miníno para sua altura é %.2f e o peso maximo é %.2f", pesoMin, pesoMax);

        teclado.close();
    }
}
