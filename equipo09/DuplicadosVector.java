import java.util.Random;

public class DuplicadosVector{
    
    private static int vectorNumeros[];
    
    public DuplicadosVector(){
        vectorNumeros = new int[3];
    }
    
    public static void main (String args []) {
        DuplicadosVector dv = new DuplicadosVector();
        dv.llenarVector(vectorNumeros);
        System.out.println(dv.duplicados(vectorNumeros));
        
    }
    
    
    public static void llenarVector(int v[]) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(100);
        }
    }   
    public static boolean duplicados(int vector[]){
        boolean repetido = false;
        
        for (int i = 0; i < vector.length; i++){
            for (int j = i + 1; j < vector.length; j++){
                if (vector[i] == vector[j]){
                    repetido = true;
                    break;
                }
            }
            if(repetido){
                break;
            }
        }
        return repetido;
    }
}
