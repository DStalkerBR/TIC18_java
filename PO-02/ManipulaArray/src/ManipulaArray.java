import java.util.Scanner;

public class ManipulaArray {
    /**
     * Cria um array de inteiros com base na entrada do usuário.
     * 
     * @return O array de inteiros criado pelo usuário.
     */
    public static int[] criarArrayUser() {
        Scanner entrada = new Scanner(System.in);
        int tamanho;
        int[] array;
        System.out.println("Quantos elementos deseja inserir?");
        if (entrada.hasNextInt()) {
            tamanho = entrada.nextInt();
        } else {
            System.out.println("Valor inválido!");
            entrada.close();
            return null;
        }
        array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o inteiro " + (i + 1) + " de " + tamanho + " :");
            if (entrada.hasNextInt()) {
                array[i] = entrada.nextInt();
            } else {
                System.out.println("Valor inválido!");
                entrada.close();
                return null;
            }
        }

        entrada.close();
        return array;        
    }

    /**
     * Cria um array de inteiros preenchido com valores aleatórios dentro de um intervalo específico.
     *
     * @param tamanho o tamanho do array a ser criado
     * @param min o valor mínimo do intervalo (inclusive)
     * @param max o valor máximo do intervalo (exclusive)
     * @return um array de inteiros preenchido com valores aleatórios
     */
    public static int[] criarArrayAleatorio(int tamanho, int min, int max) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = (int) (Math.random() * max + min);
        }
        return array;
    }

    /**
     * Soma todos os elementos de um array de inteiros.
     * 
     * @param array O array de inteiros a ser somado.
     * @return A soma de todos os elementos do array.
     */
    public static int somaArray (int[] array) {
        int soma = 0;
        for (int inteiro : array) {
            soma += inteiro;            
        }
        return soma;
    }

    /**
     * Retorna o maior valor presente em um array de inteiros.
     * 
     * @param array o array de inteiros
     * @return o maior valor presente no array
     */
    public static int getMaior (int[] array) {
        int maior = array[0];
        for (int inteiro : array) {
            if (inteiro > maior) {
                maior = inteiro;
            }
        }
        return maior;
    }

    /**
     * Retorna o menor valor presente em um array de inteiros.
     *
     * @param array O array de inteiros.
     * @return O menor valor presente no array.
     */
    public static int getMenor (int[] array) {
        int menor = array[0];
        for (int inteiro : array) {
            if (inteiro < menor) {
                menor = inteiro;
            }
        }
        return menor;
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Criando array lido pelo usuário...");
        int[] arrayUser = criarArrayUser();
        System.out.println("Soma do array: " + somaArray(arrayUser));
        System.out.println("Maior valor do array: " + getMaior(arrayUser));
        System.out.println("Menor valor do array: " + getMenor(arrayUser));

        System.out.println("\nCriando array aleatório... (tamanho: 10, min: 0, max: 1000)");
        int[] arrayAleatorio = criarArrayAleatorio(10, 0, 1000);
        System.out.println("Soma do array aleatório: " + somaArray(arrayAleatorio));
        System.out.println("Maior valor do array aleatório: " + getMaior(arrayAleatorio));
        System.out.println("Menor valor do array aleatório: " + getMenor(arrayAleatorio));
    }
}
