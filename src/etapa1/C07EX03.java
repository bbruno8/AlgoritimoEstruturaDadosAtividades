package etapa1;
import java.util.Scanner;

public class C07EX03 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dias;
        double imposto,multa;

        System.out.print("Digite o valor do imposto: ");
        imposto = teclado.nextDouble();
        System.out.print("Digite quantos dias de atraso: ");
        dias = teclado.nextInt();

        switch (dias){
            case 1: case 2: case 3: case 4: case 5:
                multa =0;
                break;
            case 6 : case 7 : case 8 :
                multa= 0.02*imposto;
                break;
            case 9 : case 10:
                multa = (imposto*0.1)+(0.5*dias);
                break;
            default:
                multa = (1.5*imposto)+(1*dias);
                break;
        }
            System.out.printf("Imposto R$%.2f Dias de atraso: %d valor da multa é R$%.2f",imposto,dias,multa);
        teclado.close();
    }
}
