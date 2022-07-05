import javax.swing.*;

public class GastosNewAppDiario {
 public static void main(String[] args) {


        double cxCerveja = 32.50;
        double cerveja = 30 * cxCerveja;
        System.out.println("O gasto mensal com a cerveja é " + cerveja);
        int valorAçougue = 50;
        int açougue = 30 * valorAçougue;
        System.out.println("O gasto mensal com açougue é " + açougue);
        int internet = 100;
        System.out.println("O valor da internet é: " + internet);
        int valorAlmoço = 30;
        int almoço = 30 * valorAlmoço;
        System.out.println("O gasto mensal com almoço e de: " + almoço);
        double totalMes = cerveja + açougue + internet + almoço;
        System.out.println("O gasto total por mês e de: " + totalMes);
        double valorDia = totalMes / 30;
        System.out.println("O valor gasto por dia é " + valorDia);


        String dias = JOptionPane.showInputDialog("Informe o Número que deseja ter os valores da tabuada");
        int custos  = Integer.parseInt(dias);
        System.out.println(custos);

        int x = 115;
       //System.out.println(custos);
        System.out.println(x * custos);
    }
}
