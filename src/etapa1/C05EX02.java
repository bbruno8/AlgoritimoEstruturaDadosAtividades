package etapa1;
import java.util.Scanner;
public class C05EX02 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio,pi,area,volume,resultado;

        System.out.print("Digite o valor do raio:");
        raio = teclado.nextDouble();

        pi=3.1416;
        area=4*pi*Math.pow(raio,2);
        volume = (4.0/3)*(pi*Math.pow(raio,3));

        System.out.print("Raio "+raio+" Área= "+area);
        System.out.printf(" Volume= %.1f",volume); //para printar apenas um numero depois da virgula
        teclado.close();
    }
}
