package entities;

public class Pessoa {
	
	private String nome;
	private double altura;
	private char genero;
	
	public Pessoa(String nome, double altura, char genero) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public double getAltura() {
		return altura;
	}

	public char getGenero() {
		return genero;
	}
}
