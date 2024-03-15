package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double maior = 0;
		int posicao = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if(maior < vetor[i]) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d%n", posicao);
		sc.close();
	}

}
