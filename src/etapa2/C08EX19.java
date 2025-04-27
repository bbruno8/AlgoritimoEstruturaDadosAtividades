package etapa2;

public class C08EX19 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        double resultado=0;
        int soma=0;
        for (int i=1;i<=100;i++){
            resultado = Math.pow(i,2);
            soma+=resultado;
            System.out.println(resultado);
        }
        System.out.println("A soma de todos os termos é : "+soma);
    }
}
