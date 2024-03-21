package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno[] pensionato = new Aluno[10];

		System.out.print("Quantos reservas deseja? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			pensionato[room] = new Aluno(name, email);
		}

		for (int i = 0; i < 10; i++) {
			if (pensionato[i] != null) {
				System.out.print("Nome: " + 
			pensionato[i].name + "\n");
				System.out.print("Email: " + 
			pensionato[i].email + "\n");
				System.out.print("Quarto: " +
			i + "\n");
				System.out.println();
			}

		}
		sc.close();
	}
}
