# 📒 Agenda de Contatos

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Versão atual](https://img.shields.io/badge/vers%C3%A3o-v5.1.0-success)
![Interface](https://img.shields.io/badge/interface-console-lightgrey)
![IFCE](https://img.shields.io/badge/IFCE-Campus%20Maranguape-2e7d32)

> Projeto prático desenvolvido no **IFCE – Campus Maranguape**, na disciplina de Programação Orientada a Objetos (POO).

Sistema de gerenciamento de contatos em Java construído de forma **incremental**: cada versão parte da anterior e acrescenta conceitos novos, evoluindo de variáveis simples até ao encapsulamento e, na sua versão atual, culminando na implementação do **Padrão de Arquitetura MVC (Model-View-Controller)** com persistência de dados (DAO).

Toda a evolução do código-fonte está registrada no histórico de versões, organizando a estrutura em múltiplos pacotes lógicos (`modelo`, `dao`, `controle`, `visao`, `principal`).

---

## ✨ Funcionalidades (v5.1.0)

| Funcionalidade | O que faz | Onde fica o fluxo |
|---|---|---|
| ➕ Adicionar | Cadastra um contato com nome, celular e e-mail | `AgendaView` → `AgendaController` |
| 📋 Listar | Mostra todos os contatos cadastrados | `AgendaView` → `AgendaController` |
| 🔍 Buscar | Pesquisa contatos pelo nome | `AgendaView` → `AgendaController` |
| 🗑️ Remover | Exclui um contato específico | `AgendaView` → `AgendaController` |
| 💾 Persistência | Carrega e salva automaticamente em `contatos.txt` | `ContatoDAO.carregarContatos()` e `salvarContatos()` |

---

## 📊 Evolução das Versões (Histórico de Atualizações)

| Versão | Abordagem | Principais conceitos |
|---|---|---|
| **v0.0.0** | Variáveis simples | `Scanner`, `if/else`, `while`, 1 contato em memória |
| **v0.1.0** | Arrays | Vetores, índices, `for`, capacidade fixa |
| **v0.2.0** | `List` + `ArrayList` | Coleções dinâmicas: `add()`, `get()`, `remove()`, `size()` |
| **v0.3.0** | `List` + `ArrayList` | `set()` e CRUD completo |
| **v1.0.0** | Modularização procedural | Métodos estáticos |
| **v1.1.0** | Separação de responsabilidades | Classes isoladas |
| **v2.1.0** | Persistência em arquivo TXT | Manipulação de arquivos (`java.io`), `contatos.txt` |
| **v3.0.0** | Classes e objetos | Entidade `Contato`, atributos, `new` |
| **v3.3.0** | Encapsulamento | `private`, construtores, `this`, getters e setters |
| **v4.1.0** | Organização em Pacotes | Múltiplos pacotes (`dao`, `modelo`, `servico`, `uteis`) |
| **v5.0.0** | Arquitetura MVC | Divisão em `Model`, `View` e `Controller` |
| **v5.1.0** ✅ | **Refatoração da View** *(atual)* | Remoção da classe `Uteis`, integração nativa do `Scanner` na `AgendaView`. |

<details>
<summary><strong>📚 Ver histórico detalhado das últimas versões</strong></summary>

<br>

**v4.1.0 — Organização em Pacotes.** A estrutura de pastas deixou de ser um pacote único `principal` e foi dividida em `dao`, `modelo`, `servico`, `uteis` e `principal`.

**v5.0.0 — Arquitetura MVC.** A classe `Agenda` (serviço) foi removida para adotar o padrão MVC. Foram criados os pacotes `controle` (contendo o `AgendaController`) para gerir as regras de negócio e `visao` (contendo a `AgendaView`) para interagir com o usuário, isolando totalmente o sistema visual da lógica dos dados.

**v5.1.0 — Refatoração da View.** O pacote e a classe `Uteis` foram removidos do projeto. As funções de leitura (`Scanner`) passaram a ser responsabilidade direta e exclusiva da `AgendaView`, simplificando as dependências.
</details>

---

## 🏗️ Estrutura do Projeto (v5.1.0 - MVC)

### Arquivos e Pacotes

```text
Agenda_contatos/
├── .gitignore
├── README.md
└── src/
    └── br/
        └── edu/
            ├── controle/
            │   └── AgendaController.java
            ├── dao/
            │   └── ContatoDAO.java
            ├── modelo/
            │   └── Contato.java
            ├── principal/
            │   └── Principal.java
            └── visao/
                └── AgendaView.java
