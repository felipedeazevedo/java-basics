package com.felipe.cursojava.aula46.exercicios;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(2);
		quadrado.setNome("Quadrado");
		
		Circulo circulo = new Circulo();
		circulo.setRaio(2);
		quadrado.setNome("Circulo");
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(2);
		triangulo.setBase(3);
		quadrado.setNome("Triangulo");
		
		Cubo cubo = new Cubo();
		cubo.setAresta(3);
		quadrado.setNome("Cubo");
		
		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(3);
		cilindro.setRaio(2);
		quadrado.setNome("Cilindro");
		
		Piramide piramide = new Piramide();
		piramide.setAltura(3);
		piramide.setApotema(4);
		piramide.setArestaBase(2);
		piramide.setNumPoliBase(4);
		piramide.setBase(quadrado);
		quadrado.setNome("Piramide");
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = quadrado;
		figuras[1] = circulo; // upcasting
		figuras[2] = triangulo;
		figuras[3] = cubo;
		figuras[4] = cilindro;
		figuras[5] = piramide;
		
		for (FiguraGeometrica f : figuras) {
			System.out.println("---------------------------");
			System.out.println(f.getNome());
			
			if (f instanceof Figura2D) { // evita erro ClassCastException
				Figura2D f2d = (Figura2D) f; //downcasting
				System.out.println(f2d.calcularArea());
			}
			
			if (f instanceof Figura3D) {
				Figura3D f3d = (Figura3D) f;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}
	}

}
