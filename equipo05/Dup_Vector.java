/*
	Programa supuestamente hecho por Jesús Torres en un dia 
	sin inspiracion. 
*/

import java.util.Random;

/*
     Esta clase verifica si un vector tiene elementos repetidos.

*/

public class Dup_Vector
{
   public static void llenarVector(int v[]){
        Random r = new Random();
        for(int i = 0; i<v.length; i++){
            v[i] = r.nextInt(100);
        }
    }
    /*
		recorre el vector buscando elementos que se repitan
	*/
    public static boolean duplicados(int v[]){
        boolean result = false;
        for(int i : v){

            int cont = 0;
            for(int j : v){

                if(i == j){
                    cont++;
                }
            }
            if(cont == 2){
                 result = true;
	         i = v.length();
		 j = v.length(); 
            }
        }
        return result;
    }

    public void imprimir(){

        boolean result = Dup_Vector.duplicados(vector);
	
        String array = "";	
	for (int i: vector){
		array += i + ",";
	}
	System.out.println("[" + array + "]");
	if(result){
            System.out.println("Hay un valor repetido");
       } else{
            System.out.println("No hay un valores repetido");
	}	
	   	
}

    public static void main(String[] args) {
        int vector[] = new int[10];
        Dup_Vector.llenarVector(vector);
        Dup_Vector.imprimir();
}
