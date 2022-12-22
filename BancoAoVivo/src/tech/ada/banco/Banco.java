package tech.ada.banco;

import java.time.LocalDate;

import tech.ada.banco.model.Pessoa;

public class Banco {

	public static void main(String[] args) {
		
		
		Pessoa pessoa = new Pessoa("Eduardo", LocalDate.parse("1990-11-11"), "01234567890", "11999999999");
		/*
		pessoa.setNome("Eduardo");
		pessoa.setCpf("01234567890");
		pessoa.setDataNascimento(LocalDate.parse("1990-11-11"));
		pessoa.setTelefone("11999999999");
		*/
		
		System.out.println(pessoa.toString());
	}
}