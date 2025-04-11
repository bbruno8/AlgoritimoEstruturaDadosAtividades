package etapa1;

import java.util.Scanner;

public class C06EX15 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo, diasUsados;
        double valorFixo, conta, servicosExtras, impostosCidade, diariaPPP, impostosTotais;
        String plano, cidade;

        System.out.print("Digite sua cidade: ");
        cidade = teclado.nextLine();
        System.out.print("Digite seu plano(1,2,3): ");
        codigo = teclado.nextInt();
        System.out.print("Digite o número de dias usados o Pay-Per-View: ");
        diasUsados = teclado.nextInt();
        System.out.print("Digite o valor dos serviços extras: ");
        servicosExtras = teclado.nextDouble();

        if (codigo == 1) {
            plano = "Basic";
            valorFixo = 65;
            diariaPPP = 1.2 * diasUsados;

            if (diariaPPP > 65.0) {
                diariaPPP = 65;
            }

        } else if (codigo == 2) {
            plano = "Advanced";
            valorFixo = 104;
            diariaPPP = 2.1* diasUsados;


        } else {
            plano = "Premium";
            valorFixo = 137;
            diariaPPP = 0;
        }

        if (cidade.equalsIgnoreCase("Belo horizonte") || cidade.equalsIgnoreCase("BH")) {
            impostosCidade = 0;
        } else if (cidade.equalsIgnoreCase("São Paulo") || cidade.equalsIgnoreCase("SP")) {
            impostosCidade = 0.01;
        } else if (cidade.equalsIgnoreCase("Rio de Janeiro") || cidade.equalsIgnoreCase("RJ")) {
            impostosCidade = 0.015;
        } else {
            impostosCidade = 0.02;
        }

        impostosTotais = (impostosCidade * valorFixo) + (impostosCidade * diariaPPP) + (impostosCidade * servicosExtras);
        conta = valorFixo + diariaPPP + servicosExtras + impostosTotais;

        System.out.print("\nBoleto TV a cabo\n");
        System.out.printf("Valor total R$%.2f\n" +
                "Valor dos extras R$%.2f\n" +
                "Sua cidade %s imposto da cidade %.3f", conta, servicosExtras, cidade, impostosCidade);

        teclado.close();
    }
}
