package entities;

public class Aluno {
	public String name;
	public String email;	
	
	public Aluno(String name, String email) {		
		this.name = name;
		this.email = email;		
	}
	
	public String toString() {
		return name + email;
	}
}
