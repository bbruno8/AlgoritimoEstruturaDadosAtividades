package etapa2;

public class C08EX23 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        int numero, unidade, dezena, centena, milhar;
        int soma = 0, cont = 0;

        for (numero = 1000; numero <= 9999; numero++) {
            milhar = numero / 1000;
            centena = (numero / 100) % 10;
            dezena = (numero / 10) % 10;
            unidade = numero % 10;

            if (milhar == unidade && centena == dezena) {
                System.out.println(numero);
                soma += numero;
                cont++;
            }
        }

        if (cont > 0) {
            System.out.println("A média dos números palíndromos é: " + (double)soma / cont);
        } else {
            System.out.println("Nenhum número palíndromo encontrado.");
        }
    }
}
