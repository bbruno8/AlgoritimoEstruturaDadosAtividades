package etapa1;

import java.util.Scanner;

public class C05EX12 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        int hora, seg, min, totalSeg;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite os segundos:");
        totalSeg = teclado.nextInt();

        hora = totalSeg / 3600;
        min = (totalSeg % 3600) / 60;
        seg = totalSeg % 60;


        System.out.print("Segundos:" + totalSeg +
                "Horas: " + hora + ", Minutos: " + min + ", Segundos:" + seg);
        teclado.close();
    }
}
