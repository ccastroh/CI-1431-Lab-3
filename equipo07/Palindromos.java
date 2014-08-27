public class Palindromos {
   
   public static boolean palindromo(String texto) {
       String textoSinEspacios = texto.trim();
       char textoComoArray[] = textoSinEspacios.toCharArray();
       String textoNuevo[] = new String [textoComoArray.length] ;
       
       int j = 0;
       while (j < textoComoArray.length) {
        textoNuevo[j] += textoComoArray[j];
        j++;
       }
       
       int i = 0;
       boolean esPalindromo = true;
       
       while ((i < (textoNuevo.length + 1)/2) && (esPalindromo == true)) {
          String letra1 = textoNuevo[i];
          String letra2 = textoNuevo[textoNuevo.length - i - 1];
          
          if (letra1.equalsIgnoreCase(letra2))
          {
           esPalindromo = true;
          } else {
           esPalindromo = false;
          }
          i++;
       }
       
       return esPalindromo;
   }
   
   public static void pruebaPalindromo() {
       String pruebas[] = {"reconocer ", " Radar", "ABBA ", "Carlos", "ABC"};
       
       for (String p : pruebas) {
          System.out.print("La hilera: " + "\""  + p + "\"");
          if (palindromo(p)) 
          {
           System.out.println("SÍ es un palíndromo");
          } else {
           System.out.println("NO es un palíndromo");
          }
       }
   }
   
}
