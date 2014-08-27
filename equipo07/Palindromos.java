public class Palindromos
{
   
   public static boolean palindromo(String texto)
   {
       String t = texto.trim();
       char d[] = t.toCharArray();
       String c[] = new String [d.length] ;
       
       int j = 0;
       while (j < d.length)
       {
        c[j] += d[j];
        j++;
       }
       
       int i = 0;
       boolean f = true;
       
       while ((i < (c.length + 1)/2) && (f == true))
       {
          String s1 = c[i];
          String s2 = c[c.length - i - 1];
          
          if (s1.equalsIgnoreCase(s2))
          {
           f = true;
          } else {
           f = false;
          }
          i++;
       }
       
       return f;
   }
   
   public static void pruebaPalindromo() 
   {
       String pruebas[] = {"reconocer ", " Radar", "ABBA ", "Carlos", "ABC"};
       
       for (String p : pruebas) 
       {
          System.out.print("La hilera: " + "\""  + p + "\"");
          if (palindromo(p)) 
          {
           System.out.println(" SI es un palíndromo");
          } else {
           System.out.println(" NO es un palíndromo");
          }
       }
   }
   
}
