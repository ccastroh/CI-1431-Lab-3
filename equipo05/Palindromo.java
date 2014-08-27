/*
* No hecho por Andony
*/
public class Palindromo
{
    public static boolean esPalindromo(String texto){
      texto.trim();
      texto = texto.toLowerCase();
      char[] text = texto.toCharArray();
      
      int posicionAdelante = 0;
      int posicionAtras = text.length - 1;
      char c1;
      char c2;
      boolean iguales = true;
      while((posicionAdelante < posicionAtras)&&iguales){
          c1 = text[posicionAdelante];
          c2 = text[posicionAtras];
          if(c1 == ' '){
              posicionAdelante++;
          }
          else if(c2 == ' '){
              posicionAtras--;
          }
          else{
              if(c1 == c2){
                  posicionAdelante++;
                  posicionAtras--;
              }else{
                  iguales = false;
              }
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
