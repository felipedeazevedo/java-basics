package com.felipe.cursojava.aula52.exercicios;

public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}
	
}
