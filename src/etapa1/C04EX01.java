package etapa1;

import java.util.Scanner;

public class C04EX01 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        String primeiroNome, nomeMeio, sobrenome;
        byte idade;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        primeiroNome = teclado.nextLine();
        System.out.print("Digite seu nome do meio: ");
        nomeMeio = teclado.nextLine();
        System.out.print("Digite seu último nome: ");
        sobrenome = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        idade = teclado.nextByte();

        System.out.println();
        System.out.print(sobrenome + ", ");
        System.out.print(primeiroNome + " " + nomeMeio);
        System.out.println();
        System.out.println("Idade: " + idade + " anos.");

        teclado.close();
    }
}
