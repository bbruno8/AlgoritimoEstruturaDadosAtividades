package etapa2;

public class C09EX01 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 37; aux++) {       //Quantidade de TERMOS da série (aux<=x)
            num = (38 - aux) * (39 - aux);          //Implementação da variação do numerador
            den = aux;                              //Implementação da variação do denominador
            serie += num / den;
        }

        System.out.print("Valor da Série = " + serie);
    }
}


