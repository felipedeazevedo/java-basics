package com.felipe.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int num = scan.nextInt();
		
		System.out.println("Informe um limite:");
		int limite = scan.nextInt();
		
		for (int i = num; i <= limite; i++) {
			
			if (i % 7 == 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
