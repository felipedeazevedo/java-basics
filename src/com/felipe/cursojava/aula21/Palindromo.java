package com.felipe.cursojava.aula21;

public class Palindromo {

	public static void main(String[] args) {
		
		boolean palindromo;
		
		palindromo = ehPalindromo("arara");
		
		System.out.println(palindromo);
		
		if (palindromo == true) {
			System.out.println("Palíndromo");
		} else {
			System.out.println("Não é palíndromo");
		}

	}
	
	private static boolean ehPalindromo(String palavra) {
		
		String palavraInvertida = "";
		char caracter;
		
		for (int i = 0; i < palavra.length(); i++) {
			caracter = palavra.charAt(i);
			palavraInvertida += caracter;
		}
		
		System.out.println(palavraInvertida);
		
		if (palavraInvertida == palavra) {
			return true;
		} else {
			return false;
		}
	}

}
