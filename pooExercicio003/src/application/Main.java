package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		aluno.nome = sc.nextLine();
		//sc.nextLine();
		aluno.primeiraNota = sc.nextDouble();
		aluno.segundaNota = sc.nextDouble();
		aluno.terceiraNota = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.NotaFinal());
		System.out.println(aluno.toString());
		
		
		sc.close();
	}

}
