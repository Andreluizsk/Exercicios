public class sequenciaFibonacci {
    public static void main(String[] args) {

        int i = 0;
        int x = 1;
        while (x < 100) {
            i = x + i;
            x = i - x;
            System.out.println("A seguencia começando do 0 é: " + x );

           // System.out.println("A seguencia começando do 0 é: " + i );
        }

    }
}
