package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int soma = 0, divisor = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				divisor ++;
			}
		}
		if (soma != 0) {
			double media = soma / divisor;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		sc.close();
	}

}
