package etapa2;

public class C08EX24 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        double soma = 0, resultadoFinal;

        for (int i = 1; i <= 99; i += 2) { // Só potências ímpares
            soma += Math.pow(2, i);
        }

        resultadoFinal = (1.0 / 3) * soma;

        System.out.println("O valor da série é: " + resultadoFinal);
    }
}
