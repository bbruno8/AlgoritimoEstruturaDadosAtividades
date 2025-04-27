package etapa2;

import java.util.Scanner;

public class C08EX15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, cargo, nomeMaiorSalario = "", cargoMaiorSalario = "";
        double salario, somaSalarios18 = 0, maiorSalario = 0;
        int idade, contMedia = 0, contSenior = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();
            System.out.print("Digite seu cargo: ");
            cargo = teclado.nextLine();
            System.out.print("Digite seu salário: ");
            salario = teclado.nextDouble();
            System.out.print("Digite sua idade: ");
            idade = teclado.nextInt();
            teclado.nextLine();

            if (salario > 10000 && idade > 50) {
                System.out.println(nome + " é SÊNIOR.");
                contSenior++;
            }
            if (idade <= 18) {
                somaSalarios18 += salario;
                contMedia++;
            }
            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
                cargoMaiorSalario = cargo;
            }
        }


        if (contMedia > 0) {
            double mediaSalarios18 = somaSalarios18 / contMedia;
            System.out.printf("Média dos salários dos funcionários com até 18 anos: R$ %.2f%n", mediaSalarios18);
        }
        System.out.println("\nNúmero de funcionários SÊNIOR: " + contSenior);

        System.out.println("Funcionário com maior salário: ");
        System.out.println("Nome: " + nomeMaiorSalario);
        System.out.println("Cargo: " + cargoMaiorSalario);
        System.out.printf("Salário: R$ %.2f%n", maiorSalario);
    }
}
