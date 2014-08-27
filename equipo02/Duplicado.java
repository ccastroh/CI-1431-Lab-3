import java.util.Random;
import java.util.Scanner;

public class Duplicado{
   public static void llenarVector(int v[]) {
      Random r = new Random();
      for (int i = 0; i < v.length; i++) {
          v[i] = r.nextInt(100);
      }
   }
    
   public static boolean duplicados(int vector[]) {
       byte b = 0;
       int i = 0;
       int j = 0;
       boolean resultado = false;
       while(i < vector.length){
           while(j < vector.length) {
               if (vector[i] == vector[j] && i != j) {
                   b = 1;
                   j = vector.length;
               }
	       j++;
           }
           if (b == 1) {
              i = vector.length;
           }
       }

       if (b == 1) {
           resultado = true;
       }

       return resultado;
   }

   public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Digite la longitud deseada de su vector:");
         int a = scan.nextInt();
         int v[]  = new int[a];
         Duplicado.llenarVector(v);
	 String fin = "El vector: [ ";
         for (int i : v) {
             fin +=i + " ";
         }
         fin += "]";
         if (Duplicado.duplicados(v)) {
             fin += " es duplicado";
         }else {
             fin += " no es duplicado";
         }
	 System.out.println(fin);
   }    
}
