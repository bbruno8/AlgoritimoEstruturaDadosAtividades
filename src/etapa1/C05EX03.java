package etapa1;

import java.util.Scanner;
public class C05EX03 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numDependentes;
        double salario, liquido, impostoRenda;

        System.out.print("Digite seu sálario: ");
        salario = teclado.nextDouble();
        System.out.print("Digite a quantidade de dependentes: ");
        numDependentes = teclado.nextInt();

        liquido = salario-(numDependentes*60);
        impostoRenda = liquido*0.15; // regra de 3 15/100 0,15

        System.out.print("Valor do imposto de renda: "+impostoRenda);
        teclado.close();
    }
}
