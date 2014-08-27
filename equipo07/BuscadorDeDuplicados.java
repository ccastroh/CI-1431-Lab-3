import java.util.Scanner;
import java.util.Random;

public class BuscadorDeDuplicados{

	public static void llenarVector(int vector[]){
		Random r = new Random();
		for (int i = 0; i < vector.length; i++){
			vector[i] = r.nextInt(100);
		}
	}

	public static boolean duplicados(int vector[]){
		boolean esDublipado = false;
		int j = 0;
		while ((esDublipado == false) && (j < vector.length - 1)){
			int i = j + 1;
			while((esDublipado == false) && (i < vector.length)){
				if(vector[i] == vector[j]){
					esDublipado = true;
				} else {
					esDublipado = false;
				}
				i++;
			}
			j++;
		}
		return esDublipado;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Cuantas entradas quiere que tenga su vector?");
		int entradas = scan.nextInt();
		int vector1[] = new int[entradas];
		llenarVector(vector1);
		System.out.println("Su vector aleatorio es: ");
		for (int f : vector1){
			System.out.print(f + " ");
		}

		if (duplicados(vector1))	{
			System.out.println(" \nHay algún número repetido en el vector");
		} else {
			System.out.println(" \nNo hay números repetidos en el vector");
		}
	}
}
