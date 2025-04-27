package etapa2;

public class C08EX26 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        for (int repeticoes = 1; repeticoes <= 10; repeticoes++) {
            for (int linha = 1; linha <= 10; linha++) {
                for (int espacos = 1; espacos <= linha - 1; espacos++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int linha = 9; linha >= 1; linha--) {
                for (int espacos = 1; espacos <= linha - 1; espacos++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
