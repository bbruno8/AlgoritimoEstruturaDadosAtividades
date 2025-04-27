package etapa2;

public class C08EX27 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        for (int repeticoes = 1; repeticoes <= 10; repeticoes++) {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= Math.pow(2, i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 6; i >= 1; i--) {
                for (int j = 1; j <= Math.pow(2, i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
