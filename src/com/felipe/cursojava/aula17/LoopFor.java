package com.felipe.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		
		for (int i=0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		for (int i=5; i > 0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		for (int i=0, j=10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		int count = 0;
		for ( ; count < 10; ){
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		System.out.println("count: " + count);
		
		for (int cont=0; cont < 10; cont += 2) {
			System.out.println("valor de cont: " + cont);
		}
		
		// soma incrementada
		int soma = 0;
		for (int i=1; i < 5; soma += i++);
			System.out.println("O valor da soma é: " + soma);
			
		// for sem chaves não é uma boa prática;	
		for (int i=0; i < 5; i++)
			System.out.println("i tem valor: " + i);
			System.out.println("i tem valor: ");
	}

}
