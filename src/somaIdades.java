import javax.swing.*;

public class somaIdades {
    public static void main(String[] args) {
        String quantos = JOptionPane.showInputDialog(null, "Informe quantas idade quer saber?" + "\n");
        int numeroDePessoas = Integer.parseInt(quantos);
        int quantidade = numeroDePessoas;
        int soma = 0;
        for (int i = 0; i < quantidade; i++) {

            String idade1 = JOptionPane.showInputDialog(null, "Informe a Idade " + "\n");
            int idadeInteiro1 = Integer.parseInt(idade1);
            System.out.println(idadeInteiro1);
            soma = soma + idadeInteiro1;
        }
        System.out.println("O valor total de todas as idades é: " + soma);
    }
}
