package etapa2;

import java.util.Scanner;

public class C08EX07 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade, somaIdade = 0, contCrianca = 0, contAdulto = 0;
        double media;

        for (int aux = 0; aux < 5; aux++) {
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.print("\nDigite sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();

            somaIdade += idade;

            if (idade <= 12) {
                contCrianca++;
            }
            if (idade > 30) {
                contAdulto++;
            }
        }

        media = somaIdade / 5.0;

        System.out.print("\nAlunos que tem até 12 anos: " + contCrianca + "\n");
        System.out.print("Alunos que tem acima de 30 anos: " + contAdulto + "\n");
        System.out.print("Média das idades informadas" + media + "\n");
        teclado.close();
    }
}
