package it.dstech.service;

import java.util.ArrayList;
import java.util.List;

public class Service {
	
	
	public List<String> checkPalindromo (String testo) {
		List<String> lista = new ArrayList<String>();
		String frase [] = testo.split(" ");
		List<String> palindromi = new ArrayList<String>();
		for (int i = 0; i < frase.length; i++) {
			lista.add(frase[i]);
		}
for (String parola : lista) {
	 String reverse = "";
     for (int i = parola.length() - 1; i >= 0; i--)
         reverse = reverse + parola.charAt(i);

       if (parola.equals(reverse)) {
     palindromi.add(parola);
   
   }

}   return palindromi;
}
	
	public int numeroParoleFrase (String testo) {
		String frase [] = testo.split(" ");
		return frase.length;
	}
	
	public long numeroParolePalindrome (String testo) {
		return checkPalindromo(testo).size();
	}
}

