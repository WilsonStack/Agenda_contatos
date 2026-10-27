# 📒 Agenda de Contatos

Projeto didático desenvolvido em **Java** para acompanhar a evolução dos conceitos trabalhados na disciplina de Programação Orientada a Objetos (POO).

O sistema é desenvolvido de forma incremental. Cada versão introduz novos conceitos, estruturas e melhorias sobre a versão anterior.

---

## 🎯 Objetivo

Construir uma Agenda de Contatos completa, iniciando com uma solução procedural simples e evoluindo gradualmente para uma aplicação organizada com conceitos de Programação Orientada a Objetos, interface gráfica e persistência de dados.

---

## 📈 Evolução do Projeto

| Versão | Armazenamento / Recursos | Descrição |
| :---: | :--- | :--- |
| **v0.0.0** | Variáveis simples | Permite armazenar apenas um contato em memória |
| **v0.1.0** | Arrays | Permite vários contatos com capacidade fixa |
| **v0.2.0** | `List` + `ArrayList` | Permite vários contatos com tamanho dinâmico |
| **v0.3.0** | `List` + `ArrayList` | Adiciona a opção de alteração de contatos cadastrados |
| **v1.0.0** | `List` + `ArrayList` | Modularização das funcionalidades em métodos na classe principal |
| **v1.1.0** | `List` + `ArrayList` | Separação das responsabilidades e métodos em arquivos/classes utilitárias |
| **v1.1.1** | `List` + `ArrayList` | Correção de bug no fluxo de encerramento do sistema (opção Sair) |
| **v2.1.0** | Arquivo TXT (I/O Java) | Persistência de dados em arquivo texto utilizando `java.io` |
| **v3.0.0** | Classes e Objetos | Introdução à Programação Orientada a Objetos com a criação da classe `Contato` |
| **v3.1.0** | Coleção de Objetos | Armazenamento de objetos `Contato` utilizando `List<Contato>` |
| **v3.2.0** | CRUD Orientado a Objetos | Adaptação das operações CRUD e da persistência para utilizar `List<Contato>` |
| **v3.3.0** | Encapsulamento | Encapsulamento e melhoria da modelagem da classe `Contato` |

---

## 📚 Histórico de Versões

### v0.0.0 — Versão Inicial
Primeira versão da Agenda de Contatos. Nesta versão, os dados de um contato são armazenados utilizando variáveis simples.
- Entrada e saída de dados com `Scanner`;
- Estruturas condicionais e de repetição;
- Menu de opções e armazenamento de apenas um contato em memória.

### v0.1.0 — Arrays
Evolução da Agenda de Contatos para permitir o armazenamento de vários contatos.
- Introdução a arrays com capacidade fixa;
- Utilização de índices e percurso dos dados utilizando estruturas de repetição.

### v0.2.0 — List e ArrayList
Substituição dos arrays por coleções dinâmicas.
- Introdução à interface `List`, classe `ArrayList` e Generics (`List<String>`);
- Operações dinâmicas com `add()`, `get()` e `remove()`.

### v0.3.0 — Alteração de Contatos
Inclusão da funcionalidade de alteração dos dados de um contato já cadastrado.
- Pesquisa de contatos e identificação de posição;
- Alteração de elementos utilizando `set()` e ampliação do CRUD.

### v1.0.0 — Modularização
Reorganização do código da Agenda de Contatos por meio da criação de métodos.
- Criação de métodos com passagem de parâmetros;
- Redução da quantidade de código no método `main`.

### v1.1.0 — Separação em Classes
Evolução da modularização com a distribuição das funcionalidades em diferentes arquivos e classes.
- Criação das classes `Agenda` e `Uteis`;
- Redução das responsabilidades da classe `Principal`.

### v1.1.1 — Correção do Fluxo de Saída
Versão de correção da Agenda de Contatos.
- Correção do comportamento da opção Sair e ajuste do fluxo de encerramento.

### v2.1.0 — Persistência em Arquivo TXT
Introdução da persistência dos dados utilizando arquivos (`contatos.txt`) no formato `nome;celular;email`.
- Criação da classe `Persistencia` utilizando o pacote `java.io`;
- Carregamento dos contatos ao iniciar e salvamento ao encerrar a aplicação.

### v3.0.0 — Introdução a Classes e Objetos
Início da transição da abordagem procedural para a **Programação Orientada a Objetos (POO)**.
- Identificação e modelagem da entidade `Contato` (`nome`, `celular` e `email`);
- Instanciação de objetos utilizando o operador `new` e manipulação de referências.

### v3.1.0 — Coleção de Objetos
Evolução da representação dos contatos utilizando uma coleção de objetos do tipo `Contato`.
- Criação de uma coleção `List<Contato>`;
- Armazenamento com `add()`, recuperação com `get()` e percurso utilizando `for-each`.

### v3.2.0 — CRUD Orientado a Objetos
Substituição das três listas paralelas de `String` por uma única coleção `List<Contato>` em todo o sistema.
- Adaptação das operações de adicionar, listar, pesquisar, alterar e excluir contatos na classe `Agenda`;
- Adaptação da classe `Persistencia` para reconstruir e salvar objetos `Contato`.

### v3.3.0 — Encapsulamento e Modelagem da Classe
Evolução da classe `Contato` para proteger seu estado interno e controlar o acesso aos seus atributos.
- Atributos privados (`private String nome, celular, email`);
- Criação de construtor parametrizado utilizando a palavra-chave `this`;
- Acesso e modificação controlados por meio de métodos `getters` e `setters`.

---

## 🏗️ Estrutura Atual (v3.3.0)

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
