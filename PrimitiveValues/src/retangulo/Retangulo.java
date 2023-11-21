package retangulo;

import java.util.Scanner;

public class Retangulo {
	public static int calculaArea(int largura, int altura) {
		return largura * altura;
	}
	
	public static void main(String[] args) {
		int largura, altura;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Largura do Retangulo: ");
		largura = entrada.nextInt();
		System.out.println("Altura do Retangulo: ");
		altura = entrada.nextInt();
		System.out.println("Area do Retangulo = " + Retangulo.calculaArea(largura, altura));
		entrada.close();
	}

}
