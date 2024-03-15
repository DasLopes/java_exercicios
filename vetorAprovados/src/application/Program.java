package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		Aluno[] aluno = new Aluno[n];
		for (int i = 0; i < aluno.length; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
			String nome = sc.nextLine();
			double primeiraNota = sc.nextDouble();
			double segundaNota = sc.nextDouble();
			aluno[i] = new Aluno(nome, primeiraNota, segundaNota);
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < aluno.length; i++) {
			double media = (aluno[i].getPrimeiraNota() + aluno[i].getSegundaNota()) / 2;
			if (media >= 6.0) {
				System.out.println(aluno[i].getNome());
			}
		}
		sc.close();
	}
}
