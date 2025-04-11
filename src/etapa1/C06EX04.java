package etapa1;
import java.util.Scanner;
public class C06EX04 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome,resultado;
        double altura, peso,imc;

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();
        System.out.print("Digite seu altura: ");
        altura = teclado.nextDouble();

        imc = peso/(altura*altura);

        if (imc<18){
            resultado = "desnutrido/a";
        } else if (imc<20) {
            resultado = "abaixo do peso";
        } else if (imc>=20 && imc <25) {
            resultado = "peso ideal";
        }else if (imc>25){
            resultado = "acima do peso";
        }else {
            resultado = "obeso/a";
        }

        System.out.print("Olá "+nome+"\n");
        System.out.printf("sua altura é: %.2f seu peso é: %.2f",altura,peso);
        System.out.printf("\nO seu imc é: %.2f",imc);
        System.out.print(" o resultado é: "+resultado);

        teclado.close();
    }
}
