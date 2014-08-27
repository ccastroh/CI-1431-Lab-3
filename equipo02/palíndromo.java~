public class Palíndromo{

    public static boolean palindromo(String texto) {
        int b = 0;
        String a = texto.trim().toLowerCase();
        boolean condicion = true;
	int i = 0;
        while ((i < (int) (a.length() + 1) / 2) && condicion) {
            if (a.charAt(i) != a.charAt((a.length() - i - 1))) {
                b = 1; 
                condicion = false; 
             }//final if
             i++;
        }//final for
        
	return condicion;

     }//final palindromo


    public static void pruebaPalindromo() {
        String pruebas[] = {"reconocer ", " Radar", "ABBA ", "Carlos", "ABC"};
    
        for (String p : pruebas) {
            String salida = "La hilera: " + p;
            if (palindromo(p)) {
                salida += " SI es un palíndromo";
            } 
            else {
                salida += " NO es un palíndromo";
            }
	    
            System.out.println(salida);
            salida = "";
        }//final for
    }//final pruebaPalindromo
}//final de la clase
