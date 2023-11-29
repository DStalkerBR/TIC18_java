# ManipulaArray

Este é um programa Java que permite ao usuário criar e manipular um array de inteiros. O usuário pode definir o tamanho do array e os valores de cada elemento. Além disso, o programa também pode criar um array de inteiros preenchido com valores aleatórios dentro de um intervalo específico.

## Métodos

- `criarArrayUser()`: Este método permite ao usuário criar um array de inteiros. O usuário é solicitado a inserir o número de elementos que deseja no array e, em seguida, a fornecer cada valor de elemento. Se o usuário inserir um valor inválido, o método retornará `null`.
- `criarArrayAleatorio(int tamanho, int min, int max)`: Este método cria um array de inteiros preenchido com valores aleatórios dentro de um intervalo específico.
- `somaArray(int[] array)`: Este método soma todos os elementos de um array de inteiros.
- `getMaior(int[] array)`: Este método retorna o maior valor presente em um array de inteiros.
- `getMenor(int[] array)`: Este método retorna o menor valor presente em um array de inteiros.

## Como usar

Para usar este programa, você precisa ter o Java instalado em seu sistema. Compile o arquivo `ManipulaArray.java` e execute o método `main()`.

```bash
javac ManipulaArray.java
java ManipulaArray
```

Isso iniciará o programa e você será solicitado a criar seu array. Siga as instruções na tela para inserir o número de elementos e os valores de cada elemento. Além disso, o programa também criará um array aleatório e exibirá a soma, o maior e o menor valor desse array.