package conversor;

import java.util.Scanner;

public class ConversorMoeda {
    public static double converter(double valor, double taxaCambio) {
        return valor * taxaCambio;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, taxaCambio;
        System.out.println("Digite o valor em dólares:");
        if (entrada.hasNextDouble()) {
            valor = entrada.nextDouble();
        } else {
            System.out.println("Valor inválido!");
            entrada.close();
            return;
        }

        System.out.println("Digite a taxa de Câmbio:");
        if (entrada.hasNextDouble()) {
            taxaCambio = entrada.nextDouble();
        } else {
            System.out.println("Valor inválido!");
            entrada.close();
            return;
        }

        // print formatado
        System.out.printf("O valor convertido de $ %.2f é: %.2f\n", valor, converter(valor, taxaCambio));

        entrada.close();
        
    }
}
