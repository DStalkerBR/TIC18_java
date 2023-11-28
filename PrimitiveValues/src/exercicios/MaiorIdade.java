package exercicios;

public class MaiorIdade {
	public static boolean verificaMaioridade (int idade){
		return idade >= 18;
	}

	public static int obtemIdadeDeData(int mes_nasc, int dia_nasc, int ano_nasc, int mes_atual, int dia_atual, int ano_atual){
		int idade = 0;
		if (ano_nasc <= ano_atual) { 
			if (mes_nasc < mes_atual || (mes_nasc == mes_atual && dia_nasc <= dia_atual)) {
				idade = ano_atual - ano_nasc;
			} else {
				idade = ano_atual - ano_nasc - 1;
			}
		} else {
			System.out.println("Ano atual menor que ano de nascimento");
		}
		return idade;
	}
}
