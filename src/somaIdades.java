import javax.swing.*;
import java.lang.*;
import java.sql.SQLOutput;

public class somaIdades {
    public static void main(String[] args) {
        int soma = 0;
        String minhaString = JOptionPane.showInputDialog(null, "Informe quantas idade quer saber?" + "\n");
        boolean eUmInteiro = minhaString.matches("-?\\d+");
        int quantidade = 0;
        if (eUmInteiro == true) {
            quantidade = Integer.parseInt(minhaString);
        } else {
            System.out.println("Dado Invalido");
        }
        for (int i = 0; i < quantidade; i++) {
            String idade1 = JOptionPane.showInputDialog(null, "Informe a Idade " + "\n");
            boolean idade = idade1.matches("-?\\d+");
            if (idade == true) {
                int idadeInteiro1 = Integer.parseInt(idade1);
                System.out.println("A idade digitada é: " + idadeInteiro1);
                soma = soma + idadeInteiro1;
            } else {
                System.out.println("Dado Invalido");
            }

            System.out.println("O valor total de todas as idades é: " + soma);
        }
    }
}
