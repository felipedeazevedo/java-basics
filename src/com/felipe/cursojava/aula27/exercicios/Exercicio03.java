package com.felipe.cursojava.aula27.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno:");
		aluno.nome = scan.next();
		
		System.out.println("Informe o nome do curso:");
		aluno.curso = scan.next();
		
		System.out.println("Informe a matrícula do aluno:");
		aluno.matricula = scan.next();
		
		aluno.disciplinas = new String[3];
		aluno.notasDisciplinas = new double[aluno.disciplinas.length][4];
		
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Informe a " + (i + 1) + "ª disciplina:");
			aluno.disciplinas[i] = scan.next();
		}
		
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + aluno.disciplinas[i]);
			for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Informe a nota " + (j + 1));
				aluno.notasDisciplinas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarDisciplinas(aluno.disciplinas);
		
		aluno.mostrarNotas(aluno.notasDisciplinas);
		
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			if (aluno.verificarAprovacao(i)) {
				System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi reprovado");
			}
		}
	}

}
