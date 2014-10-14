public class Palindromo {
    public static boolean esPalindromo(String hilera){
		boolean esPalindromo = true;
		
		String hileraTemp = hilera.trim().toLowerCase();
		for(int i = 0 ; i <= hileraTemp.length()-i ; ++i){
			if(hileraTemp.charAt(i) != hileraTemp.charAt(hileraTemp.length()-1-i)){
				esPalindromo = false;
			}
		}
		return esPalindromo;
	}
	public static void probarPalindromo(){
		String pruebas[] = {"reconocer","Radar","ABBA","Carlos","ABC"};
		
		for(String p : pruebas){
			if(esPalindromo(p)){
				System.out.println(p + " Si es palindromo"); 
			} else {
			 	  System.out.println(p + " No es palindromo");
			  }
		}
	}
}
