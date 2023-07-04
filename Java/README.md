# Entendendo a estrutura do código em Java deste repositório

## Estrutura mais importante

### Arquivo pom.xml

O arquivo pom.xml possui a declaração de todas as dependências utilizadas neste projeto, são as bibliotecas que são baixadas do repositório Maven para dentro da sua solução na sua máquina local, mas não gravada no repositório do Github.

As principais bibliotecas são estas:

* spring-boot-starter-web: permite a construção de uma solução baseada na web, em nosso caso aqui, para construirmos as chamadas de API REST
* spring-boot-starter-data-jpa: permite o uso do Hibernate para tradução do uso declarativo de persistência no código em scripts SQL executados no banco de dados
* spring-boot-starter-artemis: permite o uso de comunicação assíncrona via Jms para filas

### Estrutura dos pacotes Java

Não é um padrão, mas estou seguindo uma estrutura que, em minha opinião, organiza melhor o código e as responsabilidades, portanto vocês encontrarão as classes e interfaces na seguinte estrutura:

* java\com\evertonogura\trabalhandocomdados: aqui estará o "main", onde a aplicação é iniciada por aqui.

Abaixo dessa estrutura, não está na mesma ordem de pastas, mas é proposital para facilitar o entendimento:

* entity: aqui temos a representação em classes das entidades do banco de dados, que é o coração da aplicação
* model: aqui temos a representação em classes dos atributos que iremos trabalhar na comunicação com a borda da nossa aplicação, note que não é a mesma coisa que as entidades que representam as tabelas
* exception: aqui temos as classes que tratam as exceções esperadas dentro da aplicação, baseadas em retornos de validações de regras de negócio
* repository: aqui temos as interfaces que fazem a ligação entre a representação das tabelas pelas entidades e o Hibernate que fará a comunicação com o banco de dados de fato
* jms: aqui temos as classes que funcionam como a implementação de fato de um produtor e consumidor de mensagens de fila, portanto é específico para interação com filas
* service: aqui temos a camada que faz as junções das chamadas para servir o projeto como um todo, então é nesta camada que transformamos uma requisição de API em algo passível de ser persistido em banco de dados e também em algo passível de ser enviado à uma fila, mas não é aqui que efetivamente a persistência e a produção na fila ocorrem, ela só orquestra isso
* controller: aqui temos a classe que funciona como implementação de fato da integração da aplicação com o mundo externo, neste caso via chamada de API. Há validação básica da requisição HTTP e somente, as regras de negócio não devem ficar nesta camada
* advice: aqui temos um handler que "monitora" o comportamento da aplicação em busca de excessões específicas, desta forma automagicamente conseguimos retornar erros customizados em formato de response HTTP sem precisar programar isso na controller ou nas demais classes. Para isso usamos da estrutura de exceptions do projeto

## Fluxo de informações

### De fora para dentro

Este projeto conta com 3 rotas para chamada de fora da aplicação, via HTTP em chamadas REST.

Uma vez que a aplicação esteja rodando, você poderá acessar uma página Swagger com todas essas rotas, por padrão o endereço é: http://localhost:8080/swagger-ui.html

* `GET /api/tiposComida`: este serviço permite consultar todos os tipos de comida diferentes que já estão pré-cadastrados no banco de dados
* `POST /api/comidas`: este serviço permite a inclusão de uma comida nova, basta indicar a descrição da comida em si, a quantidade desejada e o tipo de comida, o tipo de comida pode ser consultado pela rota `tiposComida`
* `GET /api/comidas`: este serviço permite consultar todas as comidas diferentes cadastradas, você deve cadastrar uma nova através do método `POST` pois no banco de dados de exemplo não há nenhuma previamente cadastrada
* `GET /api/comidas/{id}`: este serviço permite consultar uma comida específica, através do código de identificação. O código de identificação você obtém da lista de todas as comidas consultadas na rota `comidas`

### Persistência

O método `POST` da rota `comidas` é a única em que há uma lógica (implementada na DataServiceImpl.java) para persistir o dado no banco de dados.

No DataServiceImpl há algumas validações (para validar se o tipo de comida informado existe na tabela de domínio `Tipo_Comida`) antes de persistir a tabela `Comida`.

### De dentro para fora

Uma vez que a nova comida é persistida ao chamar `POST /api/comidas`, há um tratamento do dado para uso do `JmsModel` e então produção (envio) desta mensagem em uma fila interna.

A fila é um AtiveMQ Embedded, ou seja, é uma fila que sobe em memória junto com a aplicação para fins de demonstração de como esse mecanismo funciona.

Para fins de log do que está acontecendo com a fila, foi criado um consumidor (`Consumer.java`) que apenas lê a fila e efetua um print no console de logs da aplicação em execução.