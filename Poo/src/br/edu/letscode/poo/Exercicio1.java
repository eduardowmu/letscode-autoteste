package br.edu.letscode.poo;

import java.util.Scanner;

public class Exercicio1 {
	private static int valor = 0;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira um numero inteiro: ");
		valor = getValor(entrada);
		System.out.println(valor);
	}
	
	private static int getValor(Scanner entrada) {
		try {
			valor = entrada.nextInt();
			if(valor <= 0) {
				throw new Exception();
			}
			return valor;
		} catch(Exception e) {
			System.out.print("Valor inválido. Tente novamente: ");
			valor = 0;
			entrada.nextLine();
			return getValor(entrada);//getValor(new Scanner(System.in));
		}
	}
}