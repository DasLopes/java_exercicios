package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.Area());
		System.out.printf("PERIMETER = %.2f%n",rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());
		
		sc.close();
	}

}
