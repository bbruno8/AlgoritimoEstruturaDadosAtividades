package etapa2;
import java.util.Scanner;
public class C08EX21 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura,altura2,imc;
        System.out.println("Digite sua altura :");
        altura = teclado.nextDouble();
        altura2 = altura*altura;

        for (int i = 60;i<=100;i++){
            imc=i/altura2;
            if (imc<20){
                System.out.println("Seu imc é : "+imc+" e você está abaixo do peso!");
            }else if (imc<25){
                System.out.println("Seu imc é : "+imc+" e você está no peso ideal!");
            }else {
                System.out.println("Seu imc é : "+imc+" e você está acima do peso!");
            }
        }
    }
}
