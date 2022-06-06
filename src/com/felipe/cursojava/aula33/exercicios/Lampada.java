package com.felipe.cursojava.aula33.exercicios;

public class Lampada {
	
	private String marca;
	private String modelo;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private double preco;
	private boolean smart;
	private boolean ligada;
	
	public Lampada() {}

	public Lampada(String marca, String modelo, int potencia, String cor, String tipoLuz, int garantiaMeses,
			String[] tipos, double preco, boolean smart, boolean ligada) {
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tipos = tipos;
		this.preco = preco;
		this.smart = smart;
		this.ligada = ligada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoLuz() {
		return tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar() {
		setLigada(true);
		System.out.println("Lâmpada ligada");
	}
	
	public void desligar() {
		setLigada(false);
		System.out.println("Lâmpada desligada");
	}
	
	public void mudarEstado() {
		if (isLigada()) {
			desligar();
		} else {
			ligar();
		}
	}
}
