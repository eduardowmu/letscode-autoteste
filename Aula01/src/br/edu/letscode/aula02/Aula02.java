package br.edu.letscode.aula02;

import java.util.Scanner;

public class Aula02 {
	private static final double TECNICO_AUMENTO = 1.5;
	private static final double GERENTE_AUMENTO = 1.3;
	private static final double AUMENTO_GERAL = 1.2;
	private static final String GERENTE = "gerente";
	private static final String TECNICO = "tecnico";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com o cargo:");
		String cargo = entrada.nextLine();
		cargo = cargo.toLowerCase();
		System.out.println("Entre com o salario atual do cargo digitado:");
		double salario = entrada.nextDouble();
		
		if(cargo.contains(GERENTE)) {
			salario = salario * GERENTE_AUMENTO;
		} else if(cargo.contains(TECNICO)) {
			salario = salario * TECNICO_AUMENTO;
		} else {
			salario = salario * AUMENTO_GERAL;
		}
		System.out.println("O novo salario após aumento é de " + salario);
		entrada.close();
	}
}