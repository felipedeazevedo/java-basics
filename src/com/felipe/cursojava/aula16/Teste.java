package com.felipe.cursojava.aula16;

import java.text.Normalizer;

public class Teste {

	public static void main(String[] args) {
		String src = "lçkjfasdolfierESRERERºººººééú´RÝ.docx";
		
		
		String string = Normalizer.normalize(src, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		String string2 = Normalizer.normalize(src, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
		

		
		
		System.out.println(string);
		System.out.println(string2);

	}

}
