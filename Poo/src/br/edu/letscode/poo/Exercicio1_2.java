package br.edu.letscode.poo;

import java.util.Scanner;

public class Exercicio1_2 {
	private static int valor = 0;
	public static void main(String[] args) {
		System.out.print("Insira um numero inteiro: ");
		int val = getValor();
		System.out.println(val);
	}
	
	private static int getValor() {
		while(valor == 0) {
			try {
				Scanner entrada = new Scanner(System.in);
				valor = entrada.nextInt();
				if(valor <= 0) {
					throw new Exception();
				}
			} catch(Exception e) {
				System.out.println("Valor inválido. Tente novamente: ");
				valor = 0;
			}
		}
		return valor;
	}
}