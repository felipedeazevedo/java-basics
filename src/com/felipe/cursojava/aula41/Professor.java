package com.felipe.cursojava.aula41;

public class Professor extends Pessoa{
	
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do professor: ";
		s += this.getEndereco();
		
		return s;
	}
	
	public void imprimirEtiqueta() {
		System.out.println("Imprimindo endereço do professor...");
		System.out.println(this.getEndereco());
	}
}
