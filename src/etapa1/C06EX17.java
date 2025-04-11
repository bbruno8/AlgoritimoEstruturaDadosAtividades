package etapa1;
import java.util.Scanner;

public class C06EX17 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean p1, p2, p3, p4, p5, p6, p7, p8, p9, apto, inapto, salarioBom, salarioRuim;


        System.out.print("Responda com V (vedadeiro) e F para Falso \n\n");

        System.out.print("Você tem curso técnico de programação? \n");
        p1 = teclado.nextBoolean();
        System.out.print("Você tem curso superior de programação? \n");
        p2 = teclado.nextBoolean();
        System.out.print("Você tem menos de 3 anos de experiência em programação? \n");
        p3 = teclado.nextBoolean();
        System.out.print("Você se considera uma pessoa criativa? \n");
        p4 = teclado.nextBoolean();
        System.out.print("Você prefere liderar a ser liderado? \n");
        p5 = teclado.nextBoolean();
        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? \n");
        p6 = teclado.nextBoolean();
        System.out.print("Você é autodidata (aprende sozinho)? \n");
        p7 = teclado.nextBoolean();
        System.out.print("Você aceitaria uma remuneração inicial de R$1500? \n");
        p8 = teclado.nextBoolean();
        System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? \n");
        p9 = teclado.nextBoolean();


        // logia para condições
        //primeiro a parte negativa,segundo se so tem tecnico e tem experiencia, terceiro se ele quer ser lider ganhar - 1500
        // else usado para o negativo
        if ((p1 || p2 || p3 || p5 || p8) && (p4 == false && p6 == true && p7 == false && p9 == true)) {//condição falsa
            System.out.print("Inapto para a vaga");
        } else if ((p5 || p8) && (p1 == true && p2==false && p3 == true && p4 == true && p6 == false && p7 == true && p9 == false)){
            System.out.print("Apto para a vaga como tecnico");
        } else if ((p1 || p2 || p3 ) && (p5 == true && p4 == false && p6 == true && p7 == false && p9 == true && p8 == true)) {
            System.out.print("Como você está em uma posição de liderança seu salário não pode ser R$1.500,00");
        }else {
            System.out.print("Apto para a vaga");
        }
        teclado.close();
    }
}