import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;
public class Vector
{
    static int v[];
    
    public Vector()
    {
        v = new int[10];        
    }

    public static void llenarVector(int v[])
    {
        Random r = new Random();
        for(int i = 0; i < v.length; i++)
        {
            v[i] = r.nextInt(100);
        }
    }

    public static boolean duplicados(int vector[])
    {
        boolean duplicado = false;
        Integer [] newV = new Integer[vector.length];
        for(int i = 0 ; i < vector.length ; i++)
        {
            newV[i] = Integer.valueOf(vector[i]);
        }
        HashSet hash = new HashSet<Integer>(Arrays.asList(newV));;
        duplicado =  vector.length != hash.size();
        System.out.println(vector.length != hash.size());
        return duplicado;
    }
        
    public static void main(String [] args)
    {
        Vector vector = new Vector();
        vector.llenarVector(v);
        vector.duplicados(v);
        
    }
}
