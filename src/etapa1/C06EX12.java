package etapa1;

import java.util.Scanner;

public class C06EX12 {
    public static void main(String[] args) {
        //Bruno Constantino Gomes da Costa
        Scanner teclado = new Scanner(System.in);
        int bolasFeitas, bolasDefeituosas, bolasUsadas, mesesCopa, galpoes, caixas;
        double valorTotal, valorCaixa, valorAluguel, custoCaixa, custoAluguel;

        System.out.print("Digite quantas bolas foram produzidas: ");
        bolasFeitas = teclado.nextInt();
        System.out.print("Digite quantas bolas estavam com defeito: ");
        bolasDefeituosas = teclado.nextInt();
        System.out.print("Digite quantos meses faltam para a copa: ");
        mesesCopa = teclado.nextInt();
        System.out.print("Digite o valor da caixa de papelão: ");
        valorCaixa = teclado.nextDouble();
        System.out.print("Digite o valor do aluguel do galpão: ");
        valorAluguel = teclado.nextDouble();

        //para caso tenha menos que 10 bolas em uma caixa
        bolasUsadas = bolasFeitas - bolasDefeituosas;
        caixas = bolasUsadas / 10;
        if (caixas % 10 > 0) {
            caixas++;
        }
        // para caso tenha menos que 850 caixas em um golpão
        galpoes = caixas / 850;
        if (galpoes % 850 > 0) {
            galpoes++;
        }

        custoCaixa = valorCaixa * caixas;
        custoAluguel = valorAluguel * galpoes * mesesCopa;
        valorTotal = custoCaixa + custoAluguel;

        System.out.print("\nNúmero de bolas produzidas foi (" + bolasFeitas + ") das bolas feitas vieram com defeito (" + bolasDefeituosas + "), a quantidade de bolas usada foram(" + bolasUsadas + ").\n");
        System.out.printf("O valor de cada caixa é R$%.2f o valor mensal do aluguel é R$%.2f o custo total é R$%.2f", valorCaixa, valorAluguel, valorTotal);

        teclado.close();
    }
}
