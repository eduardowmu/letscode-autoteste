package br.edu.letscode.provas;

import java.util.Random;
import java.util.Scanner;

public class QuadradoPerfeito  {
	public static void main(String[] args) {
		int[][] matriz = montarEPreencherQuadrado();
		System.out.println(verificaSePerfeito(matriz) ? "O quadrado é perfeito" : "O quadrado não é perfeito");
	}
	
	public static int[][] montarEPreencherQuadrado() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do quadrado desejado:");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] colunas = matriz[linha];
            for (int coluna = 0; coluna < colunas.length; coluna++) {
                int valorAleatorio = random.nextInt(1000);
                colunas[coluna] = valorAleatorio;
                System.out.print("[" + valorAleatorio + "]");
            }
            System.out.println();
        }
        return matriz;
    }
	
	private static boolean verificaSePerfeito(int[][] matriz) {
		if(verificaSomaLinha(matriz) &&
			verificaSomaColuna(matriz) &&
			verificaSomaDiagonalPrincipal(matriz) &&
			verificaSomaDiagonalSecundaria(matriz)) {
			return true;
		}
		return false;
	}
	
	private static boolean verificaSomaLinha(int[][] matriz) {
		int[] soma = new int[matriz.length];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = i; j < matriz.length; j++) {
				soma[i] += matriz[i][j];
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			if(i == 0) {
				continue;
			} else if(soma[i] != soma[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean verificaSomaColuna(int[][] matriz) {
		int[] soma = new int[matriz.length];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = i; j < matriz.length; j++) {
				soma[i] += matriz[j][i];
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			if(i == 0) {
				continue;
			} else if(soma[i] != soma[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean verificaSomaDiagonalPrincipal(int[][] matriz) {
		int[] soma = new int[matriz.length];
		for(int i = 0; i < matriz.length; i++) {
			soma[i] += matriz[i][i];
		}
		
		for(int i = 0; i < matriz.length; i++) {
			if(i == 0) {
				continue;
			} else if(soma[i] != soma[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean verificaSomaDiagonalSecundaria(int[][] matriz) {
		int[] soma = new int[matriz.length];
		for(int i = 0; i < matriz.length; i++) {
			soma[i] += matriz[i][matriz.length - i];
		}
		
		for(int i = 0; i < matriz.length; i++) {
			if(i == 0) {
				continue;
			} else if(soma[i] != soma[i-1]) {
				return false;
			}
		}
		return true;
	}
}