# Conceitos Básicos em Java

## 1. O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.

Uma classe em Java é uma estrutura que define um conjunto de atributos e métodos que descrevem as propriedades e o comportamento de um objeto. 

A diferença entre uma **classe** e um objeto é que uma classe é uma estrutura abstrata que define o molde ou o modelo de um objeto, enquanto um **objeto** é uma instância específica dessa classe, com valores específicos para seus atributos. 

Por exemplo, uma classe "Carro" pode definir as propriedades de cor, modelo e ano do carro, bem como os métodos para acelerar e freiar. Um objeto "Carro" específico criado a partir dessa classe teria valores específicos atribuídos a cada uma dessas propriedades, como "branco", "sedan", "2016" e seu atributo de velocidade que pode ser modificado pelo seus métodos.  Cada instância de "Carro" poderá ter valores específicos e seria identificada com suas respectivas identidades exclusivas.

### Exemplos:

<details>
<summary> Classe Carro</summary>

**Java**
- Criação da Classe Carro
```java
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int incremento) {
        velocidade += incremento;
    }

    public void freiar(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
}
```

- Criação do Objeto Carro
```java
public static void main(String[] args) {
    Carro carro1 = new Carro("Marea", "Prata", 1998);

    // Acessando os atributos do carro
    System.out.println("Marca: " + carro1.getMarca());
    System.out.println("Cor: " + carro1.getCor());
    System.out.println("Ano: " + carro1.getAno());

    // Realizando ações com o carro
    carro1.acelerar(100);
    carro1.freiar(50);
    System.out.println("Velocidade atual: " + carro1.getVelocidade());
}
```

**C++** 
- Criação da Classe Carro
```cpp
class Carro {
private:
    std::string marca;
    std::string modelo;
    int ano;
    int velocidade;

public:
    Carro(std::string marca, std::string modelo, int ano) {
        this->marca = marca;
        this->modelo = modelo;
        this->ano = ano;
        this->velocidade = 0;
    }

    void acelerar(int incremento) {
        velocidade += incremento;
    }

    void freiar(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
};
```

- Criação do Objeto Carro
```C++
int main() {
    Carro carro1("Marea", "Prata", 1998);

    std::cout << "Marca: " << carro1.getMarca() << std::endl;
    std::cout << "Cor: " << carro1.getCor() << std::endl;
    std::cout << "Ano: " << carro1.getAno() << std::endl;

    carro1.acelerar(100);
    carro1.freiar(50);
    std::cout << "Velocidade atual: " << carro1.getVelocidade() << std::endl;

    return 0;
}
```

</details>

<details>
<summary> Classe Pessoa</summary>

 **Java**
 - Criação da Classe Pessoa
```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
```

- Criação do Objeto Pessoa
```java
public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("John Smith", 25);

    System.out.println("Nome: " + pessoa1.getNome());
    System.out.println("Idade: " + pessoa1.getIdade());
}
```

**C++**
- Criação da Classe Pessoa
``` C++
class Pessoa {
private:
    std::string nome;
    int idade;

public:
    Pessoa(std::string nome, int idade) {
        this->nome = nome;
        this->idade = idade;
    }

    std::string getNome() {
        return nome;
    }

    int getIdade() {
        return idade;
    }
};
```

- Criação do Objeto Pessoa
```C++
int main() {
    Pessoa pessoa1("John Smith", 25);

    std::cout << "Nome: " << pessoa1.getNome() << std::endl;
    std::cout << "Idade: " << pessoa1.getIdade() << std::endl;

    return 0;
}
```

</details>

<details>
<summary> Classe ContaBancaria</summary>

 **Java**
- Criação da Classe ContaBancaria
```java
public class ContaBancaria {
    private String titular;
    private double saldo;
    private String agencia;
    private String tipoConta;
    private String numeroConta;

    public ContaBancaria(String titular, String agencia, String tipoConta, String numeroConta) {
        this.titular = titular;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
```

 - Criação do Objeto ContaBancaria
```java 
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("John Smith", "1234", "Corrente", "1001");

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Agência: " + conta1.getAgencia());
        System.out.println("Tipo de Conta: " + conta1.getTipoConta());
        System.out.println("Número da Conta: " + conta1.getNumeroConta());

        conta1.depositar(1000);
        conta1.sacar(500);
        System.out.println("Saldo: " + conta1.getSaldo());
    }
```

