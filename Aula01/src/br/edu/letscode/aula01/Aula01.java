package br.edu.letscode.aula01;

import java.time.LocalDate;
import java.util.Scanner;

public class Aula01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String name = input.nextLine();
		System.out.println("Bem-vindo, ".concat(name));
		System.out.println("Agora, digite seu sobrenome:");
		String surname = input.nextLine();
		System.out.println("Seja bem-vindo, ".concat(name + " " + surname));
		
		System.out.println("Digite seu ano de nascimento:");
		int nascimento = input.nextInt();
		int anoAtual = LocalDate.now().getYear();
		System.out.println("Você tem ".concat(String.valueOf(anoAtual - nascimento) + " anos"));
		input.close();
	}
}