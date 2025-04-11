package etapa2;

import java.util.Scanner;

public class C08EX05 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int candidato, cont1 = 0, cont2 = 0, cont3 = 0;
        String ganhador = "";


        for (int aux = 0; aux < 100; aux++) {
            System.out.println("Numeros dos candidatos:\n" +
                    "1 - Fulano, 2 - Ciclano e 3 - Beltrano\n");
            System.out.print("Digite o número do candidato: ");
            candidato = teclado.nextInt();
            //apurar votos
            if (candidato == 1) {
                cont1++;
            } else if (candidato == 2) {
                cont2++;
            } else {
                cont3++;
            }
        }

        //Verificar vencedor
        if (cont1 > cont2 && cont1 > cont3) {
            ganhador = "Fulano ganhou!";
        } else if (cont2 > cont1 && cont2 > cont3) {
            ganhador = "Ciclano ganhou!";
        } else if (cont3 > cont1 && cont3 > cont2) {
            ganhador = "Beltrano ganhou!";
        } else {
            System.out.println("Erro na votação!");
        }
        System.out.println("\nVotos\n" +
                "Fulano: " + cont1 + "\n" +
                "Ciclano: " + cont2 + "\n" +
                "Beltrano: " + cont3 + "\n" +
                ganhador);

        teclado.close();
    }
}