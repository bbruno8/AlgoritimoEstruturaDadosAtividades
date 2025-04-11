package etapa1;
import java.util.Scanner;

public class C06EX16 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int faltas, idade, pesoFalta, pesoIdade;
        String resultado;
        double prova1, prova2, prova3,notaFinal, media,trabalhoFinal;

        System.out.print("Digite a nota na prova 1: ");
        prova1 = teclado.nextDouble();
        System.out.print("Digite a nota na prova 2: ");
        prova2 = teclado.nextDouble();
        System.out.print("Digite a nota na prova 3: ");
        prova3 = teclado.nextDouble();
        System.out.print("Digite suas faltas: ");
        faltas = teclado.nextInt();
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.print("Digite sua nota no trabalho: ");
        trabalhoFinal = teclado.nextDouble();

        //peso falta
        if (faltas <= 5) {
            pesoFalta = 3;
        } else if (faltas <= 10) {
            pesoFalta = 2;
        } else {
            pesoFalta = 1;
        }
        //peso idade
        if (idade <= 17) {
            pesoIdade = 1;
        } else if (idade <= 50) {
            pesoIdade = 2;
        } else {
            pesoIdade = 3;
        }
        //descobrir as duas maiores notas
        if (prova1 > prova2 && prova2 > prova3 && prova1 > prova3) {
            media = (prova1 + prova2) / 2;
        } else if (prova1 > prova3 && prova3 > prova2 && prova1 > prova2) {
            media = (prova1 + prova3) / 2;

        } else if (prova2 > prova1 && prova1 > prova3 && prova2 > prova3) {
            media = (prova2 + prova1) / 2;
        } else if (prova2 > prova3 && prova3 > prova1 && prova2 > prova1) {
            media=(prova2+prova3)/2;

        } else if (prova3>prova1 && prova1>prova2 && prova3>prova2) {
            media=(prova3+prova1)/2;

        } else if (prova3>prova2 && prova2>prova1 && prova3>prova1) {
            media=(prova3+prova2)/2;
        }else {
            media = (prova1+prova2+prova3)/3;
        }

        notaFinal=(media*pesoFalta)+(trabalhoFinal*pesoIdade);

        if (notaFinal<=50){
            resultado="Reprovado";
        } else if (notaFinal<=70) {
            resultado="Regular";
        } else if (notaFinal<=80) {
            resultado="Bom";
        } else if (notaFinal<=90) {
            resultado="Muito bom";
        }else {
            resultado="Excelente";
        }

        System.out.print(resultado+" Sua nota foi "+notaFinal);
        teclado.close();
    }
}