package br.edu.letscode.aula03;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Salario:");
		double salario = entrada.nextDouble();
		System.out.printf("\nSalario anual bruto R$%.2f", calculaSalarioAnualBruto(salario));
		System.out.printf("\nDesconto total anual Inss R$%.2f", (13 * calculaDescontoInss(salario)));
		System.out.printf("\nSalario anual liquido R$%.2f", calculaSalarioAnualLiq(salario));
	}
	
	private static double calculaSalarioAnualBruto(double salario) {
		return salario * 12 + calculaFeriasLiq(salario) + calculaDescontoInss(salario);
	}
	
	private static double calculaSalarioAnualLiq(double salario) {
		return (salario - calculaDescontoInss(salario)) * 12 + calculaFeriasLiq(salario);
	}
	
	private static double calculaDescontoInss(double salario) {
		return (salario > 0 && salario <= 1212) ? salario * 0.075 : 
				(salario > 1212 && salario <= 2427.35) ? salario * 0.09 :
				(salario > 2427.36 && salario <= 3641.03) ? salario * 0.12 :
				(salario > 3641.03 && salario <= 7087.22) ? salario * 0.14 :
				salario - 900;
	}
	
	private static double calculaFeriasLiq(double salario) {
		return salario * 4/3 - calculaDescontoInss(salario);
	}
}