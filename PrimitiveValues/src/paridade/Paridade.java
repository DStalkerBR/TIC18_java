package paridade;

import java.util.Scanner;

public class Paridade {
	
	public static boolean verifica (int inteiro) {
		if (inteiro % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int inteiro;
		System.out.println("Digite um inteiro: ");
		inteiro = entrada.nextInt();
		if (Paridade.verifica(inteiro)) {
			System.out.println(inteiro + " é par");
		}else {
			System.out.println(inteiro + " é ímpar");
		}
		entrada.close();
	}

}
