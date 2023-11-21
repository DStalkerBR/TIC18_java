package maioridade;

import java.util.Scanner;

public class MaiorIdade {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		int dia_nasc, mes_nasc, ano_nasc, dia_atual, mes_atual, ano_atual;
		System.out.println("Informe a idade: ");
		idade = entrada.nextInt();
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		
		System.out.println("Informe o dia de nascimento: ");
		dia_nasc = entrada.nextInt();
		System.out.println("Informe o mes de nascimento: ");
		mes_nasc = entrada.nextInt();
		System.out.println("Informe o ano de nascimento: ");
		ano_nasc = entrada.nextInt();
		System.out.println("Informe o dia atual: ");
		dia_atual = entrada.nextInt();
		System.out.println("Informe o mes atual: ");
		mes_atual = entrada.nextInt();
		System.out.println("Informe o ano atual: ");
		ano_atual = entrada.nextInt();
		if (ano_nasc <= ano_atual) { 
			if (mes_nasc < mes_atual || (mes_nasc == mes_atual && dia_nasc <= dia_atual)) {
				idade = ano_atual - ano_nasc;
			} else {
				idade = ano_atual - ano_nasc - 1;
			}
		} else {
			System.out.println("Ano atual menor que ano de nascimento");
		}
		System.out.println(idade);
		entrada.close();
	}
}
