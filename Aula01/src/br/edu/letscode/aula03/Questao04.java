package br.edu.letscode.aula03;
/*Dada uma divida de R$10.000,00, que cresce a juros de 2,5%/mês
 *e uma aplicação de R$1.500,00 com rendimento de 4%/mês, escrever
 *um algoritmo que determine o numero de meses necessários para pagar
 *a dívida*/
public class Questao04 {
	private static final double DIVIDA = 10000;
	private static final double JUROS_DIVIDA = 0.025;
	private static final double APLICACAO = 1500;
	private static final double JUROS_APLICACAO = 0.04;
	
	public static void main(String[] args) {
		for(int i = 1;;i++) {
			if(calculaAplicacaoMes(i) >= calculaDividaMes(i)) {
				System.out.println(i + " meses para pagar a dívida");
				break;
			}
		}
	}
	
	private static double calculaDividaMes(int i) {
		return DIVIDA * Math.pow((1 + 0.025), i);
	}
	
	private static double calculaAplicacaoMes(int i) {
		return APLICACAO * Math.pow((1 + 0.04), i);
	}
}