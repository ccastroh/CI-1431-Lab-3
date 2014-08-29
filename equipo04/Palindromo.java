
public class Palindromo
{
    public static boolean esPalindromo(String texto){
        String hilera = texto;
        boolean palindromo = false;
        String copiaHilera = texto;
   
        char[] vectorT = copiaHilera.toCharArray();
        int size = vectorT.length;
        char[] vectorT2 = new char[size];
		int j = 0;
        for( int i = size-1; i >= 0; i--){
            
            vectorT2[j++] = vectorT[i];
        }
        String  hileraConvertido = String.valueOf(vectorT2);
        
        boolean comparacion = copiaHilera.equalsIgnoreCase(hileraConvertido);
        
        if( comparacion ){
            palindromo = true;
        }
        
        return palindromo;
    }
    
    public static void pruebaPalindromo(){
        String pruebas[] = {"reconocer ", " Radar", "ABBA", "Carlos", "ABC"};
        
        for(String p : pruebas) {
            System.out.println("La hilera: " + p );
            if(esPalindromo(p)) {
                System.out.println(" SI es un palíndromo");
            } else {
                System.out.println(" NO es un palíndromo");
            }
        }
    }
}
