package br.edu.letscode.poo.modulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.letscode.poo.modulo2.model.Cliente;

public class Exercicio2 {
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<>();
		for(int i = 0;;i++) {
			System.out.printf("Insira a id do cliente %d : ", i);
			Integer id = getNumber();
			if(id < 0) {
				break;
			}
			
			System.out.print("Insira o nome: ");
			String nome = getTexto();
			
			System.out.print("Insira a idade: ");
			Integer idade = getNumber();
			
			System.out.print("Insira o telefone: ");
			String telefone = getTexto();
			
			clientes.add(new Cliente(id, nome, idade, telefone));
		}
		
		clientes.stream().forEach(c -> {
			System.out.println(c.toString());
		});
	}
	
	private static Integer getNumber() {
		Scanner entrada = new Scanner(System.in);
		try {
			return entrada.nextInt();
		} catch(Exception e) {
			System.out.println("Valor inválido! Tente novamente");
			return getNumber();
		}
	}
	
	private static String getTexto() {
		Scanner entrada = new Scanner(System.in);
		try {
			return entrada.nextLine();
		} catch(Exception e) {
			System.out.println("Valor inválido! Tente novamente");
			return getTexto();
		}
	}
}