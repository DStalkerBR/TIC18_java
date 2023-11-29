package jogo;

import java.util.Scanner;

public class JogoAdivinhacao {
    public static void iniciar(){
        Scanner entrada = new Scanner(System.in);
        int numeroChute = 0;
        int numeroGerado = JogoAdivinhacao.gerarNumeroAleatorio(1, 100);
        JogoAdivinhacao.loading("Pensando em um número", "...", 500);
        System.out.println("Número gerado!");
        do {
            System.out.println("\nDigite um número entre 1 e 100:");
            if (entrada.hasNextInt()) {
                numeroChute = entrada.nextInt();
                JogoAdivinhacao.loading("Verificando sua resposta", "...", 200);            
                if (numeroChute > numeroGerado) {
                    if (numeroChute - numeroGerado <= 10) {
                        JogoAdivinhacao.loading(null, "Um pouco ", 300);
                        JogoAdivinhacao.loading(null, "Alto!", 100);
                    } else {
                        JogoAdivinhacao.loading(null, "Muito ", 300);
                        JogoAdivinhacao.loading(null, "Alto!", 100);
                    }
                } else if (numeroChute < numeroGerado) {
                    if (numeroGerado - numeroChute <= 10) {
                        JogoAdivinhacao.loading(null, "Um pouco ", 400);
                        JogoAdivinhacao.loading(null, "Baixo!", 100);
                    } else {
                        JogoAdivinhacao.loading(null, "Muito ", 400);
                        JogoAdivinhacao.loading(null, "Baixo!", 100);
                    }
                } else {
                    System.out.println("\n--------Você acertou!--------");
                    System.out.println("O número era: " + numeroGerado);
                    System.out.println("Fim de jogo! Pressione enter para sair.");
                    entrada.nextLine();
                }
                // verifica se o numero está perto do numero gerado
              
            } else {
                System.out.println("Valor inválido!");
            }

        } while (numeroChute != numeroGerado);
        entrada.close();
    }
    
    public static int gerarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * max + min);
    }

    public static void loading(String mensagem,  String letras, int tempo) {
        if (mensagem != null) {
            System.out.print(mensagem);
        }
        for (int i = 0; i < letras.length(); i++) {
            try {
                Thread.sleep(tempo);
                System.out.print(letras.charAt(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao jogo de adivinhação!");
        JogoAdivinhacao.iniciar();
    }
}
