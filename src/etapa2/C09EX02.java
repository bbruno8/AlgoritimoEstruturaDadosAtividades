package etapa2;

public class C09EX02 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int aux = 1; aux <= 100; aux++) {      //Quantidade de TERMOS da série (aux<=x)
            num = aux;                              //Implementação da variação do numerador
            den = (Math.pow(aux,2))+(aux-1);        //Implementação da variação do denominador
            serie += num / den;
        }
        System.out.print("Valor da Série = " + serie);
    }
}


