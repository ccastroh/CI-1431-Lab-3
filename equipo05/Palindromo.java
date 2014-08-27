
public class Palindromo
{
    public static boolean esPalindromo(String texto){
      texto.trim();
      texto = texto.toLowerCase();
      
      boolean iguales = true;
      char[] text = texto.toCharArray();
      
      int posicionAdelante = 0;
      int posicionAtras = text.length - 1;
      
      while(posicionAdelante < posicionAtras)
      {
          char c1 = text[posicionAdelante];
          char c2 = text[posicionAtras];
          if(c1 == ' '){
              posicionAdelante++;
          }
          else if(c2 == ' '){
              posicionAtras--;
          }
          else{
              if(c1 != c2){
                  iguales = false;
                  break;
              }
              posicionAdelante++;
              posicionAtras--;
          }
      }
      return iguales;
    }
    
        public static void pruebaPalindromo(){
        String pruebas[] = {"reconocer", "Radar", "ABBA", "Carlos", "ABC"};
        
        for(String p : pruebas){
            System.out.print("La hilera: " + p);

            if(esPalindromo(p)){
                System.out.println(" SI es un palíndromo");
            } else{
                System.out.println(" NO es un palíndromo");
            }
        }
    }
}
