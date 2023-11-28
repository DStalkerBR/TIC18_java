package exercicios;

public class TrocaValores {
	public static void troca (int a, int b) {
		int temp;
		temp = a;
		System.out.println(a + " <-> " + b);
		a = b;
		b = temp;
		System.out.println(a + " <-> " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a + " <-> " + b);
	}
}
