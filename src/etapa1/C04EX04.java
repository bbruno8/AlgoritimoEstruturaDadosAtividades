package etapa1;

import javax.swing.JOptionPane;

public class C04EX04 {
    //Bruno Constantino Gomes da Costa

    public static void main(String[] args) {
        String primeiroNome, nomeMeio, sobrenome, idade;

        primeiroNome = JOptionPane.showInputDialog(null,
                "Digite seu primeiro nome:",
                "Atividade 1",
                JOptionPane.QUESTION_MESSAGE);
        nomeMeio = JOptionPane.showInputDialog(null,
                "Digite seu nome do meio:",
                "Atividade 1",
                JOptionPane.QUESTION_MESSAGE);
        sobrenome = JOptionPane.showInputDialog(null,
                "Digite seu sobrenome:",
                "Atividade 1",
                JOptionPane.QUESTION_MESSAGE);
        idade = JOptionPane.showInputDialog(null,
                "Digite sua idade:",
                "Atividade 1",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null,
                sobrenome + ", " + primeiroNome + " " + nomeMeio + "\n" + "Idade: " + idade + " anos.");
    }
}
