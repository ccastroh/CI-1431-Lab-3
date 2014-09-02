/**
 * Código aportado por el profesor Carlos Andres Castro
 * Aqui iria la licencia del código
 */


/**
 * Verifica que una hilera sea palindromo
 * y cuenta con caso de prueba de palabras que cumplen
 * con esta propiedad o no. */
public class Palindromo {
	
	/**
	 * Recibe una hilera de tezto, le suprime los espacios al principio
	 * y al final. Guarda la hilera de manera invertida y luego la compara con la original
	 * si son iguales retorna verdadero*/
    public static boolean palindromo(String texto) {
        boolean esPalindromo = false;
        String textoInvertido = "";
        texto = texto.trim();
        
        for (int i = texto.length() - 1; i >= 0; i--){
            textoInvertido += texto.charAt(i);
        }
        if(textoInvertido.equalsIgnoreCase(texto)){
            esPalindromo = true;
        }
        
        return esPalindromo;
    }
    
    /**
     * Metodo que muestra casos de prueba de hileras
     * para mostrar en pantalla si son palindromos
     * Al ser un metodo estatico no es necesario instanciar el vector
     * para llamarlo*/
    public static void pruebaPalindromo() {
        String pruebas[] = {"reconocer ", " Radar", "ABBA ", "Carlos", "ABC"};
        
        for (String p : pruebas) {
            System.out.print("La hilera: " + p );
            if (palindromo(p)) {
                System.out.println(" SI es un palindromo");
            } else {
                System.out.println(" NO es un palinndromo");
            }
        }
        
    }
    
    public static void main (String args []){
    	/* No hay que crear instancia de la clase
    	 * para usar los metodos, son estaticos*/
        if(palindromo("Ana ")){
        	System.out.println("Ana es un palindromo");
        }
        pruebaPalindromo();
    }
}

