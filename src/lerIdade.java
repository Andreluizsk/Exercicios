import javax.swing.*;

public class lerIdade {
    /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos.
    mostre-a expressa em dias. Leve em consideração o ano com 365 dias.*/
    public static void main(String[] args) {
        int ano = 365;
        int mes = 30;
        int anoAtual = 2022;


        String anoNascimento = JOptionPane.showInputDialog("Qual ano você nasceu ?");
        int quantosAnos = Integer.parseInt(anoNascimento);
        int idade = anoAtual - quantosAnos;
        int dias = idade * 365;
        System.out.println("Você tem " + idade + " anos" );
        System.out.println("A sua idade em dias é " + dias + " dias");
    }
}
