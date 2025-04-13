package etapa2;

import javax.swing.*;

public class C08EX11 {
    //Bruno Constantino Gomes da Costa
    public static void main(String[] args) {
        String nome, sexo,estadoCivil,corOlhos,corCabelo, escolaridade,idadeStr,salarioStr,nomeSalario;
        String [] opcoesSexo ={"Masculino","Feminino"},
                opcoesCivil={"Casado","Solteiro","Outro"},
                opcoesOlhos={"Azuis","Castanhos","Pretos","Outros"},
                opcoesCabelos={"Loiro","Castanho","Ruivo"},
                opcoesEscolaridade={"1-Anafalbeto","2-Ensino Fundamental","3-Ensino Médio","4-Ensino Superior"};

        double maiorSalario=0,menorSalario=0;
        int cont;
        for (int i =0;i<3;i++){

            nome = JOptionPane.showInputDialog(null,
                    "Digite seu primeiro nome:",
                    "Informações pessoais",
                    JOptionPane.QUESTION_MESSAGE);
            idadeStr = JOptionPane.showInputDialog(null,
                    "Digite sua idade:",
                    "Informações pessoais",
                    JOptionPane.QUESTION_MESSAGE);
            salarioStr = JOptionPane.showInputDialog(null,
                    "Digite seu salário:",
                    "Informações pessoais",
                    JOptionPane.QUESTION_MESSAGE);
            sexo = opcoesSexo[JOptionPane.showOptionDialog(
                    null,
                    "Selecione seu sexo:",
                    "Informações pessoais",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesSexo,
                    opcoesSexo[0])];

            estadoCivil = opcoesCivil[JOptionPane.showOptionDialog(
                    null,
                    "Selecione seu estado civil:",
                    "Informações pessoais",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesCivil,
                    opcoesCivil[0])];

            corOlhos = opcoesOlhos[JOptionPane.showOptionDialog(
                    null,
                    "Selecione a cor dos seus olhos :",
                    "Informações pessoais",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesOlhos,
                    opcoesOlhos[0])];

            corCabelo = opcoesCabelos[JOptionPane.showOptionDialog(
                    null,
                    "Selecione a cor do seu cabelo :",
                    "Informações pessoais",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesCabelos,
                    opcoesCabelos[0])];

            escolaridade = opcoesEscolaridade[JOptionPane.showOptionDialog(
                    null,
                    "Selecione sua escolaridade :",
                    "Informações pessoais",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoesEscolaridade,
                    opcoesEscolaridade[0])];

            //transformando String em double e int
            int idade = Integer.valueOf(idadeStr);
            double salario = Double.parseDouble(salarioStr);


            // descobrir o maior salario
            if (i ==1 || salario>maiorSalario){
                maiorSalario = salario;
                nomeSalario = nome;
            }
            //descobrir o menor salario
            if (i == 1 || salario<menorSalario ){
                menorSalario = salario;
            }


            }

        }
    }
