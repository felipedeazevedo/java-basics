package com.felipe.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int[][][] matrizTridimensional = new int[3][3][3];
		int soma = 0, somaPares = 0, somaImpares = 0;
		
		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					System.out.println("i = " + i + " - j = " + j + " - k = " + k + " = " + (matrizTridimensional[i][j][k] = i + j + k));
					matrizTridimensional[i][j][k] = i + j + k;
					
					soma += matrizTridimensional[i][j][k];
					
					if (matrizTridimensional[i][j][k] % 2 == 0) {
						somaPares += matrizTridimensional[i][j][k];
					} else {
						somaImpares += matrizTridimensional[i][j][k];
					}
				}
			}
		}
		
		
		for (int i = 0; i < matrizTridimensional.length; i++) {
			for (int j = 0; j < matrizTridimensional[i].length; j++) {
				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					System.out.print(matrizTridimensional[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		
		System.out.println("Soma total: " + soma);
		System.out.println("Soma dos pares: " + somaPares);
		System.out.println("Soma dos ímpares: " + somaImpares);
	}

}
