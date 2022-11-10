package br.edu.letscode.aula03;

import java.util.Scanner;

public class Aula03 {
	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		String entrada = "Entre com o valor ";
		System.out.println(entrada + " X");
		double x = valor.nextDouble();
		System.out.println(entrada + " Y");
		double y = valor.nextDouble();
		getQuadrante(x,y);
	}
	
	private static void getQuadrante(double x, double y) {
		String resposta = "O ponto está no ";
		if(x > 0 && y > 0) {
			System.out.println(resposta + "quadrante B");
		} else if(x > 0 && y < 0) {
			System.out.println(resposta + "quadrante C");
		} else if(x < 0 && y > 0) {
			System.out.println(resposta + "quadrante A");
		} else if(x < 0 && y < 0) {
			System.out.println(resposta + "quadrante D");
		} else if(x == 0 || y == 0) {
			System.out.println(resposta + "sobre um dos eixos");
		}
	} 
}