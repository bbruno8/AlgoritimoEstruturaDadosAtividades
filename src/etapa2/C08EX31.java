package etapa2;
import java.util.Scanner;

public class C08EX31 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final double SALARIO_MIN_C = 2500.00;
        final double SALARIO_MIN_P = 4650.00;
        final double SALARIO_MIN_O = 3200.00;
        final double SALARIO_MIN_A = 5100.00;

        int qtdEngenheirosAcimaSalarioMin = 0;
        int qtdEngenheirosAbaixoSalarioMin = 0;
        double somaSalariosAdmin = 0.0;
        int qtdEngenheirosAdmin = 0;
        int qtdEngenheirosOutrosAcima5000 = 0;
        String nomeMenorSalario = "";
        double salarioMenor = Double.MAX_VALUE;
        String cargoMenorSalario = "";

        System.out.print("Digite a quantidade de engenheiros pesquisados: ");
        int numEngenheiros = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < numEngenheiros; i++) {
            System.out.print("Digite o nome do engenheiro: ");
            String nome = teclado.nextLine();

            System.out.print("Digite o salário bruto do engenheiro: ");
            double salario = teclado.nextDouble();
            teclado.nextLine();

            System.out.print("Digite o código do cargo (C, P, O, A, X): ");
            String cargo = teclado.nextLine().toUpperCase();

            if (cargo.equals("C") && salario < SALARIO_MIN_C) {
                System.out.println(nome + ": ABAIXO DO SALÁRIO MÍNIMO");
                qtdEngenheirosAbaixoSalarioMin++;
            } else if (cargo.equals("P") && salario < SALARIO_MIN_P) {
                System.out.println(nome + ": ABAIXO DO SALÁRIO MÍNIMO");
                qtdEngenheirosAbaixoSalarioMin++;
            } else if (cargo.equals("O") && salario < SALARIO_MIN_O) {
                System.out.println(nome + ": ABAIXO DO SALÁRIO MÍNIMO");
                qtdEngenheirosAbaixoSalarioMin++;
            } else if (cargo.equals("A") && salario < SALARIO_MIN_A) {
                System.out.println(nome + ": ABAIXO DO SALÁRIO MÍNIMO");
                qtdEngenheirosAbaixoSalarioMin++;
            }

            if (cargo.equals("C") && salario >= SALARIO_MIN_C) {
                qtdEngenheirosAcimaSalarioMin++;
            } else if (cargo.equals("P") && salario >= SALARIO_MIN_P) {
                qtdEngenheirosAcimaSalarioMin++;
            } else if (cargo.equals("O") && salario >= SALARIO_MIN_O) {
                qtdEngenheirosAcimaSalarioMin++;
            } else if (cargo.equals("A") && salario >= SALARIO_MIN_A) {
                qtdEngenheirosAcimaSalarioMin++;
            }

            if (cargo.equals("A")) {
                somaSalariosAdmin += salario;
                qtdEngenheirosAdmin++;
            }

            if (cargo.equals("X") && salario > 5000) {
                qtdEngenheirosOutrosAcima5000++;
            }

            if (salario < salarioMenor) {
                salarioMenor = salario;
                nomeMenorSalario = nome;
                cargoMenorSalario = cargo;
            }
        }

        System.out.println("\nQuantidade de engenheiros com salário igual ou acima do mínimo: " + qtdEngenheirosAcimaSalarioMin);
        System.out.println("Quantidade de engenheiros com salário abaixo do mínimo: " + qtdEngenheirosAbaixoSalarioMin);

        if (qtdEngenheirosAdmin > 0) {
            double mediaSalariosAdmin = somaSalariosAdmin / qtdEngenheirosAdmin;
            System.out.println("Média dos salários dos engenheiros Administradores: R$ " + mediaSalariosAdmin);
        } else {
            System.out.println("Não há engenheiros Administradores cadastrados.");
        }

        System.out.println("Quantidade de engenheiros do cargo 'Outros' com salário acima de R$ 5.000,00: " + qtdEngenheirosOutrosAcima5000);

        System.out.println("Engenheiro com o menor salário:");
        System.out.println("Nome: " + nomeMenorSalario);
        System.out.println("Salário: R$ " + salarioMenor);
        System.out.println("Cargo: " + cargoMenorSalario);
    }
}
