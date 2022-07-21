import javax.swing.*;

public class DiaSemana {
    public static void main(String[] args) {
        String Dia = JOptionPane.showInputDialog("Qual o dia da semana?");
        System.out.println(Dia);

        if ("Domingo" .equalsIgnoreCase(Dia)) {
            System.out.println(1);
        }   else if("Segunda" .equalsIgnoreCase(Dia)) {
            System.out.println(2);
        }   else if("terça" .equalsIgnoreCase(Dia)) {
            System.out.println(3);
        }   else if("quarta" .equalsIgnoreCase(Dia)) {
            System.out.println(4);
        }   else if("quinta" .equalsIgnoreCase(Dia)) {
            System.out.println(5);
        }   else if("Sexta" .equalsIgnoreCase(Dia)) {
            System.out.println(6);
        }   else if("Sabado" .equalsIgnoreCase(Dia)) {
            System.out.println(7);
        }    else{
            System.out.println("Dado Inválido");
        }
    }
}