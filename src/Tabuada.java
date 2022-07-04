import javax.swing.*;

public class Tabuada {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o Número que deseja ter os valores da tabuada");
        int tabuada  = Integer.parseInt(valor);
        System.out.println("Tabuada do:  "  + tabuada);
        for(int x = 1; x <= 10; x++) {
            System.out.print(x + " x " + tabuada + " = ");
            System.out.println(x * tabuada);

        }

    }
}
