package etapa1;
import java.util.Scanner;

public class C06EX11 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String equipe1,equipe2,resultado;
        int pontos1,pontos2,sets1,sets2;

        System.out.print("Digite o nome da equipe 1: ");
        equipe1 = teclado.nextLine();
        System.out.print("Digite o nome da equipe 2: ");
        equipe2 = teclado.nextLine();
        System.out.print("Digite quantos sets a equipe 1 fez(min 0 e max 3): ");
        sets1 = teclado.nextInt();
        System.out.print("Digite quantos sets a equipe 2 fez(min 0 e max 3): ");
        sets2 = teclado.nextInt();

        if (sets1 == 3 && sets2 == 0){
            pontos1 =3;
            pontos2 =0;
            resultado = equipe1 + " ganhou!";
        } else if (sets1 == 0 && sets2 == 3) {
            pontos1 =0;
            pontos2 =3;
            resultado = equipe2 + " ganhou!";
        } else if (sets1 == 3 && sets2 == 2) {
            pontos1 =2;
            pontos2 =1;
            resultado = equipe1 + " ganhou!";
        }else if (sets1 == 2 && sets2 == 3) {
            pontos1 = 1;
            pontos2 = 2;
            resultado = equipe2 + " ganhou!";
        }else {
            pontos1 = 0;
            pontos2 = 0;
            resultado = "empate";
        }
        System.out.print(resultado);
        System.out.print("\n"+equipe1+" fez "+pontos1+" pontos e o/a "+equipe2+" fez "+pontos2+" pontos.");

        teclado.close();
    }
}
