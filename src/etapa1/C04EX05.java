package etapa1;

import java.util.Scanner;
import javax.swing.JOptionPane;
//Bruno Constantino Gomes da Costa

public class C04EX05 {
    public static void main(String[] args) {
        String nome, cpf, rg, numTitulo, nomeEmpresa, numCnh;
        double salario;
        Scanner arquivo = new Scanner(
                C04EX05.class.getResourceAsStream("ficha.txt"));

        nome = arquivo.nextLine();
        cpf = arquivo.nextLine();
        rg = arquivo.nextLine();
        numTitulo = arquivo.nextLine();
        numCnh = arquivo.nextLine();
        nomeEmpresa = arquivo.nextLine();
        salario = arquivo.nextDouble();

        JOptionPane.showMessageDialog(null,
                "FICHA FUNCIONAL DE: " + nome + "\n\n" +
                        "Documentos:" + "\n" +
                        "CPF ............................................. " + cpf + "\n" +
                        "C.I. ............................................ " + rg + "\n" +
                        "Titulo de eleitor  .............................. " + numTitulo + "\n" +
                        "Carteira de motorista ........................... " + numCnh + "\n" +
                        "Empresa: " + nomeEmpresa + "\n" + "Salario: R$" + salario,
                "Ficha de cadastro", JOptionPane.INFORMATION_MESSAGE
        );

        arquivo.close();
    }
}
