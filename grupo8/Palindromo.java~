/*
Autor: Estudiante de programacion I
Primer semestre 2014
*/

import java.lang.StringBuilder;
public class Palindromo{

/*
*Hice este método porqué en las instrucciones decía 
*que llamará a esPalindromo, no a palindromo
*/       
    public static boolean esPalindromo(String texto) {
        boolean palindromo;
        String [] textoArray;
        StringBuilder temp = new StringBuilder();
        texto = texto.trim().toLowerCase();
        textoArray = texto.split("\\s+");
        for(int i = 0; i < textoArray.length; i++) {
            temp.append(textoArray[i]);
        }
        String textoSinEspacios = temp.toString();
        palindromo = textoSinEspacios.equals(new StringBuilder(textoSinEspacios).reverse().toString());
        return palindromo;
    } 

/*
Metodo para probar el palindromo
*/
    public static void pruebaPalindromo(){
        String pruebas [] = {"reconocer ", " Radar", "ABBA", "Carlos", "ABC"};

        for(String p: pruebas) {
            System.out.print("La hilera:" + p);
            if(esPalindromo(p))
            {
                System.out.println(" SI es un palíndromo");
            }else
            {
                System.out.println(" NO es un palíndromo");
            }
        }

    }  
}
