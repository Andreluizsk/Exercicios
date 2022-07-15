public class Fibonacci {
    public static void main(String[] args) {
        /*  Imprima	 os primeiro números	 da	 série	 de Fibonacci até passar	 de 100. A  série de
Fibonacci é a seguinte:	0,1,1,2,3,5,8,13,21, etc.	Para	calculá-la, o primeiro elemento vale 0,	o
segundo	vale	1, e daí por diante. O	n-ésimo	elemento vale	o (n-1)-ésimo	elementosomado	ao (n-2)-ésimo elemento (ex:8 = 5 + 3).*/
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