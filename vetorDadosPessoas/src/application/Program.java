package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		for (int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.print("Nome da " + (i + 1) + "ª pessoa: ");
			String nome = sc.nextLine();
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
			char genero = sc.next().charAt(0);
			pessoa[i] = new Pessoa(nome, altura, genero);
		}
		int posicaoMenorAltura = 0;
		int posicaoMaiorAltura = 0;
		int numeroHomens = 0;
		int numeroMulheres = 0;
		double somaAlturaMulheres = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (i == 0) {
				posicaoMaiorAltura = i;
				posicaoMenorAltura = i;
			} else {
				if (pessoa[posicaoMaiorAltura].getAltura() < pessoa[i].getAltura()) {
					posicaoMaiorAltura = i;
				}
				if (pessoa[posicaoMenorAltura].getAltura() > pessoa[i].getAltura()) {
					posicaoMenorAltura = i;
				}
			}
			if (pessoa[i].getGenero() == 'M') {
				numeroHomens++;
			}
			if (pessoa[i].getGenero() == 'F') {
				numeroMulheres++;
				somaAlturaMulheres += pessoa[i].getAltura();
			}
		}
		System.out.printf("Menor altura = %.2f%n", pessoa[posicaoMenorAltura].getAltura());
		System.out.printf("Maior altura = %.2f%n", pessoa[posicaoMaiorAltura].getAltura());
		System.out.printf("Media das alturas das mulheres = %.2f%n", (somaAlturaMulheres / numeroMulheres));
		System.out.printf("Número de homens = %d%n", numeroHomens);
		sc.close();
	}

}
