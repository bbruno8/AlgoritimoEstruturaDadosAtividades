package etapa1;

import java.util.Scanner;

public class C06EX10 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double capitalAplicado, taxaDiaria, rendimento, impostoRenda, valorResgatado, taxaAdm, taxaDia;
        int numDias;
        System.out.print("Digite o capital inicial investido: ");
        capitalAplicado = teclado.nextDouble();
        System.out.print("Digite o número de dias que ficou aplicado: ");
        numDias = teclado.nextInt();
        System.out.print("Digite a taxa diária: ");
        taxaDiaria = teclado.nextDouble();

        taxaAdm = 10;
        taxaDia = taxaDiaria / 100;

        rendimento = capitalAplicado * taxaDia * numDias;
        impostoRenda = 0.15 * rendimento;
        valorResgatado = capitalAplicado + rendimento - impostoRenda - taxaAdm;

        System.out.printf("O valor aplicado foi R$%.2f quantidade de dias %d taxa diáia %.2f" +
                "\n Valor resgatado R$ %.2f", capitalAplicado, numDias, taxaDiaria, valorResgatado);
        teclado.close();
    }
}
