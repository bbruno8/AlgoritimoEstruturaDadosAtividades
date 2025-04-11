package etapa1;

public class C05EX11 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        int numCheque, banco, agencia, sequencial;
        numCheque = 243154233;
        banco = numCheque / 1000000;  //pegando os três primeiros números de 9
        agencia = numCheque / 1000 % 1000; //pegando os três números do meio de 9
        sequencial = numCheque % 1000; //pegando os três ultimos números de 9

        System.out.print("Cheque:" + numCheque + "\n" +
                "Banco = " + banco + " Agência = " + agencia + " Sequencial = " + sequencial);

    }
}
