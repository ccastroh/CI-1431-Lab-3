import java.util.Random;
import java.util.Arrays;

public class Vector
{
    public static void llenarVector( int vector[]){
        Random aleatorio = new Random();
        for (int i = 0; i < vector.length; i++){
           vector[i] = aleatorio.nextInt(100);
        }
    }
    
    public static boolean duplicados(){
        int repetidos = 0;
        boolean duplicado = false;
        int numeros[] = new int[10];
        llenarVector(numeros);
        System.out.println(Arrays.toString(numeros));
        
        for( int i=0; i < numeros.length; i++){
            for( int j=0; j < numeros.length; j++){
                if(numeros[i] == numeros[j] && i != j){
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
