package etapa2;

import java.util.Scanner;

public class C08EX09 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, sexo;
        int idade, somaH = 0, somaF = 0, contH = 0, contF = 0, rep;
        double mediaF, mediaH;

        System.out.print("Digite quantas vezes o programa deve se repetir: ");
        rep = teclado.nextInt();
        teclado.nextLine();

        for (int aux = 1; aux < rep; aux++) {
            System.out.println("_______________________");
            System.out.print("Digite seu nome:");
            nome = teclado.nextLine();
            System.out.print("Digite seu sexo: ");
            sexo = teclado.nextLine();
            System.out.print("Digite sua idade: ");
            idade = teclado.nextInt();
            System.out.println("_______________________");
            teclado.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                somaF += idade;
                contF++;
            } else {
                somaH += idade;
                contH++;
            }
        }
        mediaF = (double) somaF / contF;
        mediaH = (double) somaH / contH;

        System.out.printf("Média das idades dos homens = %.2f " +
                "\nMédia das idades das mulheres = %.2f",mediaH,mediaF);
        teclado.close();
    }
}
