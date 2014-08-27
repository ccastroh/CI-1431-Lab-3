import java.util.Random;
import java.util.Arrays;

public class vectorDuplicado
{
      public static void llenarVector(int v[]) {
        Random r = new Random();
        
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(10);
        }        
    }
    
    public static boolean duplicados(int vector[]){
        
       
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " en la posición " + i);
       }
        
       for (int i=0; i<vector.length; i++) {
         for (int j=i+1; j<vector.length-1; j++){
           if (vector[i] == vector [j]){
               return true;
           }    
       }
      
        
     }
        return false;
    }
    
     public static void pruebaDuplicados (){
        int tamañoVector[] = new int[5];
        llenarVector(tamañoVector);
       
       if (duplicados (tamañoVector)==true){
        System.out.println ("Se repite al menos un numero");
        } else {
        System.out.println ("No se repite ningun numero");
        }
        }
    
    }