**C++**
- Criação da Classe ContaBancaria
``` C++
class ContaBancaria {
private:
    std::string titular;
    double saldo;
    std::string agencia;
    std::string tipoConta;
    std::string numeroConta;

public:
    ContaBancaria(std::string titular, std::string agencia, std::string tipoConta, std::string numeroConta) {
        this->titular = titular;
        this->agencia = agencia;
        this->tipoConta = tipoConta;
        this->numeroConta = numeroConta;
        this->saldo = 0.0;
    }

    std::string getTitular() {
        return titular;
    }

    double getSaldo() {
        return saldo;
    }

    std::string getAgencia() {
        return agencia;
    }

    std::string getTipoConta() {
        return tipoConta;
    }

    std::string getNumeroConta() {
        return numeroConta;
    }

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            std::cout << "Saldo insuficiente." << std::endl;
        }
    }
};
```

- Criação do Objeto ContaBancaria
```C++ 
int main() {
    ContaBancaria conta1("John Smith", "1234", "Corrente", "1001");

    std::cout << "Titular: " << conta1.getTitular() << std::endl;
    std::cout << "Agência: " << conta1.getAgencia() << std::endl;
    std::cout << "Tipo de Conta: " << conta1.getTipoConta() << std::endl;
    std::cout << "Número da Conta: " << conta1.getNumeroConta() << std::endl;

    conta1.depositar(1000); 
    conta1.sacar(500);
    std::cout << "Saldo: " << conta1.getSaldo() << std::endl;

    return 0;
}
```

</details>

<details>
<summary> Classe Venda</summary>


 **Java**
- Criação da Classe Venda
```java
public class Venda {
    private String cliente;
    private List<String> produtos;

    public Venda(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
    }

    public void removerProduto(String produto) {
        produtos.remove(produto);
    }

    public void imprimirVenda() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Produtos: ");
        for (String produto : produtos) {
            System.out.println("- " + produto);
        }
    }
}
```

- Criação do Objeto Venda
```java
public static void main(String[] args) {
    Venda venda1 = new Venda("Cliente A");

    venda1.adicionarProduto("Produto 1");
    venda1.adicionarProduto("Produto 2");
    venda1.adicionarProduto("Produto 3");

    venda1.imprimirVenda();

    venda1.removerProduto("Produto 2");

    venda1.imprimirVenda();
}
```

**C++**
- Criação da Classe Venda
```cpp
class Venda {
private:
    std::string cliente;
    std::vector<std::string> produtos;

public:
    Venda(std::string cliente) {
        this->cliente = cliente;
    }

    std::string getCliente() {
        return cliente;
    }

    std::vector<std::string> getProdutos() {
        return produtos;
    }

    void adicionarProduto(std::string produto) {
        produtos.push_back(produto);
    }

    void removerProduto(std::string produto) {
        for (auto it = produtos.begin(); it != produtos.end(); ++it) {
            if (*it == produto) {
                produtos.erase(it);
                break;
            }
        }
    }

    void imprimirVenda() {
        std::cout << "Cliente: " << cliente << std::endl;
        std::cout << "Produtos: " << std::endl;
        for (const auto& produto : produtos) {
            std::cout << "- " << produto << std::endl;
        }
    }
};
```

- Criação do Objeto Venda
```cpp
int main() {
    Venda venda1("Cliente A");

    venda1.adicionarProduto("Produto 1");
    venda1.adicionarProduto("Produto 2");
    venda1.adicionarProduto("Produto 3");

    venda1.imprimirVenda();

    venda1.removerProduto("Produto 2");

    venda1.imprimirVenda();

    return 0;
}
```
</details>

<details>
<summary> Classe Filme</summary>

 **Java**
- Criação da Classe Filme
```java
public class Filme {
    private String titulo;
    private int ano;
    private String diretor;
    private String sinopse;
    private String genero;
    private ArrayList<String> atores;

    public Filme(String titulo, int ano, String diretor, String sinopse, String genero, List<String> atores) {
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.genero = genero;
        this.atores = atores;
    }

    public void adicionarAtor(String ator) {
        atores.add(ator);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public List<String> getAtores() {
        return atores;
    }
}
```

