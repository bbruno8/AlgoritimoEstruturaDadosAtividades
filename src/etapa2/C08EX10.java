package etapa2;

import java.util.Scanner;

public class C08EX10 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String insumo,insumoMaisConsumido="";
        double precoUnitario,custoParcial=0,custoTotal=0,mediaPacial=0,maiorInsumo=0;
        int quantConsumo, quantInsumos;

        System.out.print("Digite a quantidade de insumos: ");
        quantInsumos = teclado.nextInt();
        teclado.nextLine();

        for (int i=0;i<quantInsumos;i++){
            System.out.print("\nDigite o insumo: ");
            insumo = teclado.nextLine();
           System.out.print("Digite o valor unitário do insumo: ");
            precoUnitario = teclado.nextDouble();
            System.out.print("Digite a quantidade de insumos consumida: ");
            quantConsumo = teclado.nextInt();
            teclado.nextLine();

            custoParcial = precoUnitario*quantConsumo;
            System.out.printf("Custo parcial R$ %.2f \n",custoParcial);

            custoTotal +=custoParcial;

            if (i==1 || precoUnitario>maiorInsumo){
                maiorInsumo =precoUnitario;
                insumoMaisConsumido = insumo;
            }

        }
        mediaPacial=custoTotal/quantInsumos;

        System.out.printf("\nCusto total R$ %.2f ",custoTotal);
        System.out.printf("\nMédia do custo parcial é R$ %.2f",mediaPacial);
        System.out.print("\nNome do Insumo de maior custo parcial: "+insumoMaisConsumido);

    }
}
