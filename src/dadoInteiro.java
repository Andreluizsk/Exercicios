import javax.swing.*;

public class dadoInteiro {
    public static void main(String[] args) {
        String dado1 = JOptionPane.showInputDialog("Digite um dado para saber se ele e inteiro");
        boolean eUmInteiro = dado1.matches("-?\\d+");
        int dado = 0;
        if(eUmInteiro == true ){
            dado = Integer.parseInt(dado1);
            System.out.println(dado1 + " E um numero inteiro");
        } else
        System.out.println(dado1 + " Não e um numero inteiro");
    }
}
