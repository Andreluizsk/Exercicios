import javax.swing.*;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro Salario:");
        String valor1 = entrada.next().replace(",", ".");
        System.out.println("\nInforme o segundo Salario:");
        String valor2 = entrada.next().replace(",", ".");
        System.out.println("\nInforme o terceiro Salario:");
        String valor3 = entrada.next().replace(",", "."); */

        String valor1 = JOptionPane.showInputDialog(null, "Digite o primeiro Salario: " + "\n");
        boolean eUmInteiro = valor1.matches("-?\\d+");
        int qualNumero = 0;
        if (eUmInteiro == true) {
            qualNumero = Integer.parseInt(valor1);
        } else {
            System.out.println("Dado Invalido");
        }
        String valor2 = JOptionPane.showInputDialog(null, "Digite o segundo Salario: " + "\n");
        boolean eUmInteiro2 = valor2.matches("-?\\d+");
        int qualNumero2 = 0;
        if (eUmInteiro2 == true) {
            qualNumero2 = Integer.parseInt(valor2);
        } else {
            System.out.println("Dado Invalido");
        }
        String valor3 = JOptionPane.showInputDialog(null, "Digite o terceiro Salario: " + "\n");
        boolean eUmInteiro3 = valor3.matches("-?\\d+");
        int qualNumero3 = 0;
        if (eUmInteiro3 == true) {
            qualNumero3 = Integer.parseInt(valor3);
        } else {
            System.out.println("Dado Invalido");
        }

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3 ) / 3 ;
        System.out.println("A media dos Salarios e " + media);
        //entrada.close();
    }
}
