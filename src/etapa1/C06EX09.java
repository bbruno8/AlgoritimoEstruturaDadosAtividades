package etapa1;

import java.util.Scanner;

public class C06EX09 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sexo;
        double pesoIdeal, altura;

        System.out.print("Digite seu sexo usando F para feminino e M para masculino: ");
        sexo = teclado.nextLine();
        System.out.print("Digite sua altura em metros: ");
        altura = teclado.nextDouble();

        if (sexo.equalsIgnoreCase("m")) {
            pesoIdeal = 72.7 * altura - 58.0;
        } else {
            pesoIdeal = 62.1 * altura - 44.7;
        }

        System.out.print("Seu sexo é (" + sexo + ") sua altura " + altura);
        System.out.printf("\nSeu peso ideal é %.3f", pesoIdeal);
        teclado.close();
    }

}

