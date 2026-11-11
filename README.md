# Agenda de Contatos

Aplicação desenvolvida em **Java** para gerenciamento de contatos, construída de forma incremental como parte das atividades da disciplina de **Programação Orientada a Objetos (POO)**.

O projeto acompanha a evolução dos conceitos de programação, desde a utilização de variáveis e estruturas de dados até a aplicação de princípios de orientação a objetos, organização em camadas, persistência e interfaces gráficas.

**Versão atual: V5.1.0 — MVC Completo**

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
│           └── dao/
│               └── ContatoDAO.java
├── contatos.txt
└── README.md
```

O arquivo `contatos.txt` é utilizado para armazenar os dados e será criado durante a gravação, caso ainda não exista.

## Organização das classes

| Classe | Responsabilidade |
|---|---|
| `Principal` | Inicializar e conectar os componentes da aplicação. |
| `Contato` | Representar os dados de um contato (Model). |
| `AgendaView` | Controlar o menu, receber informações e apresentar resultados (View). |
| `AgendaController` | Executar as operações do CRUD e coordenar a persistência (Controller). |
| `ContatoDAO` | Realizar a leitura e gravação dos contatos em arquivo (DAO). |

## V5.1.0 — MVC Completo

Nesta versão, aprimoramos a implementação do padrão arquitetural **MVC (Model-View-Controller)**, introduzido na V5.0.0.

Anteriormente, a classe `Principal` ainda controlava o menu e coordenava as chamadas entre a View e o Controller.

Agora, centralizamos a interação com o usuário na classe `AgendaView`, mantendo o `AgendaController` responsável pelas operações do CRUD e o `ContatoDAO` pela persistência dos dados.

Essa reorganização reduz as responsabilidades da classe `Principal` e aprimora a separação entre os componentes da aplicação.

### Principais alterações

- Transferência do controle do menu para `AgendaView`.
- Integração entre View e Controller por meio do construtor.
- Criação de métodos para executar as operações do CRUD na View.
- Centralização da entrada de dados e apresentação de mensagens.
- Transferência das funcionalidades de apresentação da classe `Uteis` para `AgendaView`.
- Simplificação da classe `Principal`.
- Refinamento dos métodos do Controller.
- Reutilização do método de pesquisa nas operações de atualização e exclusão.
- Remoção de métodos e classes que deixaram de ser utilizados.
- Manutenção da persistência em arquivos TXT utilizando DAO.
- Validação das operações e da separação de responsabilidades.

### Organização MVC

O padrão MVC divide a aplicação em três componentes principais:

| Componente | Responsabilidade | Implementação |
|---|---|---|
| **Model** | Representar os dados da aplicação. | `Contato` |
| **View** | Receber informações, controlar o menu e apresentar resultados. | `AgendaView` |
| **Controller** | Executar as operações sobre os contatos. | `AgendaController` |

A classe `ContatoDAO` complementa essa organização, sendo responsável pela persistência dos dados.

### Exemplo de utilização

A classe `Principal` é responsável por inicializar e conectar os componentes da aplicação.

```java
List<Contato> contatos = new ArrayList<>();

ContatoDAO dao = new ContatoDAO("contatos.txt");
dao.carregarContatos(contatos);

AgendaController controller =
        new AgendaController(contatos, dao);

Scanner sc = new Scanner(System.in);

AgendaView view = new AgendaView(sc, controller);

view.iniciar();

sc.close();
```

Observe que a classe `Principal` não precisa mais controlar o menu ou executar diretamente as operações do CRUD.

A View recebe uma referência ao Controller por meio do construtor:

```java
public AgendaView(Scanner sc, AgendaController controller) {

    this.sc = sc;
    this.controller = controller;
}
```

Essa associação permite que a View encaminhe as solicitações do usuário ao Controller.

### Execução das operações

Na V5.1.0, a classe `AgendaView` possui métodos responsáveis por organizar a interação necessária para cada operação.

Exemplo de inclusão:

```java
public void executarInclusao() {

    Contato contato = lerContato();

    controller.adicionarContato(contato);

    mostrarMensagem("Contato adicionado com sucesso!");
}
```

A View recebe os dados, solicita a inclusão ao Controller e apresenta o resultado ao usuário.

O Controller permanece responsável por modificar a coleção de contatos.

### Controle do menu

O controle do menu também passa a ser responsabilidade da classe `AgendaView`.

```java
public void iniciar() {

    mostrarInicializacao();

    int opcao;

    do {

        mostrarMenu();

        opcao = selecionarOpcao();

        switch (opcao) {

            case 1 -> executarInclusao();

            case 2 -> executarListagem();

            case 3 -> executarPesquisa();

            case 4 -> executarAtualizacao();

            case 5 -> executarExclusao();

            case 6 -> {
                if (executarSaida()) {
                    return;
                }
            }

            case 7 -> mostrarSobre();

            default -> mostrarMensagem("Opção inválida!");
        }

    } while (true);
}
```

Dessa forma, a classe `Principal` apenas inicia a aplicação por meio de `view.iniciar()`.

### Persistência dos dados

A persistência continua sendo realizada pela classe `ContatoDAO`, utilizando o arquivo `contatos.txt` e o caractere `;` como separador.

Exemplo:

```text
Maria;85999999999;maria@email.com
João;85988888888;joao@email.com
```

Ao iniciar a aplicação, os contatos são carregados do arquivo para a coleção em memória.

Ao selecionar a opção de saída, a View solicita ao Controller a gravação dos dados:

```java
boolean salvou = controller.salvarContatos();
```

O Controller encaminha a operação ao DAO:

```java
public boolean salvarContatos() {

    return dao.salvarContatos(contatos);
}
```

Caso ocorra um erro durante a gravação, a aplicação apresenta uma mensagem e permanece em execução.

Assim, mantemos a separação entre interação com o usuário, operações do CRUD e persistência.

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
| **V5.1.0** | Consolidação do MVC, centralização das interações na View e simplificação da classe Principal. |

## Conceitos trabalhados na V5.1.0

- Padrão arquitetural MVC.
- Separação de responsabilidades.
- Princípio da responsabilidade única.
- Baixo acoplamento.
- Associação entre objetos.
- Injeção de dependências por construtor.
- Encapsulamento.
- Compartilhamento de referências.
- Reutilização de métodos.
- Refatoração de código.
- Organização da aplicação em camadas.
- Integração entre MVC e DAO.
- Persistência de objetos em arquivos.
- Tratamento de exceções.
- Testes de regressão.
- Validação arquitetural.

## Execução

Para executar o projeto:

1. Instalar o Java JDK.
2. Abrir o projeto em uma IDE Java, como o Eclipse.
3. Localizar a classe `Principal`, no pacote `br.edu.principal`.
4. Executar o método `main()`.
5. Utilizar o menu apresentado no terminal.

Os contatos serão carregados automaticamente quando o arquivo de dados estiver disponível.

## Próxima versão

**V6.0.0 — JDBC + MySQL**

Na próxima versão, vamos substituir a persistência em arquivos TXT por um banco de dados relacional **MySQL**, utilizando **JDBC (Java Database Connectivity)**.

Vamos adaptar a classe `ContatoDAO` para realizar operações de leitura e gravação por meio de comandos SQL, preservando a organização MVC construída nas versões anteriores.

Essa evolução permitirá demonstrar uma das principais vantagens da separação de responsabilidades: modificar a tecnologia de persistência sem precisar reescrever a interface ou a lógica de interação com o usuário.