package com.felipe.cursojava.aula28;

import com.felipe.cursojava.aula27.Carro;
import com.felipe.cursojava.aula20.*; // não é bonito/elegante - não fica explícito o que tá sendo usado

public class Pacotes {

	public static void main(String[] args) {
		
		Carro carro;
		com.felipe.cursojava.aula24.Carro carro2 = new com.felipe.cursojava.aula24.Carro();
		
		carro2.marca = "Mercedes";
		
		System.out.println(carro2.marca);
	}

}
