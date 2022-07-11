import javax.swing.*;

public class somaIdade {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {

            String idade1 = JOptionPane.showInputDialog(null, "Informe a Idade " + "\n");
            int idadeInteiro1 = Integer.parseInt(idade1);
            System.out.println(idadeInteiro1);
            soma = soma + idadeInteiro1;
        }
        System.out.println("O valor total de todas as idades é: " + soma);
    }
}

 /*public static void main(String[] args) {
        int idade1 = 10;
        int idade2 = 11;
        int idade3 = 12;
        int idade4 = 13;
        int idade5 = 14;


        int idade = idade1 + idade2 + idade3 + idade4 + idade5;
        System.out.println("A soma das idades é " + idade);
*/


