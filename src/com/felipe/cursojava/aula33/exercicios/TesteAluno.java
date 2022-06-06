package com.felipe.cursojava.aula33.exercicios;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno:");
		aluno.setNome(scan.next());
		
		System.out.println("Informe o nome do curso:");
		aluno.setCurso(scan.next());
		
		System.out.println("Informe a matrícula do aluno:");
		aluno.setMatricula(scan.next());
		
		aluno.setDisciplinas(new String[3]);
		aluno.setNotasDisciplinas(new double[aluno.getDisciplinas().length][4]);
		
		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			System.out.println("Informe a " + (i + 1) + "ª disciplina:");
			aluno.setNomeDisciplinaPos(i, scan.next());
		}
		
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Notas da disciplina " + aluno.getDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Informe a nota " + (j + 1));
				aluno.setNotaPosIJ(i, j, scan.nextDouble());
			}
		}
		
		aluno.mostrarDisciplinas(aluno.getDisciplinas());
		
		aluno.mostrarNotas(aluno.getNotasDisciplinas());
		
		for (int i = 0; i < aluno.getDisciplinas().length; i++) {
			if (aluno.verificarAprovacao(i)) {
				System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi reprovado");
			}
		}

	}

}
