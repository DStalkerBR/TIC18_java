package conversor;

import java.util.Scanner;

public class ConversorTemp {
    public static float CelsiusParaFahrenheit(float c) {
        return c * 9/5 + 32;
    }

    public static float FahrenheitParaCelsius(float f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a temperatura:");
        float num1 = entrada.nextFloat();
        System.out.println("Insira a unidade de origem (Celsius ou Fahrenheit):");
        char operacao = entrada.next().charAt(0);
        switch (operacao) {
            case 'C':
                System.out.println("Celsius para Fahrenheit: ");
                System.out.println(num1 + " °C = " + ConversorTemp.CelsiusParaFahrenheit(num1) + " °F");
                break;
            case 'F':
                System.out.println("Fahrenheit para Celsius: ");
                System.out.println(num1 + " °F = " + ConversorTemp.FahrenheitParaCelsius(num1) + " °C");
                break;
            case 's':
        }
        entrada.close();
    }
}
