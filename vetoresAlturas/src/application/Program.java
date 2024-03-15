package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoa serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Dados da " + (i + 1) + "ª pessoa: \n");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += pessoa[i].getAltura();
		}
		double media = soma / n;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		double menor16 = 0;
		for (int i = 0; i < n; i++) {
			if (pessoa[i].getIdade() < 16)
				menor16++;
		}
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", (menor16 * 100 / n));
		System.out.println();
		for (int i = 0; i < n; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		sc.close();
	}
}
