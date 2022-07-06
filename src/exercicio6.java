import javax.swing.*;

public class exercicio6 {
    public static void main(String[] args) {

        String anoNascimento = JOptionPane.showInputDialog("Qual a sua data de nascimento");
        int idade = 2022 - Integer.parseInt(anoNascimento) ;
        System.out.println("A minha idade e " + idade );

        if	(idade <= 18 ) {
            System.out.println("Não	pode votar");
        }
        else	{
            System.out.println("Pode votar");
        }

    }
}
