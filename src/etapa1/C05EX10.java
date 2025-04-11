package etapa1;

public class C05EX10 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        int num, d1, d2, d3, d4, d5;
        num = 24319;

        d1 = num / 10000;
        d2 = num / 1000 % 10;
        d3 = num / 100 % 10;
        d4 = num / 10 % 10;
        d5 = num % 10;

        System.out.print("Resultado:" + num + "\n" + d1 + "\n" + d2 + "\n" + d3 + "\n" + d4 + "\n" + d5);
    }
}
