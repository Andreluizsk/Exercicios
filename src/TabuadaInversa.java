import javax.swing.*;

public class TabuadaInversa {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o Número que deseja ter os valores da tabuada");
        int TabuadaInversa = Integer.parseInt(valor);
        System.out.println("Tabuada do:  " + TabuadaInversa);
        for (int x = 10; x >= 1; x--) {
            System.out.print(x + " x " + TabuadaInversa + " = ");
            System.out.println(x * TabuadaInversa);
        }
    }
}
