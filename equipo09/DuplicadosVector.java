/*
 * Autor: Código aportado por el profesor Carlos Andres Castro
 * Debería estar la licencia del Código   
 */

import java.util.Random;

/**
 * Clase que verifica si se encuentra algun elemento 
 * duplicado en un vector 
 */
public class DuplicadosVector{
    
    private static int vectorNumeros[];
    
    /** Construye un nuevo vector de enteros para ser implementado en la clase */
    public DuplicadosVector(int dimension){
        vectorNumeros = new int[dimension];
    }
    
    /** Método de tipo void llena el vector con números aleatorios del 1 al 99 */
    public static void llenarVector(int v[]) {
        Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(100);
        }
    } 
    
    /** 
     * Método que verifica si en el contenido del vector hay elementos repetidos
     * Retorna el resultado de tipo booleano donde indica si hubieron elementos iguales o no 
     */
    public static boolean duplicados(int vector[]){
        boolean repetido = false;        
        for (int i = 0; i < vector.length || repetido; i++){
            for (int j = i + 1; j < vector.length; j++){
                if (vector[i] == vector[j]){
                    repetido = true;
                }
            }
        }
        return repetido;
    }
    
    /** Main del programa, crear las intancias necesarias para la correcta ejecución*/
    public static void main (String args []) {
        DuplicadosVector duplicadoVector = new DuplicadosVector(5);
        duplicadoVector.llenarVector(vectorNumeros);
        System.out.println(duplicadoVector.duplicados(vectorNumeros));       
    } 
}