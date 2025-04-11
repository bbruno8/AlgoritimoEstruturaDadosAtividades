package etapa1;

import java.util.Scanner;

public class C06EX13 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaInicio, minInicio, horaFim, minFim, duracaoHoras, duracaoMin, totalMinIni, totalMinFim,duracaoTotalMin;

        System.out.print("Digite a hora que o jogo começou: ");
        horaInicio = teclado.nextInt();
        System.out.print("Digite o minuto que o jogo começou: ");
        minInicio = teclado.nextInt();
        System.out.print("Digite a hora que o jogo terminou: ");
        horaFim = teclado.nextInt();
        System.out.print("Digite o minuto que o jogo terminou: ");
        minFim = teclado.nextInt();

        //primero vamos transformar as horas em minutos
        totalMinIni = horaInicio * 60 + minInicio;
        totalMinFim = horaFim * 60 + minFim;
        //subtraia os minutos
        duracaoTotalMin=totalMinFim-totalMinIni;

        duracaoHoras=duracaoTotalMin/60;//dividindo por 60 vamos obter as horas
        duracaoMin=duracaoTotalMin%60;//pegando o resto da divisão por 60 vamos obter os minutos

        System.out.print("O jogo durou " + duracaoHoras + " horas e " + duracaoMin + " minutos");
    teclado.close();
    }
}
