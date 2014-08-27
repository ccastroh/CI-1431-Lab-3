import java.util.Random;
import java.util.Arrays;

public class vectorDuplicado{
  /**
   * @param v es un vector de int q se llenará al azar con numeros del 1 al 10
   * 
   */ 
  public static void llenarVector(int v[]) {
    Random r = new Random();
    
    for (int i = 0; i < v.length; i++){
      v[i] = r.nextInt(10);
    }        
  }
  
  /**
   * @param vector es un vector de enteros que se desplegará en la terminal
   */ 
  public static void imprimir(int[] vector){
    for (int i = 0; i < vector.length; i++){
      System.out.println(vector[i] + " en la posicion " + i);
    }
  }
  
  /**
   * @param vector es un vector de enteros en el cual se burcara si se repiten numeros en el vector
   * 
   */ 
  public static boolean duplicados(int vector[]){
    imprimir(vector);
    for (int i=0; i<vector.length; i++){
      for (int j=i+1; j<vector.length-1; j++){
        if (vector[i] == vector [j]){
          return true;
        }    
      }
    }
    
    return false;
  }
  
  public static void main(String [] args){
    int tamanoVector[] = new int[5];
    llenarVector(tamanoVector);
    if (duplicados (tamanoVector)==true){
      System.out.println ("Se repite al menos un numero");
    } else {
      System.out.println ("No se repite ningun numero");
    }
  }
  
}

