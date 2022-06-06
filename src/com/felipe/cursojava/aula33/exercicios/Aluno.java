package com.felipe.cursojava.aula33.exercicios;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno() {}

	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notasDisciplinas) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notasDisciplinas = notasDisciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}

	public boolean verificarAprovacao(int index) {
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
	
	public void mostrarDisciplinas(String[] disciplinas) {
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplina " + (i + 1) + ": " + disciplinas[i]);
		}
	}
	
	public void mostrarNotas(double[][] notas) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Disciplina: " + disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void setNomeDisciplinaPos(int pos, String nome) {
		this.disciplinas[pos] = nome;
	}
	
	public void setNotaPosIJ(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
	}
}
