package media;

import java.util.Scanner;

public class MediaPonderada {
	public static float calcula(float nota1, float nota2, float nota3, float peso1, float peso2, float peso3) {
		return (nota1*peso1 + nota2*peso2 + nota3*peso3)/ (peso1 + peso2 + peso3);
	}
	
	public static void main(String[] args) {
		float nota1, nota2, nota3;
		float peso1, peso2, peso3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextFloat();
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextFloat();
		System.out.println("Informe a terceira nota: ");
		nota3 = entrada.nextFloat();
		System.out.println("Informe o primeiro peso: ");
		peso1 = entrada.nextFloat();
		System.out.println("Informe o segundo peso: ");
		peso2 = entrada.nextFloat();
		System.out.println("Informe o terceiro peso: ");
		peso3 = entrada.nextFloat();
		
		float media_ponderada = calcula(nota1, nota2, nota3, peso1, peso2, peso3);
		System.out.println(media_ponderada);	
		entrada.close();
	}
}
