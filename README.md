# trabalhando-com-dados

Veremos um exemplo de como trabalhar com dados de formas diferentes:

* Chamada via API e validações de request
* Consulta e persistência em banco de dados
* Escrita e leitura de mensageria

## Pré-requisitos

* Eclipse -> Esta é a ferramenta de desenvolvimento que utilizei para o código em Java, se você quiser alterar o código e debugar sozinho, terá que fazer o download. [Faça o download clicando neste link](https://www.eclipse.org/downloads/packages/installer)
* SQLiteStudio -> Esta é a ferramenta de desenvolvimento que utilizei para criar as tabelas e manipular o arquivo de dados utilizado junto ao código fonte, se você quiser alterar alguma coisa no modelo e fazer as consultas, terá que fazer o download. [Faça o download clicando neste link](https://sqlitestudio.pl/)
* Git (opcional) -> Podemos utilizar essa ferramenta para baixar o repositório, mas não é necessário pois podemos fazer o download de outra maneira também. [Faça o download clicando neste link](https://git-scm.com/downloads)
* Draw.io (opcional) -> Podemos utilizar essa ferramenta para ver o desenho de solução, mas não é necessário pois podemos ver direto no site [Faça o download clicando neste link](https://www.drawio.com/)

### Instalação do Eclipse

Você pode seguir o passo-a-passo para instalar o Eclipse (referência: 03/jul/2023):

![Print 1 da instalação do Eclipse](/imagens/Eclipse-print1.png)

![Print 2 da instalação do Eclipse](/imagens/Eclipse-print2.png)

![Print 3 da instalação do Eclipse](/imagens/Eclipse-print3.png)

![Print 4 da instalação do Eclipse](/imagens/Eclipse-print4.png)

![Print 5 da instalação do Eclipse](/imagens/Eclipse-print5.png)

![Print 6 da instalação do Eclipse](/imagens/Eclipse-print6.png)

![Print 7 da instalação do Eclipse](/imagens/Eclipse-print7.png)

![Print 8 da instalação do Eclipse](/imagens/Eclipse-print8.png)

### Instalação do SQLiteStudio

Você pode seguir o passo-a-passo para instalar o SQ Lite Studio (referência: 03/jul/2023):

![Print 1 da instalação do SQ Lite Studio](/imagens/SQLiteStudio-print1.png)

![Print 2 da instalação do SQ Lite Studio](/imagens/SQLiteStudio-print2.png)

![Print 3 da instalação do SQ Lite Studio](/imagens/SQLiteStudio-print3.png)

![Print 4 da instalação do SQ Lite Studio](/imagens/SQLiteStudio-print4.png)

### Instalação do Git

Você pode seguir o passo-a-passo para instalar o Git (referência: 03/jul/2023):

![Print 1 da instalação do Git](/imagens/Git-print1.png)

![Print 2 da instalação do Git](/imagens/Git-print2.png)

![Print 3 da instalação do Git](/imagens/Git-print3.png)

![Print 4 da instalação do Git](/imagens/Git-print4.png)

![Print 5 da instalação do Git](/imagens/Git-print5.png)

![Print 6 da instalação do Git](/imagens/Git-print6.png)

![Print 7 da instalação do Git](/imagens/Git-print7.png)

### Instalação do Draw.io

Você pode seguir o passo-a-passo para instalar o Draw.io (referência: 03/jul/2023):

![Print 1 da instalação do Draw.io](/imagens/Drawio-print1.png)

![Print 2 da instalação do Draw.io](/imagens/Drawio-print2.png)

![Print 3 da instalação do Draw.io](/imagens/Drawio-print3.png)

![Print 4 da instalação do Draw.io](/imagens/Drawio-print4.png)

![Print 5 da instalação do Draw.io](/imagens/Drawio-print5.png)

![Print 6 da instalação do Draw.io](/imagens/Drawio-print6.png)

## Fazendo o download do repositório

Este repositório tem o desenho da solução, o arquivo com o modelo de banco de dados pronto e o código-fonte em Java.

Para baixar o repositório há duas maneiras de se fazer:

### Opção 1 - se você baixou o Git e instalou


### Opção 2 - se você não tem o Git instalado

## Olhando o desenho de solução

Basta abrir o arquivo Diagrama.drawio na raiz da pasta deste repositório e abrir!

Para abrir o arquivo Diagrama.drawio, há duas maneiras de se fazer:

### Opção 1 - se você baixou e instalou o Draw.io

### Opção 2 - se você não tem o Draw.io instalado

## Olhando o modelo de dados

Aqui você terá que utilizar o SQ Lite Studio tanto para ver o modelo do arquivo MeuDb quanto para alterá-lo.

### Passos para uso do MeuDb

O arquivo MeuDb estará na pasta Database neste repositório.

Se possível copie este arquivo para a pasta C:\Temp (se for Windows) pois no código em Java eu deixei parametrizado para procurar o arquivo em C:\Temp\MeuDb. Você pode mudar isso, mas terá que lembrar de alterar no Java onde estará o arquivo.

Partindo da premissa que você seguiu a instrução anterior, abra o SQ Lite que você instalou e siga o passo-a-passo dos print's à seguir para poder abrir o arquivo MeuDb:

## Olhando o código-fonte

Aqui você terá que utilizar o Eclipse para ver o código-fonte.

Observação: tem outra ferramenta para desenvolvimento em Java? Sem problemas! Mas aqui eu vou mostrar o passo-a-passo apenas para o Eclipse, pois foi o que eu utilizei:

