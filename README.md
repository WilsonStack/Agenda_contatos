# 📒 Agenda de Contatos

> *Desenvolvido como projeto prático no IFCE Campus Maranguape.*[cite: 12]

A **Agenda de Contatos** é um sistema de gerenciamento desenvolvido de forma **incremental**, onde cada versão evolui a estrutura anterior aplicando novos conceitos de Java e Programação Orientada a Objetos (POO).

O objetivo é acompanhar na prática a progressão do aprendizado — partindo de variáveis simples até a modelagem orientada a objetos, persistência em arquivos e encapsulamento.

---

## 🎯 Objetivo

Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estruturas de dados, modularização em pacotes, persistência de dados e aplicação dos pilares de Orientação a Objetos ao longo das etapas da disciplina de **Programação Orientada a Objetos (POO)**.[cite: 13]

---

## 📊 Evolução das Versões

| Versão | Abordagem / Armazenamento | Principais Conceitos Aplicados |
|---|---|---|
| **v0.0.0** | Variáveis simples | Entrada/saída com `Scanner`, `if/else`, `while`, 1 contato em memória |
| **v0.1.0** | Arrays | Vetores, índices, `for`, capacidade fixa |
| **v0.2.0** | `List` + `ArrayList` | Coleções dinâmicas, `add()`, `get()`, `remove()`, `size()` |
| **v0.3.0** | `List` + `ArrayList` | Alteração com `set()` e CRUD completo |
| **v1.0.0** | Modularização procedural | Métodos estáticos dedicados em classe única, pacote `br.edu.principal` |
| **v1.1.0** | Separação de Conceitos | Separação nas classes `Agenda`, `Uteis` e `Principal` |
| **v1.1.1** | Correção de Bugs (Patch) | Correção do fluxo de encerramento (opção Sair), buffers e ajustes finos |
| **v2.1.0** | Persistência em Arquivo TXT | Classe `Persistencia`, leitura e escrita em `contatos.txt` com `java.io` |
| **v3.0.0** | Classes e Objetos (POO) | Criação da entidade `Contato`, atributos e instanciação com `new`[cite: 11] |
| **v3.1.0** | Coleção de Objetos | Armazenamento dinâmico de objetos utilizando `List<Contato>`[cite: 13] |
| **v3.2.0** | CRUD Orientado a Objetos | Refatoração do CRUD e da persistência para operar sobre `List<Contato>` |
| **v3.3.0** ✅ | Encapsulamento *(versão atual)* | Atributos `private`, construtor parametrizado (`this`), `getters` e `setters` |

---

## 📚 Histórico Detalhado de Versões

### 🔹 v0.0.0 — Versão Inicial (Variáveis Simples)
Primeira versão do sistema utilizando apenas variáveis simples em memória, permitindo cadastrar e visualizar um único contato por execução.

### 🔹 v0.1.0 — Estruturas de Dados com Arrays
Evolução para permitir múltiplos contatos através de vetores (`String[]`) de tamanho fixo, manipulados por índices em laços de repetição.

### 🔹 v0.2.0 — Coleções Dinâmicas (`List` e `ArrayList`)
Substituição dos arrays por **`List` e `ArrayList`**, eliminando o limite fixo de registros e introduzindo os métodos `add()`, `get()` e `remove()`.

### 🔹 v0.3.0 — Alteração de Contatos (CRUD Completo)
Adição da funcionalidade de **alterar contatos** com o método `set()`, completando as quatro operações básicas do sistema (Create, Read, Update, Delete).

### 🔹 v1.0.0 — Modularização Procedural
Isolamento das operações em métodos estáticos dentro da classe `Principal`, reduzindo a complexidade do método `main` e organizando o código no pacote `br.edu.principal`.

### 🔹 v1.1.0 — Separação de Responsabilidades em Classes
Divisão do sistema em três classes com responsabilidades bem definidas:
- **`Agenda`**: Concentra as operações e regras do CRUD.
- **`Uteis`**: Métodos estáticos utilitários de exibição de menus e leitura de opções.
- **`Principal`**: Ponto de entrada da aplicação e controle do loop principal.

### 🔹 v1.1.1 — Correção de Bugs e Fluxo de Saída
Versão de manutenção (patch) focada em estabilidade:
- **Fluxo de Encerramento:** Correção do comportamento da opção Sair no loop principal.
- **Correção de Buffers:** Ajuste na leitura do `Scanner` para evitar falhas ao ler strings após inteiros.
- **Ajustes de Exibição:** Melhoria nas mensagens de feedback no console.

### 🔹 v2.1.0 — Persistência de Dados em Arquivo TXT
Introdução da classe **`Persistencia`** utilizando o pacote `java.io` (`BufferedReader`, `BufferedWriter`, `File`):
- **Carregamento Automático:** Leitura do arquivo `contatos.txt` ao iniciar a aplicação.
- **Salvamento Automático:** Gravação dos contatos no formato `nome;celular;email` ao encerrar o sistema.

### 🔹 v3.0.0 — Introdução a Classes e Objetos (POO)
Início da transição da abordagem procedural para a **Programação Orientada a Objetos**[cite: 11]:
- **Classe `Contato`:** Modelagem da entidade com os atributos `nome`, `celular` e `email`[cite: 11].
- **Instanciação:** Criação de objetos independentes com o operador `new` e manipulação de referências[cite: 11].

### 🔹 v3.1.0 — Coleção de Objetos (`List<Contato>`)
Aplicação de Generics e coleções dinâmicas sobre a própria classe de domínio[cite: 13]:
- Agrupamento de instâncias de `Contato` dentro de uma única lista `List<Contato>`[cite: 13].
- Percurso de objetos utilizando `for-each` e `for` indexado com `get()`[cite: 13].

### 🔹 v3.2.0 — CRUD Orientado a Objetos
Substituição definitiva das três listas paralelas de `String` (`nomes`, `celulares`, `emails`) por uma única coleção **`List<Contato>`** em todo o projeto:
- **`Agenda`:** Todas as operações (adicionar, listar, pesquisar, atualizar e excluir) passam a manipular objetos `Contato`.
- **`Persistencia`:** Leitura e escrita adaptadas para reconstruir e salvar objetos `Contato` no arquivo `contatos.txt`.

### 🔹 v3.3.0 — Encapsulamento e Modelagem da Classe *(versão atual)*
Refinamento da classe `Contato` aplicando o pilar de **Encapsulamento** para proteger o estado interno dos objetos:
- **Proteção de Atributos:** Alteração dos atributos `nome`, `celular` e `email` para o modificador `private`.
- **Construtor Parametrizado:** Inicialização direta do objeto no momento da criação (`new Contato(nome, celular, email)`) com uso da palavra-chave `this`.
- **Getters e Setters:** Leitura e alteração controladas dos dados em todas as operações das classes `Agenda` e `Persistencia`.

---

## 🏗️ Estrutura Atual da Versão v3.3.0

A aplicação utiliza uma única coleção de objetos `List<Contato>` e organiza suas responsabilidades no pacote `br.edu.principal`:

```text
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
