# Projeto Livro



Esse projeto consiste em mostrar a utilização de conceitos de POO, como Abstração e Encapsulamento a partir da linguagem Java.



#### Criação



Nesse projeto são criadas as classes "Pessoa", "Livro", a classe principal "ProjetoLivro" e a interface "Publicacao", onde:



###### Classe Pessoa: 



Abstrai o sentido de pessoa como leitor, tendo como atributos privados:

- nome (*Cadeia de caracteres*)
- idade (*Inteiro*)
- sexo (*Caractere único*)

Seus métodos:

- Construtor
- Getters and Setters
- fazerAniver() ... (Será utilizado em versões futuras)



###### Classe Livro:



Abstrai o sentido de livro tendo uma publicação por meio de uma interface "Publicacao" e um leitor do tipo Pessoa. Essa classe possui os seguintes atributos privados:

- titulo (*Cadeia de caracteres*)
- autor (*Cadeia de caracteres*)
- totPaginas (*Inteiro*)
- pagAtual (*Inteiro*)
- aberto (Booleano)
- leitor (Pessoa)

Seus métodos:

- Construtor
- Getters and Setters
- detalhes()

Métodos abstratos (Onde é feita a sobrescrita e implementação dos métodos da Interface "Publicacao"):

- abrir()
- fechar()
- folhear()
- avancarPag()
- voltarPag()



###### Interface Publicacao:



A interface "***Publicacao***" contém especificações para implementação em classes que a implementam, como por exemplo, os métodos sobrescritos e implementados na classe Livro... todo livro precisa ser publicado, então a classe livro é obrigada a implementar os métodos para a sua publicação, que são descritos na interface "***Publicacao***", portanto, os métodos abstratos da interface já foram descritos no tópico acima, são eles:

- abrir()
- fechar()
- folhear(int p) ... (Com o parâmetro de entrada "p" que é do tipo Inteiro)
- avancarPag()
- voltarPag()



###### Classe ProjetoLivro (Classe principal)



Nessa classe é onde foram instanciados os objetos e chamados os métodos.



Como exemplo...



Para instanciar os objetos da classe "Pessoa", utilizei um vetor de 2 posições, do tipo Pessoa, com identificador "p".



Para instanciar os objetos da classe "Livro", utilizei um vetor de 3 posições, do tipo Livro, com identificador "l".



A partir daí, utilizei os métodos implementados na classe "Livro".