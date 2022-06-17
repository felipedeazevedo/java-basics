package com.felipe.cursojava.aula45;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;

	public Aluno() {
		super(); // chama o construtor da superclasse
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso, double[] notas) {
		super(nome, endereco, telefone);
		this.curso = curso;
		this.notas = notas;
	}

	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public void metodoQualquer() {
		super.setCpf("12345");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do aluno: ";
		s += this.getEndereco();
		
		return s;
	}
}
