package br.edu.letscode.aula01;

import java.util.Scanner;

/*Entre com 3 números, verifique qual o maior dentre os valores
 *informados e imprima na tela a frase "O maior número é X"*/
public class Desafio01 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		String resultado = "O maior número é ";
		String atribuir = "Atribua um valor inteiro para ";
		Scanner input = new Scanner(System.in);
		System.out.println(atribuir + "a");
		a = input.nextInt();
		System.out.println(atribuir + "b");
		b = input.nextInt();
		System.out.println(atribuir + "c");
		c = input.nextInt();
		
		if(a > b && a > c) {
			System.out.println(resultado + a);
		} else if(b > a && b > c) {
			System.out.println(resultado + b);
		} else {
			System.out.println(resultado + c);
		}
		
		//System.out.println(resultado + (a > b && a > c ? a : b > a && b > c ? b : c));
	}
}