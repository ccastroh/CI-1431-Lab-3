
public class Palindromo
{
    
    public static boolean palindromo(String texto) 
    {
       texto = texto.trim();
       int longitud = texto.length(); 
       String textoInverso ="";
          
           for (int i= 0; i<longitud; i++) {
               textoInverso=textoInverso+texto.charAt(longitud-1-i);
            }
           
           if (texto.equalsIgnoreCase(textoInverso)) {
               return true;
               
            }
            
      
       return false;
    }
    
    public static void pruebaPalindromo(){
        String pruebas[]= {"reconocer ", " Radar", "ABBA", "Carlos","ABC"};
        for (String p : pruebas) {
            System.out.println("La hilera: "+p);
            if (palindromo(p)) {
                System.out.println("SÍ es un palíndromo");
             } else{
                 System.out.println("NO es un palíndromo");
                }
            
        }
    }
   
}
    
