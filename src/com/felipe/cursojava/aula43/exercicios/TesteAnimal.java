package com.felipe.cursojava.aula43.exercicios;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal camelo = new Animal("Camelo", 150, "Amarelo", "Terrestre", 2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setAmbiente("Terrestre");
		urso.setVelocidade(0.5);
		
		Animal[] animais = new Animal[3];
		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		for (Animal animal : animais) {
			System.out.println(animal);
		}
	}

}
