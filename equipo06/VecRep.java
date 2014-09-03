import java.util.Random;

public class VecRep
{
    public static boolean duplicados(int[] ent){
        boolean respuesta = false;
        int[] aux = new int[ent.length];
        
        for(int i=0; i< ent.length; i++){
            aux[i] = ent[i];
        }
        
        for(int j=0; j<ent.length; j++){
            for (int h=0; h<ent.length; h++){
                if(h!=j){
                
                    if( aux[h] == ent[j]){
                    respuesta = true;
            
                    }
                }
            }
            
        }
    return respuesta;
    }
    
    public static void llenarVector (int v[]){
        Random r = new Random();
        
        for (int i=0; i<v.length; i++){
        v[i] = r.nextInt(100);
        }
    }
    
    public static void prueba(){
            int[] aleatorio1 = new int[3];
            int[] aleatorio2 = new int[10];
            int[] sinRepetir ={5,3,6,2,9};
            int[] conRepetir ={5,3,6,2,3};
            llenarVector(aleatorio1);
            llenarVector(aleatorio2);
            
            System.out.println("Primer vector aleatorio");
            for( int x : aleatorio1){
            System.out.print(x +" ");
            }
            System.out.println("\nRepetición de elementos: "+ duplicados(aleatorio1));
            
            System.out.println("\nSegundo vector aleatorio");
            for( int y : aleatorio2){
            System.out.print(y+" ");
            }
            System.out.println("\nRepetición de elementos: "+duplicados(aleatorio2));
            
            System.out.println("\nVector sin elementos repetidos");
            for( int w : sinRepetir){
            System.out.print(w+" ");
            }
            System.out.println("\nRepetición de elementos: "+duplicados(sinRepetir));
            
            System.out.println("\nVector con elementos repetidos");
            for( int y : conRepetir){
            System.out.print(y+" ");
            }
            System.out.println("\nRepetición de elementos: "+duplicados(conRepetir));
    }
}
