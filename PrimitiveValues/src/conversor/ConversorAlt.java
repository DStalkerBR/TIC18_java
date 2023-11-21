package conversor;

import java.util.Scanner;

public class ConversorAlt {
	public class ConversorTemp {

	    public static float converte(float temp, int tipo) {
	    	if (tipo == 0) {
	    		return temp * 9/5 + 32;
	    	} else if (tipo == 1) {
	    		return (temp - 32) * 5/9;
	    	}
	    	return -404;
	    }
	    
	    public static void main(String[] args) throws Exception {
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Insira a temperatura:");
	        float temp = entrada.nextFloat();
	        System.out.println("Insira a unidade de origem 0 para ºC, 1 para ºF:");
	        int operacao = entrada.nextInt();
	        float temp_convertida = ConversorTemp.converte(temp, Character.getNumericValue(operacao));
	        if (operacao == 0) {
	            System.out.println("Celsius para Fahrenheit: ");
	            System.out.println(temp + " °C = " + temp_convertida + " °F");
	        } else if(operacao == 1){
	        	System.out.println(temp + " °F = " + temp_convertida + " °C");
	        } else {
	        	System.out.println("Tipo incorreto, digite 0 ou 1");
	        }
	        entrada.close();
	    }
	}
}
