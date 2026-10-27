# 📒 Agenda de Contatos

> *Desenvolvido como projeto prático no IFCE Campus Maranguape.*[cite: 12]

A **Agenda de Contatos** é um sistema de gerenciamento desenvolvido de forma **incremental**, onde cada versão evolui a estrutura anterior aplicando novos conceitos de Java e Programação Orientada a Objetos (POO).

O objetivo é acompanhar na prática a progressão do aprendizado — partindo de variáveis simples até a desacoplagem de código em classes dedicadas, persistência em arquivos, modelagem de objetos, encapsulamento e boas práticas de arquitetura.
O objetivo é acompanhar na prática a progressão do aprendizado — partindo de variáveis simples até a modelagem orientada a objetos, persistência em arquivos e encapsulamento.

---

## 🎯 Objetivo

Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estruturas de dados, modularização em pacotes, persistência de dados e aplicação dos pilares de Orientação a Objetos ao longo das etapas da disciplina.
Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estruturas de dados, modularização em pacotes, persistência de dados e aplicação dos pilares de Orientação a Objetos ao longo das etapas da disciplina de **Programação Orientada a Objetos (POO)**.[cite: 13]

---

@@ -24,10 +26,10 @@ Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estrut
| **v1.1.0** | Separação de Conceitos | Separação nas classes `Agenda`, `Uteis` e `Principal` |
| **v1.1.1** | Correção de Bugs (Patch) | Correção do fluxo de encerramento (opção Sair), buffers e ajustes finos |
| **v2.1.0** | Persistência em Arquivo TXT | Classe `Persistencia`, leitura e escrita em `contatos.txt` com `java.io` |
| **v3.0.0** | Classes e Objetos (POO) | Criação da entidade `Contato`, atributos e instanciação com `new` |
| **v3.1.0** | Coleção de Objetos | Armazenamento dinâmico de objetos utilizando `List<Contato>` |
| **v3.0.0** | Classes e Objetos (POO) | Criação da entidade `Contato`, atributos e instanciação com `new`[cite: 11] |
| **v3.1.0** | Coleção de Objetos | Armazenamento dinâmico de objetos utilizando `List<Contato>`[cite: 13] |
| **v3.2.0** | CRUD Orientado a Objetos | Refatoração do CRUD e da persistência para operar sobre `List<Contato>` |
| **v3.3.0** ✅ | Encapsulamento *(atual)* | Atributos `private`, construtor parametrizado (`this`), `getters` e `setters` |
| **v3.3.0** ✅ | Encapsulamento *(versão atual)* | Atributos `private`, construtor parametrizado (`this`), `getters` e `setters` |

---

@@ -66,14 +68,14 @@ Introdução da classe **`Persistencia`** utilizando o pacote `java.io` (`Buffer
- **Salvamento Automático:** Gravação dos contatos no formato `nome;celular;email` ao encerrar o sistema.

### 🔹 v3.0.0 — Introdução a Classes e Objetos (POO)
Início da transição da abordagem procedural para a **Programação Orientada a Objetos**:
- **Classe `Contato`:** Modelagem da entidade com os atributos `nome`, `celular` e `email`.
- **Instanciação:** Criação de objetos independentes com o operador `new` e manipulação de referências.
Início da transição da abordagem procedural para a **Programação Orientada a Objetos**[cite: 11]:
- **Classe `Contato`:** Modelagem da entidade com os atributos `nome`, `celular` e `email`[cite: 11].
- **Instanciação:** Criação de objetos independentes com o operador `new` e manipulação de referências[cite: 11].

### 🔹 v3.1.0 — Coleção de Objetos (`List<Contato>`)
Aplicação de Generics e coleções dinâmicas sobre a própria classe de domínio:
- Agrupamento de instâncias de `Contato` dentro de uma única lista `List<Contato>`.
- Percurso de objetos utilizando `for-each` e `for` indexado com `get()`.
Aplicação de Generics e coleções dinâmicas sobre a própria classe de domínio[cite: 13]:
- Agrupamento de instâncias de `Contato` dentro de uma única lista `List<Contato>`[cite: 13].
- Percurso de objetos utilizando `for-each` e `for` indexado com `get()`[cite: 13].

### 🔹 v3.2.0 — CRUD Orientado a Objetos
Substituição definitiva das três listas paralelas de `String` (`nomes`, `celulares`, `emails`) por uma única coleção **`List<Contato>`** em todo o projeto:
@@ -88,19 +90,27 @@ Refinamento da classe `Contato` aplicando o pilar de **Encapsulamento** para pro

---

## 🗂️ Estrutura do Projeto
## 🏗️ Estrutura Atual da Versão v3.3.0

A aplicação utiliza uma única coleção de objetos `List<Contato>` e organiza suas responsabilidades no pacote `br.edu.principal`:

```text
agenda_contatos/
├── v0.0.0/ ... v2.1.0/         # Evolução procedural, modularização e persistência TXT
├── v3.0.0/                     # Introdução à classe Contato e objetos
├── v3.1.0/                     # Testes e manipulação de List<Contato>
├── v3.2.0/                     # CRUD e Persistência orientados a objetos
├── v3.3.0/                     # Versão Atual: Encapsulamento (private, construtor, get/set)
│   └── src/br/edu/principal/
│       ├── Agenda.java
│       ├── Contato.java
│       ├── Persistencia.java
│       ├── Principal.java
│       └── Uteis.java
└── README.md
Principal
    │
    └── List<Contato>
            │
            ├── Contato (Atributos privados, Construtor, Getters e Setters)
            │
            ├── Agenda
            │     ├── adicionar()
            │     ├── listar()
            │     ├── pesquisar()
            │     ├── atualizar()
            │     └── excluir()
            │
            ├── Persistencia
            │     ├── carregarContatos()
            │     └── salvarContatos()
            │
            └── Uteis
                  └── Menus e métodos auxiliares
