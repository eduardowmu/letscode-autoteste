package br.edu.letscode.aula03;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner interacoes = new Scanner(System.in);
		System.out.println("Entre com a quantidade de linhas");
		int linhas = interacoes.nextInt();
		for(int i = linhas; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
}