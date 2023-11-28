package exercicios.main;

import exercicios.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int exercicio;
        if (args.length < 1){
            System.out.println("Digite o número do exercício:");
            System.out.println("1 - Soma de inteiros");
            System.out.println("2 - Média ponderada");
            System.out.println("3 - Concatenador");
            System.out.println("4 - Paridade");
            System.out.println("5 - Conversor");
            System.out.println("6 - Retângulo");
            System.out.println("7 - Troca de valores");
            System.out.println("8 - Maior idade");
            System.out.println("9 - Calculadora");
            System.out.println("10 - Pergunta");
            System.out.println("0 - Sair");
            exercicio = entrada.nextInt();
        } else {
            exercicio = Integer.parseInt(args[0]);
        }
        
        switch (exercicio) {
            case 1:    
                execSomaInteiro();            
            break;
                
            case 2:
                execMediaPonderada();
            break;

            case 3:
                execConcatenador();
            break;

            case 4:
                execParidade();
            break;
                
            case 5:
                execConversor();
                execConversorAlt();
            break;

            case 6:
                execRetangulo();                
            break;

            case 7:
                execTrocaValores();
            break;

            case 8:
                execMaiorIdade();
            break;

            case 9:
                execCalculadora();
            break;

            case 10:
                execPergunta();
            break;
        }
        entrada.close();
        
    }

    public static void execSomaInteiro (){
		int inteiro1 = 3;
		int inteiro2 = 23;
		SomaInteiros.soma(inteiro1, inteiro2);
    }

    public static void execMediaPonderada (){
		float nota1, nota2, nota3;
		float peso1, peso2, peso3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextFloat();
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextFloat();
		System.out.println("Informe a terceira nota: ");
		nota3 = entrada.nextFloat();
		System.out.println("Informe o primeiro peso: ");
		peso1 = entrada.nextFloat();
		System.out.println("Informe o segundo peso: ");
		peso2 = entrada.nextFloat();
		System.out.println("Informe o terceiro peso: ");
		peso3 = entrada.nextFloat();
		
		float media_ponderada = MediaPonderada.calcula(nota1, nota2, nota3, peso1, peso2, peso3);
		System.out.println(media_ponderada);	
		entrada.close();
    }

    public static void execConcatenador (){
        Concatenador concatenador = new Concatenador();
		concatenador.entrada();
		concatenador.concatena();
		System.out.println(concatenador.getNomeCompleto());
    }

    public static void execParidade (){
        Scanner entrada = new Scanner(System.in);
		int inteiro;
		System.out.println("Digite um inteiro: ");
		inteiro = entrada.nextInt();
		if (Paridade.verifica(inteiro)) {
			System.out.println(inteiro + " é par");
		}else {
			System.out.println(inteiro + " é ímpar");
		}
		entrada.close();
    }

    public static void execConversor (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a temperatura:");
        float num1 = entrada.nextFloat();
        System.out.println("Insira a unidade de origem (C ou F) ou (0 / 1):");
        char operacao = entrada.next().charAt(0);
        switch (operacao) {
            case 'C':
                System.out.println("Celsius para Fahrenheit: ");
                System.out.println(num1 + " °C = " + Conversor.celsiusParaFahrenheit(num1) + " °F");
                break;
            case 'F':
                System.out.println("Fahrenheit para Celsius: ");
                System.out.println(num1 + " °F = " + Conversor.fahrenheitParaCelsius(num1) + " °C");
                break;
            case 's':
        }
        entrada.close();
    }

    public static void execConversorAlt (){
        Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a temperatura:");
		float temp = entrada.nextFloat();
		System.out.println("Insira a unidade de origem 0 para ºC, 1 para ºF:");
		int operacao = entrada.nextInt();
		float temp_convertida = ConversorAlt.converte(temp, Character.getNumericValue(operacao));
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

    private static void execRetangulo() {
        int largura, altura;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Largura do Retangulo: ");
		largura = entrada.nextInt();
		System.out.println("Altura do Retangulo: ");
		altura = entrada.nextInt();
		System.out.println("Area do Retangulo = " + Retangulo.calculaArea(largura, altura));
		entrada.close();
    }

    private static void execTrocaValores() {
		int umInteiro = 10;
		int outroInteiro = 20;
		TrocaValores.troca(umInteiro, outroInteiro);	
    }

    private static void execMaiorIdade(){
		Scanner entrada = new Scanner(System.in);
		int idade;
		int dia_nasc, mes_nasc, ano_nasc, dia_atual, mes_atual, ano_atual;
		System.out.println("Informe a idade: ");
		idade = entrada.nextInt();
		if (MaiorIdade.verificaMaioridade(idade)){
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		System.out.println("Informe o dia de nascimento: ");
		dia_nasc = entrada.nextInt();
		System.out.println("Informe o mes de nascimento: ");
		mes_nasc = entrada.nextInt();
		System.out.println("Informe o ano de nascimento: ");
		ano_nasc = entrada.nextInt();
		System.out.println("Informe o dia atual: ");
		dia_atual = entrada.nextInt();
		System.out.println("Informe o mes atual: ");
		mes_atual = entrada.nextInt();
		System.out.println("Informe o ano atual: ");		
		ano_atual = entrada.nextInt();
		
		idade = MaiorIdade.obtemIdadeDeData(mes_nasc, dia_nasc, ano_nasc, mes_atual, dia_atual, ano_atual);
		System.out.println(idade);
		entrada.close();
    }

    public static void execCalculadora(){
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

    public static void execPergunta(){
		ArrayList<Pergunta> showDoMilhao = new ArrayList<Pergunta>();
		int quantAltCerta = 0;
		Pergunta pergunta1 = new Pergunta();
		pergunta1.criarPergunta();
		Pergunta pergunta2 = new Pergunta();
		pergunta2.criarPergunta();
		Pergunta pergunta3 = new Pergunta();
		pergunta3.criarPergunta();
		showDoMilhao.add(pergunta1);
		showDoMilhao.add(pergunta2);
		showDoMilhao.add(pergunta3);

		System.out.println("Show do Milhão");
		for(Pergunta pergunta : showDoMilhao) {
			if (pergunta.executarPergunta()) {
				quantAltCerta += 1;
			}
		}
		System.out.println( quantAltCerta + " corretas de " + showDoMilhao.size() + " questões");
    }

}
