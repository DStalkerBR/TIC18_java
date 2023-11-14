package oop;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private short idade;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = 0;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome e Pressione <Enter>");
		String nome = entrada.nextLine();
		System.out.println("Digite o cpf e Pressione <Enter>");
		String cpf = entrada.nextLine();
		Cliente cliente = new Cliente(nome, cpf);
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("Altere o nome: ");
		nome = entrada.nextLine();
		System.out.println("Altere o cpf: ");
		cpf = entrada.nextLine();
		System.out.println("Altere a idade: ");
		short idade = Short.parseShort(entrada.nextLine()); 
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setIdade(idade);
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Idade: " + cliente.getIdade());
		entrada.close();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public short getIdade() {
		return idade;
	}

	public void setIdade(short idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
