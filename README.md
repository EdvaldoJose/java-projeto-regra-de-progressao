# Projeto Regra de Progressão

Boas-vindas ao repositório do projeto `Regra de Progressão`.  

Para baixar o projeto, `siga os passo descrito a seguir! #vqv 🚀

## Orientações

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`

3. Crie uma branch com base na branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu projeto:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-projeto`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no
seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção
do conteúdo.

Para executar todos os testes, basta rodar o comando:

```bash
mvn test
```

Para executar apenas uma classe de testes:

```bash
mvn test -Dtest="TestClassName"
```

</details>

## Dicas para mandar bem!

> 1. Evite o uso de atributos e métodos estáticos em sua implementação, esses poderão impactar diretamente a saída dos testes já que os valores serão armazenados na classe e não em seus objetos;
> 2. Evite utilizar múltiplas instâncias da classe Scanner, pois poderão conflitar uma com a outra;
> 3. Utilize, sempre que possível, o método nextLine() associado à classe Scanner e realize a conversão do tipo de dado da entrada (String) para o tipo de dado da variável onde a entrada será armazenada (int, float, etc.);
> 4. Evite utilizar os métodos `next()`, `nextInt()`, `nextDouble()`, entre outros. Pois esses métodos, sozinhos, não conseguem representar o fluxo de operação em um terminal, não consumindo novas linhas quando simulamos a utilização da tecla `Enter` durante a execução dos testes.

## Requisitos do projeto

### 1 - Cadastrar atividades avaliativas

Descrição/>

Como regra de negócio, você deve permitir à pessoa estudante cadastrar as atividades avaliativas para o 
período atual, que podem ser do tipo exercícios ou projetos. Cada atividade deve ter um nome descritivo que 
identifique sua natureza e um peso atribuída a ela. Certifique-se de que a pessoa estudante possa cadastrar 
quantas atividades forem necessárias, para que todas sejam levadas em consideração no cálculo do percentual 
alcançado. É necessário que a soma de todos os pesos seja igual a 100.

A nota final da pessoa estudante é dada pela fórmula:

$` {(Peso1*Nota1) + (Peso2*Nota2) + ... + (PesoN*NotaN)\over(Peso1 + Peso2 + ... + PesoN)} = NotaFinal `$

O programa deve seguir as seguintes regras:

- Exibir a mensagem `Digite a quantidade de atividades para cadastrar: ` para saber quantas atividades serão cadastradas para o período e salvar essa informação.
- Dado o número de atividades, repetir as mensagens `Digite o nome da atividade N: ` e `Digite o peso da atividade N:`  para salvar o nome da atividade e seu respectivo peso, sendo N o número da atividade.

_**Nota: As mensagens devem ser EXATAMENTE iguais como sugerido, caso contrario os testes irão falhar**_

Exemplo:

```bash
Digite a quantidade de atividades para cadastrar:
3
Digite o nome da atividade 1:
Projeto Lista de Tarefas
Digite o peso da atividade 1: 
30
Digite o nome da atividade 2:
Projeto Lista de Compras
Digite o peso da atividade 2: 
30
Digite o nome da atividade 3:
Projeto Jogo de Advinhação
Digite o peso da atividade 3: 
40
```

</details>

---

### 2 - Inserir as notas obtidas

Descrição/>

A pessoa estudante precisa ter a capacidade de inserir as notas obtidas em cada exercício ou projeto onde acabou de cadastrar seu nome e peso para o período em questão. Essas notas devem ser armazenadas para posteriormente às atividades correspondentes. Certifique-se de que o programa permita a inserção das notas de forma nítida e intuitiva, para que a pessoa estudante possa registrar sua pontuação em cada atividade avaliativa.

Em outras palavras:

- Repita para cada atividade cadastrada no período a mensagem `Digite a nota obtida para [Nome da Atividade]:` para obter sua respectiva nota.

Exemplo: continuando o exemplo anterior.

```bash
Digite a quantidade de atividades para cadastrar:
3
Digite o nome da atividade 1:
Projeto Lista de Tarefas
Digite o peso da atividade 1: 
30
Digite a nota obtida para Projeto Lista de Tarefas:
22
Digite o nome da atividade 2:
Projeto Lista de Compras
Digite o peso da atividade 2: 
30
Digite a nota obtida para Projeto Lista de Compras:
30
Digite o nome da atividade 3:
Projeto Jogo de Advinhação
Digite o peso da atividade 3: 
40
Digite a nota obtida para Projeto Jogo de Advinhação:
35
```

</details>

---
### 3 - Verificar se a soma dos pesos é igual a 100
<details>
<summary>Descrição</summary><br />

Seguindo a regra de negócio definida anteriormente, a soma dos pesos da atividade deve ser igual 100. Crie uma verificação
para as somas dos pesos.

Por exemplo, suponhamos que temos três atividades avaliativas em um determinado período: o exercício alfa com peso 40,
o exercício beta com peso 10 e o projeto gama com peso 60. Observe que a soma de todos os pesos (40+10+60 = 110)
excede o valor acordado. Da mesma forma, se tivéssemos exercícios cuja soma dos pesos fosse inferior a 100,
também estaríamos violando a nossa regra de negócio.

Em cenários como esses, a seguinte mensagem deve ser exibida na tela da pessoa usuária:

```bash
A soma dos pesos é diferente de 100!
```

</details>

---
### 4 - Informar o resultado alcançado 

<details>
  <summary>Descrição</summary><br />

Este requisito será abordado em duas etapas distintas. Na primeira, analisaremos a corretude do retorno no caso de aprovação da pessoa estudante. Na segunda, focaremos na verificação do retorno quando a pessoa estudante é reprovado. Com dois teste separados.

<details>
  <summary>4.1 Aprovação</summary><br />

A fim de avaliar o desempenho da pessoa estudante, é necessário calcular o percentual alcançado com base nas notas
obtidas nas atividades avaliativas cadastradas. Após inserir todas as notas, o programa deve realizar o cálculo 
automático do percentual alcançado, considerando o peso de cada atividade. Depois, compare esse percentual 
com o valor de referência de **85.0%**. Se o percentual for igual ou superior a **85.0%**, ela será aprovada.

Em outras palavras:

- Após calcular o resultado considerando a nota de todas as atividades, utilize a mensagem:
- `Parabéns! Você alcançou [resultado]%! E temos o prazer de informar que você obteve aprovação!`; ou

Exemplo:

```bash
Parabéns! Você alcançou 87.0%! E temos o prazer de informar que você obteve aprovação! 
```
</details>

<details>
<summary>4.2 Reprovação</summary><br />

Por outro lado, compare o percentual com o valor de referência de **85.0%**. Se o percentual for menor que **85.0%**,
a pessoa estudante será considerada reprovada.

Assim:

- Após calcular o resultado considerando a nota de todas as atividades, utilize a mensagem:

- `Lamentamos informar que, com base na sua pontuação alcançada neste período, [resultado]%, você não atingiu a pontuação mínima necessária para sua aprovação`.


```bash
Lamentamos informar que, com base na sua pontuação alcançada neste período, 70.0%, você não atingiu a pontuação mínima necessária para sua aprovação.
```

Exemplo/>
Exemplo: continuando os exemplos anteriores.

```bash
Digite a quantidade de atividades para cadastrar:
3
Digite o nome da atividade 1:
Projeto Lista de Tarefas
Digite o peso da atividade 1: 
30
Digite a nota obtida para Projeto Lista de Tarefas:
22
Digite o nome da atividade 2:
Projeto Lista de Compras
Digite o peso da atividade 2: 
30
Digite a nota obtida para Projeto Lista de Compras:
30
Digite o nome da atividade 3:
Projeto Jogo de Advinhação
Digite o peso da atividade 3: 
40
Digite a nota obtida para Projeto Jogo de Advinhação:
35
Lamentamos informar que, com base na sua pontuação alcançada neste período, 29.6%, você não atingiu a pontuação mínima necessária para sua aprovação.
```

---
