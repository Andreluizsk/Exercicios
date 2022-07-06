public class PitSmoker {

        public static void main(String[] args) {

            double CostelaBovinakg = 29.86 * 1.7;
            double CostelaB = 7 * CostelaBovinakg;
            System.out.println("O gasto semanal com a costela bovina é " + CostelaB);
            double CostelaSuinaKg = 25.96 * 1.35;
            double costelaS = 7 * CostelaSuinaKg;
            System.out.println("O gasto semanal com a costela Suina é " + costelaS);
            double AlmondegasKg = 29.99;
            double Almondegas = 7 * AlmondegasKg;
            System.out.println("O gasto semanal com as almondegas é " + Almondegas);
            double LimguiçaKg = 18.96 * 1.6;
            double Limguiças = 7 * LimguiçaKg;
            System.out.println("O gasto semanal com as limguiças é " + Limguiças);
            double PeitoBovinoKg = 27.99 * 1.7;
            double peitoB = 7 * PeitoBovinoKg;
            System.out.println("O gasto semanal com as peito bovino é " + peitoB);
            double Hamburger = 7.99;
            double HamburgerG = 50 * 7 * Hamburger;
            System.out.println("O gasto semanal com as hamburger é " + HamburgerG);
            double semanal = CostelaB + costelaS + Almondegas + peitoB + HamburgerG;
            System.out.println("O gasto total por semanal e de: " + semanal);
            double valorDia = semanal / 30;
            System.out.println("O valor gasto por dia é " + valorDia);

        }
    }
