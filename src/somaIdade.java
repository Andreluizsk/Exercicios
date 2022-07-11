import javax.swing.*;

public class somaIdade {
    public static void main(String[] args) {

        String idade1 = JOptionPane.showInputDialog(null, "Informe a Idade " + "\n");
        int idadeInteiro1 = Integer.parseInt(idade1);
        System.out.println(idadeInteiro1);
        String idade2 = JOptionPane.showInputDialog("Informe a Idade");
        int idadeInteiro2 = Integer.parseInt(idade2);
        System.out.println(idadeInteiro2);
        String idade3 = JOptionPane.showInputDialog("Informe a Idade");
        int idadeInteiro3 = Integer.parseInt(idade3);
        System.out.println(idadeInteiro3);
        String idade4 = JOptionPane.showInputDialog("Informe a Idade");
        int idadeInteiro4 = Integer.parseInt(idade4);
        System.out.println(idadeInteiro4);
        String idade5 = JOptionPane.showInputDialog("Informe a Idade");
        int idadeInteiro5 = Integer.parseInt(idade5);
        System.out.println(idadeInteiro5);

        int idade = idadeInteiro1 + idadeInteiro2 + idadeInteiro3 + idadeInteiro4 + idadeInteiro5;
        System.out.println("A idade das 5 pessoas é : " + idade);

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


