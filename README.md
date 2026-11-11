# Agenda de Contatos

Aplicação desenvolvida em **Java** para gerenciamento de contatos, construída de forma incremental como parte das atividades da disciplina de **Programação Orientada a Objetos (POO)**.

O projeto acompanha a evolução dos conceitos de programação, desde a utilização de variáveis e estruturas de dados até a aplicação de princípios de orientação a objetos, organização em camadas, persistência e interfaces gráficas.

**Versão atual: V5.0.0 — Introdução ao Padrão MVC**

## Objetivo

Desenvolver uma aplicação que permita cadastrar, listar, pesquisar, atualizar e excluir contatos, aplicando progressivamente os conceitos estudados na disciplina.

## Funcionalidades

- Adicionar contatos.
- Listar contatos cadastrados.
- Pesquisar contatos.
- Atualizar informações.
- Excluir contatos.
- Salvar contatos em arquivo TXT.
- Recuperar contatos automaticamente ao iniciar a aplicação.
- Apresentar informações sobre o sistema.

Cada contato possui os seguintes atributos:

- Nome
- Celular
- E-mail

## Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Collections Framework (`List` e `ArrayList`)
- Manipulação de arquivos TXT
- Tratamento de exceções
- Padrão DAO (Data Access Object)
- Padrão MVC (Model-View-Controller)
- Git e GitHub

## Estrutura do projeto

```text
AgendaContatos/
├── src/
│   └── br/
│       └── edu/
│           ├── principal/
│           │   └── Principal.java
│           ├── modelo/
│           │   └── Contato.java
│           ├── visao/
│           │   └── AgendaView.java
│           ├── controle/
│           │   └── AgendaController.java
│           ├── dao/
│           │   └── ContatoDAO.java
│           └── uteis/
│               └── Uteis.java
├── contatos.txt
└── README.md
```

O arquivo `contatos.txt` é utilizado para armazenar os dados e será criado durante a gravação, caso ainda não exista.

## Organização das classes

| Classe | Responsabilidade |
|---|---|
| `Principal` | Inicializar os componentes e coordenar a execução da aplicação. |
| `Contato` | Representar os dados de um contato (Model). |
| `AgendaView` | Receber informações do usuário e apresentar os resultados (View). |
| `AgendaController` | Coordenar as operações do CRUD (Controller). |
| `ContatoDAO` | Realizar a leitura e gravação dos contatos em arquivo (DAO). |
| `Uteis` | Disponibilizar funcionalidades auxiliares da aplicação. |

## V5.0.0 — Introdução ao Padrão MVC

Nesta versão, introduzimos o padrão arquitetural **MVC (Model-View-Controller)**, aprimorando a organização da aplicação por meio da separação entre apresentação, controle e manipulação dos dados.

Na V4.1.0, utilizávamos o padrão DAO para separar a persistência dos dados das operações do CRUD. Entretanto, a classe `Agenda` ainda concentrava a interação com o usuário e a execução das operações.

Agora, distribuímos essas responsabilidades entre os componentes MVC, mantendo as funcionalidades existentes e a persistência em arquivos.

### Principais alterações

- Criação do pacote `br.edu.visao` e da classe `AgendaView`.
- Criação do pacote `br.edu.controle` e da classe `AgendaController`.
- Separação entre entrada de dados, processamento das operações e apresentação dos resultados.
- Adaptação das operações de inclusão, listagem, pesquisa, atualização e exclusão.
- Reutilização dos métodos de pesquisa nas operações de atualização e exclusão.
- Integração dos componentes MVC na classe `Principal`.
- Remoção da classe `Agenda` após a migração de suas funcionalidades.
- Manutenção da persistência em arquivos utilizando o padrão DAO.
- Preservação da interface textual executada no terminal.

### Organização MVC

O padrão MVC divide a aplicação em três componentes principais:

| Componente | Responsabilidade | Implementação |
|---|---|---|
| **Model** | Representar e gerenciar os dados. | `Contato` e acesso aos dados por `ContatoDAO`. |
| **View** | Receber informações e apresentar resultados. | `AgendaView` |
| **Controller** | Coordenar as operações solicitadas. | `AgendaController` |

