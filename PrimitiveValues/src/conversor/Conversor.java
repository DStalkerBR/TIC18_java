package conversor;

import java.util.Scanner;

public class Conversor {
	public class ConversorTemp {
	    public static float celsiusParaFahrenheit(float c) {
	        return c * 9/5 + 32;
	    }

	    public static float fahrenheitParaCelsius(float f) {
	        return (f - 32) * 5/9;
	    }

	 
	    
	    public static void main(String[] args) throws Exception {
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Insira a temperatura:");
	        float num1 = entrada.nextFloat();
	        System.out.println("Insira a unidade de origem (C ou F) ou (0 / 1):");
	        char operacao = entrada.next().charAt(0);
	        switch (operacao) {
	            case 'C':
	                System.out.println("Celsius para Fahrenheit: ");
	                System.out.println(num1 + " °C = " + ConversorTemp.celsiusParaFahrenheit(num1) + " °F");
	                break;
	            case 'F':
	                System.out.println("Fahrenheit para Celsius: ");
	                System.out.println(num1 + " °F = " + ConversorTemp.fahrenheitParaCelsius(num1) + " °C");
	                break;
	            case 's':
	        }
	        entrada.close();
	    }
	}
}
