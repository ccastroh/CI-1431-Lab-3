import java.util.Random;
import java.util.Arrays;

public class Duplicados{
    
    public static void  llenarNumeros(int v[]) {
       
        Random r = new Random();
        
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(100);
        }        
        
    }

    public static boolean hayDuplicados(int numeros[]){
       boolean valor = false;
       for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " en la posición " + i);
       }
        
       
       for (int i=0; i<numeros.length; i++) {
           for (int j=i+1; j<numeros.length-1; j++){
               if (numeros[i] == numeros [j]){
                   valor = true;
               } 
           }
      
       }
     
     
        return valor;
    }
       
    
     public static void pruebaDuplicados(){
           int numeros[] = new int[5];
           llenarNumeros(numeros);
           if (duplicados (numeros)){
               System.out.println ("Se repite al menos un número");
           } 
           else {
               System.out.println ("No se repite ningún número");
           }
       
       
     }
    
}