O DAO permanece responsável pela persistência dos contatos, complementando a organização MVC.

### Exemplo de utilização

A classe `Principal` inicializa os componentes necessários para executar a aplicação:

```java
List<Contato> contatos = new ArrayList<>();

ContatoDAO dao = new ContatoDAO("contatos.txt");
dao.carregarContatos(contatos);

Scanner sc = new Scanner(System.in);

AgendaView view = new AgendaView(sc);
AgendaController controller =
        new AgendaController(contatos, dao);
```

A inclusão de contatos passa a utilizar a seguinte sequência:

```java
Contato contato = view.lerContato();

controller.adicionarContato(contato);

view.mostrarMensagem("Contato adicionado com sucesso!");
```

A View recebe as informações digitadas pelo usuário, enquanto o Controller realiza a inclusão do objeto na coleção.

Na listagem, o Controller disponibiliza os contatos e a View apresenta os resultados:

```java
List<Contato> lista = controller.listarContatos();

view.mostrarContatos(lista);
```

Dessa forma, a lógica de apresentação permanece separada das operações sobre os dados.

### Persistência dos dados

A persistência continua sendo realizada pela classe `ContatoDAO`, utilizando o arquivo `contatos.txt` e o caractere `;` como separador.

Exemplo:

```text
Maria;85999999999;maria@email.com
João;85988888888;joao@email.com
```

Ao iniciar a aplicação, os contatos são carregados do arquivo para a coleção em memória.

Ao selecionar a opção de saída, o Controller solicita ao DAO a gravação dos dados:

```java
boolean salvou = controller.salvarContatos();
```

Caso ocorra um erro durante a gravação, a aplicação apresenta uma mensagem e permanece em execução.

## Histórico de versões

| Versão | Descrição |
|---|---|
| **V0.0.0** | Introdução às variáveis e cadastro de um contato. |
| **V0.1.0** | Utilização de arrays para armazenar contatos. |
| **V0.2.0** | Introdução a `List` e `ArrayList`. |
| **V0.3.0** | Implementação das operações do CRUD. |
| **V1.0.0** | Modularização das funcionalidades em métodos. |
| **V1.1.0** | Organização dos métodos em classes. |
| **V1.1.1** | Correção do funcionamento da opção de saída. |
| **V2.0.0** | Introdução à manipulação de arquivos. |
| **V2.1.0** | Persistência dos contatos em arquivo TXT. |
| **V3.0.0** | Introdução aos conceitos de classe e objeto. |
| **V3.1.0** | Utilização de `ArrayList<Contato>`. |
| **V3.2.0** | CRUD utilizando objetos. |
| **V3.3.0** | Encapsulamento e aprimoramento da classe `Contato`. |
| **V4.0.0** | Introdução ao padrão DAO e organização em pacotes. |
| **V4.1.0** | DAO orientado a objetos, com construtor e métodos de instância. |
| **V5.0.0** | Introdução ao padrão MVC e separação entre Model, View e Controller. |

## Conceitos trabalhados na V5.0.0

- Padrão arquitetural MVC.
- Separação de responsabilidades.
- Organização da aplicação em camadas.
- Classes e objetos.
- Encapsulamento.
- Construtores.
- Injeção de dependências por construtor.
- Compartilhamento de referências.
- Retorno de objetos e coleções.
- Reutilização de métodos.
- Refatoração de código.
- Integração entre MVC e DAO.
- Persistência de objetos em arquivos.

## Execução

Para executar o projeto:

1. Instalar o Java JDK.
2. Abrir o projeto em uma IDE Java, como o Eclipse.
3. Localizar a classe `Principal`, no pacote `br.edu.principal`.
4. Executar o método `main()`.
5. Utilizar o menu apresentado no terminal.

Os contatos serão carregados automaticamente quando o arquivo de dados estiver disponível.

## Próxima versão

**V5.1.0 — MVC Completo**

Na próxima versão, vamos aprimorar a implementação do padrão MVC, reduzindo as responsabilidades ainda concentradas na classe `Principal` e transferindo as interações restantes da classe `Uteis` para a View.

O objetivo será consolidar a separação entre os componentes, simplificando a inicialização da aplicação e preparando sua arquitetura para futuras interfaces gráficas.