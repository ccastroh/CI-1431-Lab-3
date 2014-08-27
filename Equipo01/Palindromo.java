
public class Palindromo
{
  
    public static boolean esPalindromo (String letras){
        boolean valor = false;
        letras = letras.trim();
        int tamanoLetras= letras.length () -1;
        String reverso = ""; 
        for (int i=tamanoLetras; i>-1; i--){
            reverso = reverso+ letras.charAt(i);
        }
     
        if (letras.equalsIgnoreCase (reverso)){
            valor = true;
        }else {
            valor = false; 
        }
        return valor; 
    }
  
    public static void pruebaPalindromo() { 
        String pruebas [] = {"reconocer", "Radar","ABBA","Carlos","ABC"};
        for (String p : pruebas){
            System.out.print("La hilera: " + p);
            if (palindromo (p)) {
                System.out.println (" SI es palíndromo");
            } else {
                System.out.println (" NO es palíndromo");
            }                         
        }
    } 
}
