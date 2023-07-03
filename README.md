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

![Print 1 da instalação do Eclipse](/../main/Imagens/Eclipse-print1.png)

![Print 2 da instalação do Eclipse](/../main/Imagens/Eclipse-print2.png)

![Print 3 da instalação do Eclipse](/../main/Imagens/Eclipse-print3.png)

![Print 4 da instalação do Eclipse](/../main/Imagens/Eclipse-print4.png)

![Print 5 da instalação do Eclipse](/../main/Imagens/Eclipse-print5.png)

![Print 6 da instalação do Eclipse](/../main/Imagens/Eclipse-print6.png)

![Print 7 da instalação do Eclipse](/../main/Imagens/Eclipse-print7.png)

![Print 8 da instalação do Eclipse](/../main/Imagens/Eclipse-print8.png)

### Instalação do SQLiteStudio

Você pode seguir o passo-a-passo para instalar o SQ Lite Studio (referência: 03/jul/2023):

![Print 1 da instalação do SQ Lite Studio](/../main/Imagens/SQLiteStudio-print1.png)

![Print 2 da instalação do SQ Lite Studio](/../main/Imagens/SQLiteStudio-print2.png)

![Print 3 da instalação do SQ Lite Studio](/../main/Imagens/SQLiteStudio-print3.png)

![Print 4 da instalação do SQ Lite Studio](/../main/Imagens/SQLiteStudio-print4.png)

### Instalação do Git

Você pode seguir o passo-a-passo para instalar o Git (referência: 03/jul/2023):

![Print 1 da instalação do Git](/../main/Imagens/Git-print1.png)

![Print 2 da instalação do Git](/../main/Imagens/Git-print2.png)

![Print 3 da instalação do Git](/../main/Imagens/Git-print3.png)

![Print 4 da instalação do Git](/../main/Imagens/Git-print4.png)

![Print 5 da instalação do Git](/../main/Imagens/Git-print5.png)

![Print 6 da instalação do Git](/../main/Imagens/Git-print6.png)

![Print 7 da instalação do Git](/../main/Imagens/Git-print7.png)

### Instalação do Draw.io

Você pode seguir o passo-a-passo para instalar o Draw.io (referência: 03/jul/2023):

![Print 1 da instalação do Draw.io](/../main/Imagens/Drawio-print1.png)

![Print 2 da instalação do Draw.io](/../main/Imagens/Drawio-print2.png)

![Print 3 da instalação do Draw.io](/../main/Imagens/Drawio-print3.png)

![Print 4 da instalação do Draw.io](/../main/Imagens/Drawio-print4.png)

![Print 5 da instalação do Draw.io](/../main/Imagens/Drawio-print5.png)

![Print 6 da instalação do Draw.io](/../main/Imagens/Drawio-print6.png)

## Fazendo o download do repositório

Este repositório tem o desenho da solução, o arquivo com o modelo de banco de dados pronto e o código-fonte em Java.

Para baixar o repositório há duas maneiras de se fazer:

### Opção 1 - se você baixou o Git e instalou

![Print 1 do clone do repositório com o link .git](/../main/Imagens/Clone-Git-print1.png)

![Print 2 do clone do repositório com o link .git](/../main/Imagens/Clone-Git-print2.png)

![Print 3 do clone do repositório com o link .git](/../main/Imagens/Clone-Git-print3.png)

![Print 4 do clone do repositório com o link .git](/../main/Imagens/Clone-Git-print4.png)

![Print 5 do clone do repositório com o link .git](/../main/Imagens/Clone-Git-print5.png)

### Opção 2 - se você não tem o Git instalado

![Print 1 do clone do repositório via download direto](/../main/Imagens/Clone-Sem-Git-print1.png)

![Print 2 do clone do repositório via download direto](/../main/Imagens/Clone-Sem-Git-print2.png)

### Após download, o repositório ficará assim em seu computador

![Print 1 do repositório baixado em seu computador](/../main/Imagens/Clone-print1.png)

![Print 2 do repositório baixado em seu computador](/../main/Imagens/Clone-print2.png)

## Olhando o desenho de solução

Basta abrir o arquivo Diagrama.drawio na raiz da pasta deste repositório e abrir!

Para abrir o arquivo Diagrama.drawio, há duas maneiras de se fazer:

### Opção 1 - se você baixou e instalou o Draw.io

![Print 1 do arquivo Diagrama.drawio aberto na aplicação em seu computador](/../main/Imagens/Drawio-app-print1.png)

![Print 2 do arquivo Diagrama.drawio aberto na aplicação em seu computador](/../main/Imagens/Drawio-app-print2.png)

### Opção 2 - se você não tem o Draw.io instalado

![Print 1 do arquivo Diagrama.drawio aberto no web browser em seu computador](/../main/Imagens/Drawio-web-print1.png)

![Print 2 do arquivo Diagrama.drawio aberto no web browser em seu computador](/../main/Imagens/Drawio-web-print2.png)

![Print 3 do arquivo Diagrama.drawio aberto no web browser em seu computador](/../main/Imagens/Drawio-web-print3.png)

![Print 4 do arquivo Diagrama.drawio aberto no web browser em seu computador](/../main/Imagens/Drawio-web-print4.png)

![Print 5 do arquivo Diagrama.drawio aberto no web browser em seu computador](/../main/Imagens/Drawio-web-print5.png)

## Olhando o modelo de dados

Aqui você terá que utilizar o SQ Lite Studio tanto para ver o modelo do arquivo MeuDb.db quanto para alterá-lo.

### Passos para uso do MeuDb

O arquivo MeuDb.db estará na pasta "Banco de Dados" neste repositório.

Se possível copie este arquivo para a pasta C:\Temp (se for Windows) pois no código em Java eu deixei parametrizado para procurar o arquivo em C:\Temp\MeuDb.db. Você pode mudar isso, mas terá que lembrar de alterar no Java onde estará o arquivo.

Partindo da premissa que você seguiu a instrução anterior, abra o SQ Lite que você instalou e siga o passo-a-passo dos print's à seguir para poder abrir o arquivo MeuDb.db:

![Print 1 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print1.png)

![Print 2 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print2.png)

![Print 3 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print3.png)

![Print 4 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print4.png)

![Print 5 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print5.png)

![Print 6 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print6.png)

![Print 7 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print7.png)

![Print 8 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print8.png)

![Print 9 das instruções de como abrir o arquivo com o modelo de dados com o SQLiteStudio](/../main/Imagens/SQLiteStudio-MeuDb-print9.png)

## Olhando o código-fonte

Aqui você terá que utilizar o Eclipse para ver o código-fonte.

Observação: tem outra ferramenta para desenvolvimento em Java? Sem problemas! Mas aqui eu vou mostrar o passo-a-passo apenas para o Eclipse, pois foi o que eu utilizei:

![Print 1 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print1.png)

![Print 2 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print2.png)

![Print 3 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print3.png)

![Print 4 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print4.png)

![Print 5 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print5.png)

![Print 6 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print6.png)

![Print 7 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print7.png)

![Print 8 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print8.png)

![Print 9 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print9.png)

![Print 10 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print10.png)

![Print 11 das instruções de como abrir o projeto em Java Maven no Eclipse](/../main/Imagens/Eclipse-Java-print11.png)