package etapa2;

import java.util.Scanner;

public class C08EX30 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = teclado.nextDouble();
        System.out.print("Digite o valor de n: ");
        int n = teclado.nextInt();

        // Calcula o logaritmo natural de x
        double resultado = Math.log(x);

        // Soma os termos da sequência x^i / i, para i de 1 até n
        for (int i = 1; i <= n; i++) {
            resultado += Math.pow(x, i) / i;
        }

        // Imprime o resultado da série
        System.out.println("O valor da série S é: " + resultado);
    }
}
