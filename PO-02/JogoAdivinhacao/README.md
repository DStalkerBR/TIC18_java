## Jogo de Adivinhação

Este é um simples jogo de adivinhação de números em Java. O jogo gera um número aleatório entre 1 e 100 e o jogador deve tentar adivinhar qual é esse número.

## Como jogar

1. O jogo começa gerando um número aleatório entre 1 e 100.
2. O jogador é solicitado a digitar um número nesse intervalo.
3. Se o número digitado for maior que o número gerado, o jogo informará que o chute foi "Alto". Se a diferença entre o número gerado e o número digitado for de 10 ou menos, o jogo dirá "Um pouco alto", caso contrário, dirá "Muito alto".
4. O jogo continua até que o jogador adivinhe o número correto.

## Métodos

- `iniciar()`: Este método inicia o jogo. Ele gera o número aleatório e controla o fluxo do jogo.
- `gerarNumeroAleatorio(int min, int max)`: Este método gera um número aleatório entre `min` e `max`.
- `loading(String mensagem, String loading, int tempo)`: Este método é usado para criar um efeito de carregamento, exibindo uma mensagem e um indicador de carregamento por um período de tempo especificado.

## Como executar

Para executar este jogo, você precisa ter o Java instalado em seu sistema. Compile o arquivo `JogoAdivinhacao.java` e execute o método `iniciar()`.

```bash
javac JogoAdivinhacao.java
java JogoAdivinhacao
```
