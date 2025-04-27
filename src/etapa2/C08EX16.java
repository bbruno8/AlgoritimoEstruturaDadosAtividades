package etapa2;

public class C08EX16 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        int cont = 0, soma = 0;
        double media = 0;
        for (int i = 1001; i < 2000; i += 2) {
            cont++;
            soma += i;
        }
        media = (double) soma / cont;
        System.out.print("Média dos números impares é: " + media);
    }
}
