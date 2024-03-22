package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario() {
		
	}
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}
	
	public double Aumento(double aumento) {
		return salario += salario * aumento / 100.0;
	}
	public String toString() {
		return id + ", "
				+ nome + ", "
				+ String.format("%.2f", salario);
	}
}
