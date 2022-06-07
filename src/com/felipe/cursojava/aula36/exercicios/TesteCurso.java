package com.felipe.cursojava.aula36.exercicios;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Forneça as informações do curso: ");
		
		System.out.println("Nome: ");
		String nomeCurso = scan.nextLine();
		
		System.out.println("Horário: ");
		String horarioCurso = scan.nextLine();
		
		System.out.println();
		
		System.out.println("Informações do professor: ");
		
		System.out.println("Nome: ");
		String nomeProfessor = scan.nextLine();
		
		System.out.println("Departamento: ");
		String departamento = scan.nextLine();
		
		System.out.println("Email: ");
		String email = scan.nextLine();
		
		Professor professor = new Professor(nomeProfessor, departamento, email);
		Curso curso = new Curso(nomeCurso, horarioCurso, professor);
		
		Aluno[] alunos = new Aluno[5];
		
		for (int i = 0; i < alunos.length; i++) {
			
			scan.nextLine();
			
			System.out.println("Informações do aluno " + (i + 1) + ": ");
			Aluno aluno = new Aluno();
			
			System.out.println("Nome do aluno " + (i + 1) + ": ");
			String nomeAluno = scan.nextLine();
			aluno.setNome(nomeAluno);
			
			System.out.println("Matricula do aluno " + (i + 1) + ": ");
			String matricula = scan.nextLine();
			aluno.setMatricula(matricula);
			
			double[] notas = new double[4];
			
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				notas[j] = scan.nextDouble();
			}
			
			aluno.setNotas(notas);
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
	}

}
