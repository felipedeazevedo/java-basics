package com.felipe.cursojava.aula27.exercicios;

public class Aluno {
	
	String nome;
	String matricula;
	String curso;
	String[] disciplinas;
	double[][] notasDisciplinas;
	
	boolean verificarAprovacao(int index) {
		int countAprovacao = 0;
		double soma = 0, media = 0;
		
		for (int i = 0; i < notasDisciplinas[index].length; i++) {
			soma += notasDisciplinas[index][i];
		}
		
		media = soma / 4;
		
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
	void mostrarDisciplinas(String[] disciplinas) {
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplina " + (i + 1) + ": " + disciplinas[i]);
		}
	}
	
	void mostrarNotas(double[][] notas) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Disciplina: " + disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
