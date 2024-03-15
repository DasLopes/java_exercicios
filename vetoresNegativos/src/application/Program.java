package application;

import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Digite um número:");
			int num = sc.nextInt();
			vect[i] = num;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();

	}

}
