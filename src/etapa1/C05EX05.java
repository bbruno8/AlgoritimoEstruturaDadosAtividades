package etapa1;

import java.util.Scanner;

public class C05EX05 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double celsius, kelvin, fahrenheit;

        System.out.print("Digite a temperatura em graus celsius: ");
        celsius = teclado.nextDouble();

        kelvin = celsius + 273;
        fahrenheit = celsius * 1.8 + 32;

        System.out.println("Temperatura em:\n" +
                "Celsius = " + celsius + "\nfahrenheit = " + fahrenheit + "\nKelvin = " + kelvin);

        teclado.close();
    }
}
