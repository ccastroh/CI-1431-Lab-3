
public class Palindromo {
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
    
    public static void pruebaPalindromo() {
        String pruebas[] = {"reconocer ", " Radar", "ABBA ", "Carlos", "ABC"};
        
        for (String p : pruebas) {
            System.out.print("La hilera: " + p );
            if (palindromo(p)) {
                System.out.println(" SI es un palíndromo");
            } else {
                System.out.println(" NO es un palíndromo");
            }
        }
    }
    
    public static void main (String args []){
        Palindromo p = new Palindromo();
        p.pruebaPalindromo();
    }
}
