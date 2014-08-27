import java.util.Scanner;
import java.util.Random;

public class VectorRepetido
{
    
    public static void llenarVector(int v[]) 
    {
       Random r = new Random();
       for (int i = 0; i < v.length; i++) 
       {
           v[i] = r.nextInt(100);
       }
    }
    
    public static boolean duplicados(int vector[]) 
    {
       boolean a = false;
       int j = 0;
       while ((a == false) && (j < vector.length - 1))
       {
           int i = j + 1;
           while((a == false) && (i < vector.length))
           {
               if(vector[i] == vector[j])
               {
                a = true;
               } else {
                a = false;
               }
               i++;
           }
           j++;
       }
       return a;
    }

    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("¿Cuantas entradas quiere que tenga su vector?");
       int e = scan.nextInt();
       int v1[] = new int[e];
       llenarVector(v1);
       System.out.println("Su vector aleatorio es: ");
       for (int f : v1)
       {
          System.out.print(f + " ");
       }
       
       if (duplicados(v1))
       {
           System.out.println(" \nHay algún número repetido en el vector");
       } else {
           System.out.println(" \nNo hay números repetidos en el vector");
       }
    }
}
