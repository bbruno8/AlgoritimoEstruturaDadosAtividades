package etapa1;
import java.util.Scanner;
public class C05EX04 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1,x2,y1,y2,resultado;

        System.out.print("Digite o valor de X¹:");
        x1 = teclado.nextDouble();
        System.out.print("Digite o valor de Y¹:");
        y1 = teclado.nextDouble();
        System.out.print("Digite o valor de X²:");
        x2 = teclado.nextDouble();
        System.out.print("Digite o valor de Y²:");
        y2 = teclado.nextDouble();

        resultado = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)); //raizes e potencias

        System.out.print("Ponto 1 (X1= "+x1+",Y1= "+y1+") e Ponto 2 (X2= "+x2+", Y2= "+y2+")" +
                "Distância= "+resultado);
        teclado.close();
    }
}
