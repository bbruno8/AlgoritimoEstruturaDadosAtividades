package etapa2;

import java.util.Scanner;

public class C08EX02 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int faltas, notaFinal;

        for (int aux = 1; aux <= 50; aux++) {
            System.out.print("Digite sua nota final: ");
            notaFinal = teclado.nextInt();
            if (notaFinal <= -1) {
                break;
            }
            System.out.print("Digite suas faltas:");
            faltas = teclado.nextInt();

            if (notaFinal >= 65 && faltas > 16) {
                System.out.println("Você foi aprovado!" +
                        "\nNota =" + notaFinal + "Faltas: " + faltas);
            } else {
                System.out.println("\nVocê foi reprovado." +
                        "\nNota =" + notaFinal + "Faltas: " + faltas + "\n");
            }
        }
        teclado.close();
    }
}
