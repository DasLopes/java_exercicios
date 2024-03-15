package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] A = new int[n];
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int[] B = new int[n];
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextShort();
		}
		int[] C = new int[n];
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < n; i++) {
			C[i] = A[i] + B[i];
			System.out.println(C[i]);
		}
		sc.close();
	}
}
