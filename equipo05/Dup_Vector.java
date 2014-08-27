import java.util.Random;

public class Dup_Vector
{
   public static void llenarVector(int v[]){
        Random r = new Random();
        for(int i = 0; i<v.length; i++){
            v[i] = r.nextInt(100);
        }
    }
    
    public static boolean duplicados(int v[]){
        boolean result = false;
        for(int i : v)
        {
            int cont = 0;
            for(int j : v)
            {
                if(i == j){
                    cont++;
                }
            }
            if(cont >= 2){
                 result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int vector[] = new int[10];
        Dup_Vector.llenarVector(vector);
        boolean result = Dup_Vector.duplicados(vector);
        String array = "";
        for(int i : vector)
        {
            array += i + ",";
        }
        System.out.println("[" + array + "]"); 
        if(result)
            System.out.println("Hay un valor repetido");
        else
            System.out.println("No hay un valores repetido");
    }
}
