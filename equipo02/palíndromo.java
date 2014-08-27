public class palíndromo
{
public static boolean palindromo(String texto) {
    int b = 0;
    String a = texto.trim().toLowerCase();
for (int i = 0; i < (int) (a.length() + 1) / 2; i++) {
    if (a.charAt(i) != a.charAt((a.length() - i - 1))) {
        b = 1; 
        break; 
       }
    }
    if (b == 1) {
        return false;
} else {
    return true;
}
}
public static void pruebaPalindromo() {
    String pruebas[] = {"reconocer ", " Radar", "ABBA ", "Carlos", "ABC"};
    
    for (String p : pruebas) {
        System.out.println("La hilera: " + p);
        if (palindromo(p)) {
            System.out.println( " SI es un palíndromo");
        } else {
            System.out.println(" NO es un palíndromo");
}
}
}
}
