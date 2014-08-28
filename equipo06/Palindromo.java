public class Palindromo{

    public static boolean palindromo(String texto){
        boolean resultado;
        StringBuffer aux = new StringBuffer();
        
        for(int i=texto.length()-1; i>=0; i--){
        aux.append(texto.charAt(i));
        }
        
        String s = aux.toString();
        resultado =texto.equalsIgnoreCase(s);
        return resultado;
    
    
    
    }
    
    public static void pruebaPalindromo(){
        
        String pruebas[] ={"reconocer","Radar","ABBA","Carlos","ABC"};
        
        for(String p : pruebas){
        
          System.out.println("La hilera es: "+p);
             if(palindromo(p)){
                System.out.println("SI es un palíndromo");
             } else{
                System.out.println("NO es un palíndromo");
                }
        
        
        }
    
    }

}