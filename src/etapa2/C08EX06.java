package etapa2;
import java.util.Scanner;
public class C08EX06 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, cont=0,soma=0;

        for (int aux=0;aux<10;aux++){
            System.out.print("\nDigite um número inteiro:");
            num = teclado.nextInt();

            if (num%2==0){
                System.out.print("\nO número: "+num+" é par!");
            }else {
                System.out.print("\nO número: "+num+" é impar!");
            }
            if (num%4==0){
                soma+=num;
            }
            if (num%3==0){
                cont++;
            }
        }
        System.out.println("\nSoma dos números divisíveis por 4 =  "+soma);
        System.out.println("Quantidade de números divisíveis por 3 ="+cont);

        teclado.close();
    }
}
