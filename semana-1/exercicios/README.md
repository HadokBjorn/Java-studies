## Exercícios

Todos os exercícios da primeira semana de aula do curso de java estão aqui, cada atividade foi desenvolvida em uma classe propria.

# Importante: 

Você encontrará o código comentado no App.java, mas basta remover as "//" e rodar a função main para testar a saída das funções de solução dos exercicios.

## Lista dos Exercícios
- **O que é esse número?**

    Algoritmo que recebe um número qualquer e imprime na tela se o número é par ou ímpar, positivo ou negativo.
    ```
        // Exemplos de Saída
        -5 é ímpar e negativo.
        10 é par e positivo.
    ```
- **Fibonacci**

    Dado um número inteiro x, imprime uma sequência de Fibonacci de tamanho x.
    ```
        // Exemplo de saída para uma sequência de tamanho 5
        0 1 1 2 3

        // Exemplo de saída para uma sequência de tamanho 10
        0 1 1 2 3 5 8 13 21 34

        // Exemplo de saída para uma sequência de tamanho 20
        0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
    ```

- **MultiplicaAí**
    
    Código que imprime a tabela de multiplicação de algum número fornecido além de exibir um cabeçalho com o nome `Tabela de multiplicação de X`, onde X é o número a ser multiplicado.
    ```
        // Exemplo de saída
        Tabela de multiplicação por 5
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            5 x 4 = 20
            5 x 5 = 25
            5 x 6 = 30
            5 x 7 = 35
            5 x 8 = 40
            5 x 9 = 45
            5 x 10 = 50
    ```

- **Pirâmide de números**
    
    Cria uma pirâmide de números, onde imprime em cada linha separada a quantidade de números que está sendo iterado no momento. 
    
    Por exemplo, se a sua iteração for de 5 elementos, o resultado final ficaria assim:
    ```
        1
        22
        333
        4444
        55555
    ```
- - **Duplicados não!**
    
    Código que encontra os elementos em comum que existem em dois arrays e imprime no console quais são esses elementos, um a um.
    ```
        // Exemplo com as seguintes entradas:

        array1 => "Morango", "Banana", "Maçã", "Uva", "Caqui"
        array2 => "Manga", "Caqui", "Morango", "Amora"

        // A saída seria:
        Morango
        Caqui
    ```
- **Holidayzer**
    
    Esse é um Calendário de feriados:
    
    - Uma função imprime a lista com todos os feriados
    - Uma função recebe uma data como parâmerto e retorna uma mensagem.
        - Se o dia não for feriado, imprime: “Dia <data-inserida> não é feriado 🥲”
        - Se o dia for feriado, retorna: “Dia <data-inserida> é <nome-do-feriado>! 🎉”
    - Os feriados são objetos criados a partir de uma classe. utilizando o conceito de encapsulamento (com `getters` e `setters` conforme a necessidade).

    ```
        "01-01-2024" => "Confraternização Mundial"
        "12-02-2024" => "Carnaval"
        "13-02-2024" => "Carnaval"
        "29-03-2024" => "Sexta-feira Santa"
        "21-04-2024" => "Tiradentes"
        "01-05-2024" => "Dia do Trabalho"
        "30-05-2024" => "Corpus Christi"
        "07-09-2024" => "Independência do Brasil"
        "12-10-2024" => "Nossa Senhora Aparecida"
        "02-11-2024" => "Finados"
        "15-11-2024" => "Proclamação da República"
        "20-11-2024" => "Dia Nacional de Zumbi e da Consciência Negra"
        "25-12-2024" => "Natal"
    ```
- - **APItização dos Feriados**
    
    Transformei o exercício anterior em uma API! As rotas à seguir são correspondentes às funções descritas:
    - **GET** `/holidays`
    - **GET** `/holidays/:date` (data no formato `30-05-2024`)

    **OBS:** Para ver a API basta clicar [AQUI](https://github.com/HadokBjorn/Java-studies/tree/main/semana-1/api).