- Criação do Objeto Filme
```java
public static void main(String[] args) {  
    Filme filme = new Filme("Inception", 2010, "Christopher Nolan", "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.", "Action, Adventure, Sci-Fi", atores);

    List<String> atores = new ArrayList<>();
    atores.add("Leonardo DiCaprio");
    atores.add("Tom Hardy");
    atores.add("Joseph Gordon-Levitt");

    filme.adicionarAtor("Tom Hardy");
    System.out.println(filme.getTitulo());
    System.out.println(filme.getAno());
    System.out.println(filme.getDiretor());
    System.out.println(filme.getSinopse());
    System.out.println(filme.getGenero());
    System.out.println(filme.getAtores());

    
    
}
```

**C++**
- Criação da Classe Filme
``` C++
class Filme {
private:
    std::string titulo;
    int ano;
    std::string diretor;
    std::string sinopse;
    std::string genero;
    std::vector<std::string> atores;

public:
    Filme(std::string titulo, int ano, std::string diretor, std::string sinopse, std::string genero, std::vector<std::string> atores) {
        this->titulo = titulo;
        this->ano = ano;
        this->diretor = diretor;
        this->sinopse = sinopse;
        this->genero = genero;
        this->atores = atores;
    }

    void adicionarAtor(const std::string& ator) {
        atores.push_back(ator);
    }

    std::string getTitulo() {
        return titulo;
    }

    int getAno() {
        return ano;
    }

    std::string getDiretor() {
        return diretor;
    }

    std::string getSinopse() {
        return sinopse;
    }

    std::string getGenero() {
        return genero;
    }

    std::vector<std::string> getAtores() {
        return atores;
    }
};
```

- Criação do Objeto Filme
```cpp
int main() {
   Filme filme("Inception", 2010, "Christopher Nolan", "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.", "Action, Adventure, Sci-Fi", atores);

    std::vector<std::string> atores = {"Leonardo DiCaprio", "Tom Hardy", "Joseph Gordon-Levitt"}; 
    filme.adicionarAtor("Tom Hardy");
    std::cout << filme.getTitulo() << std::endl;
    std::cout << filme.getAno() << std::endl;
    std::cout << filme.getDiretor() << std::endl;
    std::cout << filme.getSinopse() << std::endl;
    std::cout << filme.getGenero() << std::endl;
    for (const std::string& ator : filme.getAtores()) {
        std::cout << ator << std::endl;
    }

    return 0;
}
```
</details>



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

### Exemplos

<details>
<summary> Herança em Java e C++ </summary>

A classe derivada adiciona um método específico, `turbo()`, adicionando uma extensão à funcionalidade da classe base.

**Java**
```java
class CarroEsportivo extends Carro {
    public CarroEsportivo(String modelo) {
        super(modelo);
    }

    public void turbo() {
        System.out.println("Ativando modo turbo no carro esportivo " + getModelo());
    }
}
```

**C++** 
```cpp
class CarroEsportivo : public Carro {
public:
    CarroEsportivo(std::string modelo) : Carro(modelo) {}

    void turbo() {
        std::cout << "Ativando modo turbo no carro esportivo " << getModelo() << std::endl;
    }
};
```

</details>

<details>
<summary> Herança e Proteção de acesso</summary>

A classe derivada `ContaPoupanca` utiliza métodos da classe base para acessar e modificar o saldo da classe base.

**Java**
```java
public class ContaPoupanca extends ContaBancaria {
    protected double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, String agencia, String numeroConta, double taxaRendimento) {
        super(titular, saldo, agencia, "Poupança", numeroConta);
        this.taxaRendimento = taxaRendimento;
    }

    protected void aplicarRendimento() {
        double saldoAtual = getSaldo(); // Saldo no ancestral é private
        saldoAtual += saldoAtual * taxaRendimento;
        setSaldo(saldoAtual);  
        System.out.println("Rendimento aplicado. Novo saldo: " + getSaldo());
    }
}
```

**C++** 
```cpp
class ContaPoupanca : public ContaBancaria {
private:
    double taxaRendimento;

public:
    ContaPoupanca(std::string titular, double saldo, std::string agencia, std::string numeroConta, double taxaRendimento)
        : ContaBancaria(titular, saldo, agencia, "Poupança", numeroConta), taxaRendimento(taxaRendimento) {}

    void aplicarRendimento() {
        double saldoAtual = getSaldo();  // Saldo no ancestral é private
        saldoAtual += saldoAtual * taxaRendimento;
        depositar(saldoAtual); 
        std::cout << "Rendimento aplicado. Novo saldo: " << getSaldo() << std::endl;
    }
};
```

