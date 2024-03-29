package com.felipe.cursojava.aula49;

public class Finally {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		
		int[] denom = {2, 0, 4, 8, 0};
		
		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero.");
				//System.exit(0); -> para e execução do programa - finally não será executado
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posição do array inválida.");
			} finally {
				System.out.println("Essa linha é impressa após o try ou catch.");
			}
		}

	}

}
