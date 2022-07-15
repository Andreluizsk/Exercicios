import javax.swing.*;

public class antecessorSucessor {
    /* Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.*/
    public static void main(String[] args) {
        int sucessor = 0;
        int antecessor = 0;
        int numeroIteiro = 0;

        String numeroInteiro = JOptionPane.showInputDialog(null, "Digite um numero inteiro" + "\n");
        boolean eUmInteiro = numeroInteiro.matches("-?\\d+");
        int qualNumero = 0;
        if (eUmInteiro == true) {
            qualNumero = Integer.parseInt(numeroInteiro);
        } else {
            System.out.println("Dado Invalido");
        }
        sucessor = qualNumero + 1;
        antecessor = qualNumero -1;

        System.out.println("O numero inteiro e " + numeroInteiro);
        System.out.println(" O antecessor e " + antecessor );
        System.out.println(" O Sucessor e " + sucessor );
    }
}
