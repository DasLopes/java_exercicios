package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		for (int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoa[i] = new Pessoa(nome, idade);
		}
		int idadePessoaMaisVelha = 0;
		String nomePessoaMaisVelha = "";
		for (int i = 0; i < pessoa.length; i++) {
			if (i == 0) {
				idadePessoaMaisVelha = pessoa[i].getIdade();
				nomePessoaMaisVelha = pessoa[i].getNome();
			} else {
				if (idadePessoaMaisVelha < pessoa[i].getIdade()) {
					idadePessoaMaisVelha = pessoa[i].getIdade();
					nomePessoaMaisVelha = pessoa[i].getNome();
				}
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s", nomePessoaMaisVelha);
		sc.close();
	}
}
