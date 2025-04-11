package etapa1;

import java.util.Scanner;

public class C04EX02 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, cpf, rg, numTitulo, nomeEmpresa, numCnh;
        double salario;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite seu CPF: ");
        cpf = teclado.nextLine();
        System.out.print("Digite seu RG: ");
        rg = teclado.nextLine();
        System.out.print("Digite o número do título de eleitor: ");
        numTitulo = teclado.nextLine();
        System.out.print("Digite o número da sua carteira de motorista: ");
        numCnh = teclado.nextLine();
        System.out.print("Digite o nome da sua empresa: ");
        nomeEmpresa = teclado.nextLine();
        System.out.print("Digite seu salário: ");
        salario = teclado.nextDouble();

        System.out.println();
        System.out.print("FICHA FUNCIONAL DE: " + nome);
        System.out.println();
        System.out.println("Documentos:");
        System.out.println("CPF ............................................. " + cpf);
        System.out.println("C.I. ............................................ " + rg);
        System.out.println("Título de eleitor ............................... " + numTitulo);
        System.out.println("Carteira de motorista ........................... " + numCnh);
        System.out.println();
        System.out.println("Empresa: " + nomeEmpresa);
        System.out.println("Salário: R$" + salario);

        teclado.close();
    }
}
