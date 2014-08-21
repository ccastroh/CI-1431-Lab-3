import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase con dibujitos en ASCII
 * 
 * @author Carlos A Castro
 */
public class AsciiArt {
    public AsciiArt() {
    }
    
    public void imprimir(String archivo) throws IOException{
    	BufferedReader reader = new BufferedReader(new FileReader(archivo));
    	String linea;
    	while ((linea = reader.readLine()) != null) {
    		System.out.println(linea);
    	}
    	System.out.println();
    }
    
    public void arte970836() throws IOException {
    	imprimir("res/970836.txt");
        // OJO UN CAMBIO
    }
    
    public static void main(String[] args) {
    	AsciiArt arte = new AsciiArt();
    	try {
    		arte.arte970836();
    	} catch (IOException e) {
			System.out.println("Se dió el siguiente error: " + e.getMessage());
		}
    }

}
