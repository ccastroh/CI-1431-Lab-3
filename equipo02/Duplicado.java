import java.util.Random;
import java.util.Scanner;
public class Duplicado
{
  public static void llenarVector(int v[]) {
    Random r = new Random();
    for (int i = 0; i < v.length; i++) {
        v[i] = r.nextInt(100);
    }
    }
    public static boolean duplicados(int vector[]) {
        byte b = 0;
        for (int i = 0; i < vector.length;  i++) {
            for (int j = 0; j < vector.length; j++) {
        if (vector[i] == vector[j] && i != j) {
            b = 1;
            break;
        }
        }
        if (b == 1) {
            break;
        }
    }
    if (b == 1) {
        return true;
} else {
    return false;
}
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite la longitud deseada de su vector:");
    int a = scan.nextInt();
    int v[]  = new int[a];
    Duplicado.llenarVector(v);
    System.out.print("El vector: [ ");
    for (int i : v) {
        System.out.print(i + " ");
    }
    System.out.print("]");
    if (Duplicado.duplicados(v)) {
        System.out.println(" es duplicado");
} else {
    System.out.println(" no es duplicado");
}
}
}
