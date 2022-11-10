package br.edu.letscode.aula03;

import java.util.Scanner;

/*Ler um n�mero e verificar se este � ou n�o um n�mero primo.*/
public class Questao03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com um numero inteiro:");
		int numero = retornaNumero(entrada);
		System.out.println(verificaSePrimo(numero) ? "O numero � primo" : "O numero n�o � primo");
		entrada.close();
	}
	
	private static int retornaNumero(Scanner entrada) {
		try {
			int numero = entrada.nextInt();
			return numero;
		} catch(Exception e) {
			System.out.println("Valor de entrada inv�lido! Tente novamente.");
			Scanner novaEntrada = new Scanner(System.in);
			return retornaNumero(novaEntrada);
		}
	}
	
	private static boolean verificaSePrimo(int numero) {
		if(numero <= 2) {
			return true;
		} 
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}
}