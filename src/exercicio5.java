import java.util.Scanner;

public class exercicio5 {

   public static void main(String[] args) {

       Scanner sc = new Scanner (System.in);
       int valor[] = new int[2];
       int maior = 0, menor = 0;

       for(int i = 0; i < valor.length; i++){
           System.out.print("Digite o " +(i+1)+"º valor: ");
           valor[i] = sc.nextInt();
           if(valor[i] > maior){
               maior = valor[i];
           }
       }

       System.out.println("Maior valor = "+ maior);

   }
}

