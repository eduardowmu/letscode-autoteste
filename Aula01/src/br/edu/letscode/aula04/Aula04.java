package br.edu.letscode.aula04;

import java.util.Scanner;

public class Aula04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = {0, 3, 6, 9, 12, 15};
		System.out.println("Entre com o elemento:");
		int elemento = entrada.nextInt();
		System.out.println(showResult(elemento, vetor));
		entrada.close();
	}
	
	private static String showResult(int elemento, int[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == elemento) {
				return "O elemento está no vetor";
			}
		}
		return "O elemento não está no vetor";
	}
}