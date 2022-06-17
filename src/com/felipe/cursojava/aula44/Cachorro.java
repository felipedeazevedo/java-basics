package com.felipe.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
	
	private int tamanho;
	private String raca;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getRaça() {
		return raca;
	}
	
	public void setRaça(String raça) {
		this.raca = raça;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
}
