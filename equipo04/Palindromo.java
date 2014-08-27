
public class Palindromo
{
    public static boolean esPalindromo(String texto){
        String t = texto;
        boolean palindromo = false;
        String t2 = t.trim();
   
        char[] vectorT = t2.toCharArray();
        int size = vectorT.length;
        char[] vectorT2 = new char[size];
        for( int i = size-1; i >= 0; i--){
            int j = 0;
            vectorT2[j++] = vectorT[i];
        }
        String t3 = String.valueOf(vectorT2);
        
        boolean comparacion = t2.equalsIgnoreCase(t3);
        
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
