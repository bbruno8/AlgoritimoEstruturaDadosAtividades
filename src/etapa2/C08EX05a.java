package etapa2;

import java.util.Scanner;

public class C08EX05a {
    //Bruno Constantino Gomes da Costa
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int candidato, cont1 = 0, cont2 = 0, cont3 = 0,cont4=0;
        String eleicoes = "";


        for (int aux = 0; aux < 5; aux++) {
            System.out.println("Numeros dos candidatos:\n" +
                    "1 - Fulano, 2 - Ciclano, 3 - Beltrano e 4 - Nulo\n");
            System.out.print("Digite o número do candidato: ");
            candidato = teclado.nextInt();
            //apurar votos
            if (candidato == 1) {
                cont1++;
            } else if (candidato == 2) {
                cont2++;
            } else if(candidato == 3) {
                cont3++;
            }else {
                cont4++;
            }
        }

        //Verificar vencedor
        if (cont1 > cont2 && cont1 > cont3 &&cont1>cont4) {
            eleicoes = "Fulano ganhou!";
        } else if (cont2 > cont1 && cont2 > cont3 &&cont2>cont4) {
            eleicoes = "Ciclano ganhou!";
        } else if (cont3 > cont1 && cont3 > cont2 && cont3>cont4) {
            eleicoes = "Beltrano ganhou!";

        } else if(cont1 == cont2 && cont1>cont3 && cont1>cont4){ //Segundo turno entre 1 e 2

            for (int aux = 0; aux < 5; aux++) {
                System.out.println("Segundo turno:\n" +
                        "1 - Fulano, 2 - Ciclano, 4 - Nulo\n");
                System.out.print("Digite o número do candidato: ");
                candidato = teclado.nextInt();
                //apurar votos
                if (candidato == 1) {
                    cont1++;
                } else if (candidato == 2) {
                    cont2++;
                } else {
                    cont4++;
                }
                if (cont1 > cont2 && cont1 > cont4) {
                    eleicoes = "Fulano ganhou!";
                } else if (cont2 > cont1 && cont2 > cont4) {
                    eleicoes = "Ciclano ganhou!";
                } else {
                    System.out.print("Eleições anuladas");
                }
            }
        } else if(cont1 == cont3 && cont1>cont2 && cont1>cont4){ //Segundo turno entre 1 e 3

            for (int aux = 0; aux < 5; aux++) {
                System.out.println("\nSegundo turno:\n" +
                        "1 - Fulano, 3 - Beltrano, 4 - Nulo\n");
                System.out.print("Digite o número do candidato: ");
                candidato = teclado.nextInt();
                //apurar votos
                if (candidato == 1) {
                    cont1++;
                } else if (candidato == 3) {
                    cont3++;
                } else {
                    cont4++;
                }
                if (cont1 > cont3 && cont1 > cont4) {
                    eleicoes = "Fulano ganhou!";
                } else if (cont3 > cont1 && cont3 > cont4) {
                    eleicoes = "Beltrano ganhou!";
                } else {
                    System.out.print("Eleições anuladas");
                }
            }
        } else if(cont2 == cont3 && cont2>cont1 && cont2>cont4) { //Segundo turno entre 2 e 3

            for (int aux = 0; aux < 5; aux++) {
                System.out.println("Segundo turno:\n" +
                        "2 - Ciclano, 3 - Beltrano, 4 - Nulo\n");
                System.out.print("Digite o número do candidato: ");
                candidato = teclado.nextInt();
                //apurar votos
                if (candidato == 2) {
                    cont2++;
                } else if (candidato == 3) {
                    cont3++;
                } else {
                    cont4++;
                }
                if (cont2 > cont3 && cont2 > cont4) {
                    eleicoes = "Ciclano ganhou!";
                } else if (cont3 > cont1 && cont3 > cont4) {
                    eleicoes = "Beltrano ganhou!";
                } else {
                    System.out.print("Eleições anuladas");
                }
            }
        } else if(cont1 == cont3 && cont1==cont2 && cont1>cont4) { //Segundo turno entre 2 e 3

            for (int aux = 0; aux < 5; aux++) {
                System.out.println("Numeros dos candidatos:\n" +
                        "1 - Fulano, 2 - Ciclano, 3 - Beltrano e 4 - Nulo\n");
                System.out.print("Digite o número do candidato: ");
                candidato = teclado.nextInt();
                //apurar votos
                if (candidato == 1) {
                    cont1++;
                } else if (candidato == 2) {
                    cont2++;
                } else if(candidato == 3) {
                    cont3++;
                }else {
                    cont4++;
                }
            }
            if (cont1 > cont2 && cont1 > cont3 &&cont1>cont4) {
                eleicoes = "Fulano ganhou!";
            } else if (cont2 > cont1 && cont2 > cont3 &&cont2>cont4) {
                eleicoes = "Ciclano ganhou!";
            } else if (cont3 > cont1 && cont3 > cont2 && cont3>cont4) {
                eleicoes = "Beltrano ganhou!";
            } else {
                System.out.print("Eleições anuladas");
            }
        }else {
            System.out.print("Eleições anuladas");
            }

        System.out.println("\nVotos\n" +
                "Fulano: " + cont1 + "\n" +
                "Ciclano: " + cont2 + "\n" +
                "Beltrano: " + cont3 + "\n" +
                "Votos nulos: " + cont4 + "\n" +
                eleicoes);

        teclado.close();
    }
}
