package tech.ada.banco.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private String telefone;
	
	public Pessoa(String nome, LocalDate dataNascimento, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.setCpf(cpf);
		this.telefone = telefone;
	}
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	
	public LocalDate getDataNascimento() {return dataNascimento;}
	public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}
	
	public String getCpf() {return cpf;}
	public void setCpf(String cpf) {
		if(cpf.length() != 11) {
			throw new RuntimeException("O número de caracteres deve ser 11");
		}
		this.cpf = cpf;
	}
	
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone = telefone;}
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		return "{\n   nome: " + nome + ", \n   dataNascimento: " + formatter.format(dataNascimento) + ", \n   cpf: " + cpf + ", \n   telefone: " + telefone + "\n}";
	}
}