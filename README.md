# poo-2023-1-ac-04-equipe-samueltulio
poo-2023-1-ac-04-equipe-samueltulio created by GitHub Classroom
- Classe Conta.java possui Carvalho & Teixeira atividade prática 1;
- Classe Main.java possui Carvalho & Teixeira atividade prática 2;

# Atividade do livro Batista Morais

##
Atividade 
- Questão 1:

class Lampada {
    String modelo;
    String marca;
    String tipo;
    float potencia;
    float valor;
}

- Questão 2:

class Campeonato {
    String nomeTimes;
    String tiposCompeonato;
    String endereco; (cidade,rua,bairro,numero,nomeCampo)
    LocalDate datahora;
    float totalTimes;
    float valorIngresso;
    String premiações;
}

- Questão 3 -> O codigo ContaBancariaSimplificada e TestaContaBancariaSimplificad representa a resposta da questão solicitada.

- Questão 4 -> Arquivo Lampada.

- Questão 5 -> Arquivo Campeonato.

- Questão 7:
    - O nome da classe foi escrito erroneamente, com espaços em branco;

- Questão 8:
    - O método maior() retorna um boolean em vez de int;
    - O método menor() não devia retornar nada e retorna um inteiro;
    - O comentário está fora da classe;

- Questão 9:
    - O método main está fora do padrão;
    - Não é um método que deva retornar um valor;
    - O comentário está fora da classe;

- Questão 10:
    - Sobre classe TesteDatas:
        - Erro na declaração do main, pois o valor de retorno void deve vir depois do static;
        - Não é possível invocar o método inicializaData() em amanha pois este não foi declarado;
    - Sobre classe TesteObjetos:
        - b está sendo atribuido a algo não declarado, no caso a;
        - O objeto anteriormente criado e referenciado por b será elegível para coleta de lixo pois não há mais como referenciar no código;