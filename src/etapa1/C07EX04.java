package etapa1;
import java.util.Scanner;

public class C07EX04 {
    // Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String estado;

        System.out.print("Digite um estado do Brasil: ");
        estado = teclado.nextLine();

        switch (estado){
            case "Minas Gerais":
                System.out.print("Atlético Mineiro, América, Cruzeiro, Vila Nova");
                break;
            case "Rio de Janeiro":
                System.out.print("Botafogo, Flamengo, Fluminense,Vasco");
                break;
            case "São Paulo":
                System.out.print("Corinthians, Palmeiras, santos, São Paulo");
                break;
            case "Rio Grande do Sul":
                System.out.print("Grêmio, Internacional, Juventude");
                break;
            case "Pernambuco":
                System.out.print("Náutico, Santa Cruz, Sport");
                break;
            default:
                System.out.print("time inválido");
                break;
        }
        teclado.close();
    }
}
