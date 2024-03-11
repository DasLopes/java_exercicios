package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NotasAno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		NotasAno aluno1 = new NotasAno();
		
		aluno1.nome = sc.nextLine();
		//sc.nextLine();
		aluno1.primeiraNota = sc.nextDouble();
		aluno1.segundaNota = sc.nextDouble();
		aluno1.terceiraNota = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno1.NotaFinal());
		System.out.println(aluno1.toString());
		
		
		sc.close();
	}

}
