package etapa1;
import java.util.Scanner;

public class C07EX02 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota1,nota2,nota3,media,notaFinal;
        String conceito;

        System.out.print("Digite sua nota 1: ");
        nota1 = teclado.nextInt();
        System.out.print("Digite sua nota 2: ");
        nota2 = teclado.nextInt();
        System.out.print("Digite sua nota 3: ");
        nota3 = teclado.nextInt();

        notaFinal = (nota1+nota2+nota3)/3;

        switch (notaFinal){
            case 1 : case 2 : case 3: case 4 :
                conceito = "E";
                break;
            case 5: case 6 :
                conceito = "D";
                break;
            case 7:
                conceito = "C";
                break;
            case 8:
                conceito = "B";
                break;
            case 9: case 10:
                conceito = "A";
                break;
            default:
                conceito = "Nota inválida";
                break;
        }
        System.out.print("\nSeu conceito foi "+conceito);
        System.out.print("\nSua média foi "+notaFinal);
        teclado.close();
    }
}
