package etapa2;

import java.util.Scanner;

public class C08EX13 {
    // Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        // Lê o arquivo "c08ex13.txt"
        //caminho \AEDI\out\production\AEDI\etapa2
        Scanner arquivo = new Scanner(C08EX13.class.getResourceAsStream("c08ex13.txt"));

        String cidade, menorCidade = "";
        int populacao, eleitores, homens, mulheres, contMilhao = 0, contMulher = 0, populacaoMenor = 0;
        double percentEleitores;

        for (int i = 0; i < 4; i++) {
            // Lê os dados diretamente do arquivo
            cidade = arquivo.nextLine();
            populacao = Integer.parseInt(arquivo.nextLine());
            eleitores = Integer.parseInt(arquivo.nextLine());
            homens = Integer.parseInt(arquivo.nextLine());
            mulheres = Integer.parseInt(arquivo.nextLine());

            if (populacao < homens && populacao < mulheres) {
                System.out.print("O número de homens e mulheres é maior que a população digitada.");
                break;
            }

            if (populacao > 1000000) {
                contMilhao++;
            }

            if (mulheres > homens) {
                contMulher++;
            }

            if (i == 0 || populacao < populacaoMenor) {
                populacaoMenor = populacao;
                menorCidade = cidade;
            }

            percentEleitores = ((double) eleitores / populacao) * 100;
            System.out.printf("A cidade %s tem %.2f%% de eleitores\n", cidade, percentEleitores);
        }

        System.out.print("\nO número de cidades com mais de um milhão de pessoas é: " + contMilhao
                + "\nO número de cidades com mais mulheres do que homens é: " + contMulher
                + "\nA menor cidade é: " + menorCidade);

        arquivo.close();
    }
}
