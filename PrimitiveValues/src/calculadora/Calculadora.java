package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static float somar(float a, float b) {
        return a + b;
    }

    public static float subtrair(float a, float b) {
        return a - b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        float num1 = entrada.nextFloat();
        System.out.println("Insira o segundo valor:");
        float num2 = entrada.nextFloat();
        System.out.println("Menu\n Escolha a operação: \nA(dição) \nS(ubtração) \nM(ultiplicação) \nD(ivisão)");
        char operacao = entrada.next().charAt(0);
        switch (operacao) {
            case 'A':
                System.out.println("Soma: " + Calculadora.somar(num1, num2));
                break;
            case 'S':
                System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
                break;
            case 'M':
                System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
                break;
            case 'D':
                System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
                break;
            case 's':
                entrada.close();
                System.exit(0);
            default:
                System.out.println("Operação inválida");
        }
    }

}