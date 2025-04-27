package etapa2;

public class C08EX28 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        int soma = 0, cont = 0;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (i == j * (j + 1) * (j + 2)) {
                    System.out.println(i);
                    soma += i;
                    cont++;
                }
            }
        }
        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.println("A média dos números triangulares é: " + media);
        } else {
            System.out.println("Não há números triangulares entre 1 e 1000.");
        }
    }
}
