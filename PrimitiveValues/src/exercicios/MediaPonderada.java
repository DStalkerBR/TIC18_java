package exercicios;

public class MediaPonderada {
	public static float calcula(float nota1, float nota2, float nota3, float peso1, float peso2, float peso3) {
		return (nota1*peso1 + nota2*peso2 + nota3*peso3)/ (peso1 + peso2 + peso3);
	}
}
