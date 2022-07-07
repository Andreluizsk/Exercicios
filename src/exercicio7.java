import javax.swing.*;

public class exercicio7 {
    public static void main(String[] args) {
        int senha = 1234;

        String informeSenha = JOptionPane.showInputDialog("Digite sua Senha");
        int minhaSenha = Integer.parseInt(informeSenha);
        if	(minhaSenha == senha ) {
            System.out.println("Bem vindo");
        }
        else	{
            System.out.println("Senha invalida");
        }
    }
}
