package entities;

public class NotasAno {
	public String nome;
	public double primeiraNota;
	public double segundaNota;
	public double terceiraNota;
	
	public double NotaFinal() {
		return primeiraNota + segundaNota + terceiraNota;
	}
	
	public String toString() {		
		return (NotaFinal()>= 60) ? "PASS" : "FAILED\nMISSING " + (60 - NotaFinal()) + " POINTS";
	}
}
