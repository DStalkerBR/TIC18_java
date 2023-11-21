package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static float Somar(float a, float b) {
        return a + b;
    }

    public static float Subtrair(float a, float b) {
        return a - b;
    }

    public static float Multiplicar(float a, float b) {
        return a * b;
    }

    public static float Dividir(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        float num1 = entrada.nextFloat();
        System.out.println("Insira o segundo valor:");
        float num2 = entrada.nextFloat();
        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = entrada.next().charAt(0);
        switch (operacao) {
            case '+':
                System.out.println("Soma: " + Calculadora.Somar(num1, num2));
                break;
            case '-':
                System.out.println("Subtração: " + Calculadora.Subtrair(num1, num2));
                break;
            case '*':
                System.out.println("Multiplicação: " + Calculadora.Multiplicar(num1, num2));
                break;
            case '/':
                System.out.println("Divisão: " + Calculadora.Dividir(num1, num2));
                break;
            case 's':
                entrada.close();
                System.exit(0);
            default:
                System.out.println("Operação inválida");
        }
    }

}
