package br.edu.letscode.aula01;

import java.util.Scanner;

/*Entre com 2 números e apresente-os de forma ordenada*/
public class Desafio02 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		String entre = "Entre com valor de ";
		Scanner input = new Scanner(System.in);
		System.out.println(entre + "a");
		a = input.nextInt();
		System.out.println(entre + "b");
		b = input.nextInt();
		
		if(a > b) {
			
			System.out.println(a + ", " + b);
		} else {
			
			System.out.println(b + ", " + a);
		}
		
		System.out.println(a > b ? a + ", " + b : b + ", " + a);
	}
}