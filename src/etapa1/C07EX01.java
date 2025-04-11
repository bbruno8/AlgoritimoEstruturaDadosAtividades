package etapa1;
import java.util.Scanner;

public class C07EX01 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome,premio;
        int jogosCertos;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite quantos jogos você acertou: ");
        jogosCertos = teclado.nextInt();
        System.out.println(nome +" você ganhou: ");

        switch (jogosCertos){
            case 1 : case 2 : case 3: case 4 : case 5:
                System.out.print("Nenhum premio");
                break;
            case 6 : case 7 : case 8: case 9 : case 10:
                System.out.print("Outro cartão!");
                break;
            case 11 :
                System.out.print("Premio de R$ 100,00");
                break;
            case 12 :
                System.out.print("Premio de R$ 1.000,00");
                break;
            case 13 :
                System.out.print("Premio de R$ 50.000,00");
                break;
        }
        teclado.close();
    }
}
