package exercicios;

public class PrimitiveValue {	
	
	public static void main(String[] args) {
		float x = 2, y;
		
		do {
			y = x;
			x = x /2;
			
		}while (x > 0);
		System.out.println(y);
	}
}
