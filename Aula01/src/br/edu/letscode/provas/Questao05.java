package br.edu.letscode.provas;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com um tamanho inteiro:");
		int tamanho = entrada.nextInt();
		String[] piramide = new String[tamanho];
		String[] piramide2 = new String[tamanho];
		piramide = geraPiramideSemTraco(piramide, tamanho);
		piramide2 = geraPiramideSemTraco(piramide2, tamanho);
		piramide = geraPiramide(tamanho, piramide, piramide2);
		
		imprimePiramide(piramide, tamanho);
	}
	
	private static String[] geraPiramideSemTraco(String[] piramide, int tamanho) {
		for(int i = 0; i < tamanho; i++) {
			piramide[i] = repita(i);
		}
		return piramide;
	}
	
	private static String[] geraPiramide(int tamanho, String[] piramide, String[] piramide2) {
		for(int i = 0; i < tamanho; i++) {
			if(i == 0) {
				continue;
			} else {
				piramide[i] += piramide2[i-1];
			}
		}
		return piramide;
	}
	
	private static void imprimePiramide(String[] piramide, int tamanho) {
		for(int i = 0; i < tamanho; i++) {
			System.out.println(piramide[i]);
		}
	}
	
	private static String repita(int qtd) {
		String caracters = "";
		for(int i = 0; i < qtd+1; i++) {
			caracters += "#";
		}
		return caracters;
	}
}
