import java.util.Random;
import java.util.Arrays;


public class Vector
{
    public static void llenarVector( int v[]){
        Random r = new Random();
        for (int i = 0; i < v.length; i++){
            v[i] = r.nextInt(100);
        }
    }
    
    public static boolean duplicados(){
        int repetidos = 0;
        boolean duplicado = false;
        int numeros[] = new int[10];
        llenarVector(numeros);
        System.out.println(Arrays.toString(numeros));
        
        int numeros2[] = new int[10];
        numeros2 = numeros;
        
        for( int i=0; i < numeros.length; i++){
            for( int j=0; j < numeros2.length; j++){
                if( numeros[i] == numeros2[j] && i != j){
                    repetidos++;
                }
            }
        }
        
        if( repetidos != 0){
            duplicado = true;
        }
        
        return duplicado;
    }
}
