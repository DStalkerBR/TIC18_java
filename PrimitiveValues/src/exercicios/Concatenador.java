package exercicios;

import java.util.Scanner;

public class Concatenador {
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	public void entrada() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Primeiro Nome: ");
		nome = entrada.nextLine();
		System.out.println("Sobrenome: ");
		sobrenome = entrada.nextLine();
		entrada.close();
	}
	
	public void concatena() {
		nomeCompleto = nome + " " + sobrenome;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
}
