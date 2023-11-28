package exercicios;

public class ConversorAlt {
	public static float converte(float temp, int tipo) {
		if (tipo == 0) {
			return temp * 9/5 + 32;
		} else if (tipo == 1) {
			return (temp - 32) * 5/9;
		}
		return -404;
	}
}
