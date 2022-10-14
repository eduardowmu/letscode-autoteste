package br.edu.letscode.aula02;

import java.util.Scanner;

public class MediaSalarioAnual {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o salario mensal:");
		double salario = entrada.nextDouble();
		System.out.println("");
		System.out.printf("A media anual do salario é de R$ %.2f", (salario * 13/12));
	}
}