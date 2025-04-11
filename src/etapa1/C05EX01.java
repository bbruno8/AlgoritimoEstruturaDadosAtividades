package etapa1;
import java.util.Scanner;
    //Bruno Constantino Gomes da Costa
public class C05EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x,resultado;

        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();

        resultado = Math.pow(x, 3) + 4 * x + 10;

        System.out.println("O valor da função f(x)=x³+4x+10= "+ resultado);

        teclado.close();
    }
}
