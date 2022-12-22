package br.edu.letscode.poo.modulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		for( int i = 0; i < 5; i++) {
			numeros.add(addNumero(i));
		}
		
		numeros.forEach(n -> System.out.println(n));
	}
	
	private static Integer addNumero(int i) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Inrira o %d º numero: ", i+1);
		try {
			return entrada.nextInt();
		} catch(Exception e) {
			System.out.println("Valor inválido, tente novamente");
			return addNumero(i);
		}
	}
}