# Conceitos Básicos em Java

## 1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

Uma classe em Java é uma estrutura que define um conjunto de atributos e métodos que descrevem as propriedades e o comportamento de um objeto. 

A diferença entre uma **classe** e um objeto é que uma classe é uma estrutura abstrata que define o molde ou o modelo de um objeto, enquanto um **objeto** é uma instância específica dessa classe, com valores específicos para seus atributos. 

Por exemplo, uma classe "Carro" pode definir as propriedades de cor, modelo e ano do carro, bem como os métodos para acelerar e freiar. Um objeto "Carro" específico criado a partir dessa classe teria valores específicos atribuídos a cada uma dessas propriedades, como "branco", "sedan", "2016" e seu atributo de velocidade que pode ser modificado pelo seus métodos.  Cada instância de "Carro" poderá ter valores específicos e seria identificada com suas respectivas identidades exclusivas.


##  2. Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++.

Em Java, você pode declarar uma variável especificando seu tipo de dados e um nome para a variável. Por exemplo, para declarar uma variável do tipo `int` chamada `velocidade`, você pode escrever `int velocidade;`. Isso cria uma variável do tipo inteiro chamada `velocidade` que pode ser usada para armazenar valores inteiros.

Java possui 8 tipos primitivos:
- `int`: usado para representar números inteiros;
- `double`: usado para representar números decimais (ponto flutuante);
- `boolean`: usado para representar valores verdadeiro ou falso (verdadeiro ou falso);
- `char`: usado para representar caracteres individuais, como letras ou símbolos;
- `byte`: usado para representar números inteiros de até 8 bits;
- `short`: usado para representar números inteiros de até 16 bits;
- `long`: usado para representar números inteiros de até 64 bits.

Em C++, as declarações de variáveis são semelhantes ao Java. Assim como os tipos primitivos mais comuns `int`, `double`, `float`, `char` e `bool` (ao invés de `boolean`).  No entanto, existem algumas diferenças importantes:

- Em C++, há mais tipos primitivos devido à presença de tipos `unsigned` e `signed`. 

- Java tem tipos de dados de tamanho fixo e são portáveis entre todas as plataformas que suportem a linguagem, enquanto em C++ os tipos primitivos podem variar com base na plataforma (arquitetura da máquina + sistema operacional) para a qual o programa é compilado, e são determinados durante a implementação para uma plataforma específica.

- Em Java, o tipo `char` utiliza 2 bytes para **Unicode**, enquanto em C++, é usado 1 byte para **ASCII**.


## 3. Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos.

Em Java, herança permite criar uma classe (subclasse) com base em uma classe existente (superclasse), utilizando a palavra-chave `extends` seguida do nome da classe da qual deseja herdar. Isso possibilita herdar atributos e métodos da superclasse, além de adicionar ou alterar os existentes.

```java
class MinhaSubclasse extends MinhaClasse {
// corpo da subclasse
}
```

Em C++, a herança é semelhante, mas usando o operador `:` em vez de `extends`, e requer a especificação da visibilidade (`public`, `protected` ou `private`). No caso de Java não há um especificador de herança. Logo, não é possível alterar o nível de proteção dos membros da superclasse em Java.

```c++
class MinhaSubclasse: public MinhaClasse {
// corpo da subclasse
}
```
| **Em Java**                                                                                                    | **Em C++**                                                                                                            |
|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| Todas as classes herdam diretamente ou indiretamente da classe `Object`. Existe uma única árvore de herança de classes em Java, com `Object` sendo a raiz. Ao criar uma classe, ela herda automaticamente da classe `Object`. | Existe uma variedade de classes, e criar uma classe que não herda de outra cria uma nova árvore na "floresta".            |
| Não é possível acessar diretamente os membros do "avô" (classe ancestral direta).                                  | É permitido acessar diretamente os membros do "avô" usando o operador de resolução de escopo (`::`).                     |
| Não há suporte para herança múltipla; uma classe não pode herdar de mais de uma classe. Em vez disso, uma classe pode "implementar" várias interfaces. | Suporta herança múltipla; uma classe pode herdar de várias classes. A herança múltipla permite que uma classe herde membros de várias classes diferentes. |

No geral, tanto Java quanto C++ suportam herança de classe, mas o processo de implementação difere ligeiramente entre as linguagens.

##  4. Quando declaramos uma variável em Java, temos, na verdade, um ponteiro. Em C++ é diferente. Discorra sobre esse aspecto.

Em Java, todas as variáveis de **objetos** são tratadas como referências,comportando-se como ponteiros para objetos, e nunca o próprio objeto, enquanto em C++ as variáveis podem conter diretamente o objeto.

Por exemplo, ao declarar uma variável em Java, como `MinhaClasse obj;`, estamos criando um ponteiro para um objeto da classe MinhaClasse. Esse ponteiro é inicializado com o valor null, e somente após a criação do objeto podemos atribuir a referência desse objeto à variável.

Em C++, ao declarar uma variável, como `MinhaClasse obj;`, estamos criando uma instância direta do objeto, no entanto também é possível usar ponteiros com o operador `*`, declarando `MinhaClasse* ptr;` que cria um ponteiro para um objeto da classe MinhaClasse.

As diferenças fundamentais incluem o fato de que Java não suporta explicitamente ponteiros, mas os utiliza implicitamente para manipulações de referências, uma abordagem que equilibra eficiência com segurança. Ponteiros em C++, por sua vez, são mais flexíveis, mas podem ser perigosos, tornando uma grande fonte de problemas caso usados incorretamente.

Essa diferença tem implicações na implementação de gerenciamento de memória; em Java, o gerenciamento de memória é feito automaticamente pelo coletor de lixo (*garbage collector*), enquanto em C++ é necessário gerenciar manualmente alocação e desalocação de memória ao usar ponteiros.


**Referências:**  
[Comparação C e Java](https://msoe.us/taylor/tutorial/ce2810/csimilar)  
[Java vs. C++](https://www.cs.csub.edu/~hwang/CS3390/java_vs_c++.txt)  
[Tipos de Dados em Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)  
[Acessando Membro de Avós em Java usando `super`](https://www.geeksforgeeks.org/accessing-grandparents-member-in-java-using-super/)  
[Comparação de Herança em C e Java](https://www.geeksforgeeks.org/comparison-of-inheritance-in-c-and-java/)  
[Conceito de Ponteiros em Java](https://www.geeksforgeeks.org/is-there-any-concept-of-pointers-in-java/)  
