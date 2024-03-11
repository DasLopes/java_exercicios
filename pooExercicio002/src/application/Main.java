package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee funcionary = new Employee();
		
		System.out.print("Name: ");
		funcionary.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionary.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionary.tax = sc.nextDouble();
		
		
		System.out.printf(
				"Employee: "
						+ funcionary.name
						+ ", $ %.2f%n"
						, funcionary.NetSalary()
				);
		System.out.print("Which percentage to increase salary? ");
		double newSalary = funcionary.IncreaseSalary(sc.nextDouble());
		newSalary += funcionary.NetSalary();
		System.out.printf(
				"Updated data: %s, $ %.2f%n"
				, funcionary.name
				, newSalary
				);
		sc.close();
	}
}