</details>

<details>
<summary> Herança com novo atributo e método</summary>

A classe derivada `DocumentoTexto` adiciona um método específico, `editar()`, extendendo a funcionalidade da classe base `Documento`. E utiliza herança para acessar e modificar o atributo protegido titulo da classe base.

**Java**
```java
public class Documento {
    protected String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public void abrir() {
        System.out.println("Abrindo o documento: " + titulo);
    }

    public void fechar() {
        System.out.println("Fechando o documento: " + titulo);
    }
}

public class DocumentoTexto extends Documento {
    private String conteudo;

    public DocumentoTexto(String titulo, String conteudo) {
        super(titulo);
        this.conteudo = conteudo;
    }

    public void editar() {
        System.out.println("Editando o documento de texto: " + titulo);
    }

    public String getTitulo() {
        return titulo;
    }
}
```


**C++** 
```cpp
class Documento {
protected:
    std::string titulo;

public:
    Documento(std::string titulo) : titulo(titulo) {}

    void abrir() {
        std::cout << "Abrindo o documento: " << titulo << std::endl;
    }

    void fechar() {
        std::cout << "Fechando o documento: " << titulo << std::endl;
    }

};

class DocumentoTexto : public Documento {
private:
    std::string conteudo;

public:
    DocumentoTexto(std::string titulo, std::string conteudo)
        : Documento(titulo), conteudo(conteudo) {}

    void editar() {
        std::cout << "Editando o documento de texto: " << titulo << std::endl;
    }

    std::string getTitulo() const {
        return titulo;
    }
};

```

</details>

<details>
<summary> Herança e Hierarquia</summary>

A hierarquia de herança é demonstrada com as classes `Adicao` e `Multiplicacao`. A interface (em Java) e classe (em C++ ) `OperacaoMatematica` define o método `realizarOperacao()`, implementado pela classe `Adicao`. A classe `Multiplicacao` herda de `Adicao` e utiliza a herança para acessar o método `realizarOperacao()` da classe base.

**Java**
```java
interface OperacaoMatematica {
    void realizarOperacao();
}

class Adicao implements OperacaoMatematica {
    public void realizarOperacao() {
        System.out.println("Realizando a operação de adição");
    }

    void metodoEspecificoAdicao() {
        System.out.println("Método específico da classe Adicao");
    }
}

class Multiplicacao extends Adicao {
    void chamarOperacaoAdicao() {
        super.realizarOperacao();  
    }
}
```

**C++** 
```cpp
class OperacaoMatematica {
public:
    virtual void realizarOperacao() = 0; 
};

class Adicao : public OperacaoMatematica {
public:
    void realizarOperacao() override {
        std::cout << "Realizando a operação de adição" << std::endl;
    }

    void metodoEspecificoAdicao() {
        std::cout << "Método específico da classe Adicao" << std::endl;
    }
};

class Multiplicacao : public Adicao {
public:
    void chamarOperacaoAdicao() {
        Adicao::realizarOperacao(); 
    }
};
```

</details>


<details>
<summary> Herança múltipla</summary>

Em Java, a herança múltipla é simulada usando interfaces. A classe `Estudante` herda de `Pessoa` e implementa a interface `Trabalhador`. No C++, a herança múltipla é diretamente utilizada pela classe `Estudante`, que herda tanto de `Pessoa` quanto de `Trabalhador`.

**Java**
```java
interface Trabalhador {
    void realizarTrabalho();
}

class Estudante extends Pessoa implements Trabalhador {
    public Estudante(String nome) {
        super(nome);
    }

    @Override
    public void realizarTrabalho() {
        System.out.println("Realizando trabalho de estudante.");
    }
}
```

**C++** 
```cpp
class Trabalhador {
public:
    virtual void realizarTrabalho() = 0; 
};

class Estudante : public Pessoa, public Trabalhador {
public:
    Estudante(std::string nome) : Pessoa(nome) {}

    void realizarTrabalho() override {
        std::cout << "Realizando trabalho de estudante." << std::endl;
    }
};
```

</details>

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
