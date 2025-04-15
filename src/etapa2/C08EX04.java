package etapa2;

import java.util.Scanner;

public class C08EX04 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade, cont = 0;
        String nome;

        for (int aux = 0; aux < 50; aux++) {
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite sua idade: ");
            idade = teclado.nextInt();

            System.out.println("Nome: " + nome + " Idade: " + idade);
            if (idade <= 18) {
                cont++;
            }
            teclado.nextLine();
        }
        System.out.print("Até 18 tem " + cont + " alunos e acima de 18 tem " + (50 - cont));
        teclado.close();
    }
}
