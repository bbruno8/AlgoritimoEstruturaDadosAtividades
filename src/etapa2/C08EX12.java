package etapa2;

import java.util.Scanner;

public class C08EX12 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        double faturamento, vendas1 = 0, vendas2 = 0, vendas3 = 0, vendas4 = 0, vendas5 = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o codígo do produto: ");
            codigo = teclado.nextInt();

            if (codigo == 1) {
                cont1++;
                vendas1 = (cont1 * 1565);
            } else if (codigo == 2) {
                cont2++;
                vendas2 = (cont2 * 1890);
            } else if (codigo == 3) {
                cont3++;
                vendas3 = (cont3 * 2150);
            } else if (codigo == 4) {
                cont4++;
                vendas4 = (cont4 * 2963);
            } else if (codigo == 5) {
                cont5++;
                vendas5 = (cont5 * 3750);
            } else {
                break;
            }
        }
        faturamento = vendas1 + vendas2 + vendas3 + vendas4 + vendas5;
        System.out.printf("\nO faturamento foi de R$ %.2f",faturamento);
    }
}
