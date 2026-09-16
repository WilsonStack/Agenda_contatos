<div align="center">

# 📒 Agenda de Contatos

**Projeto didático desenvolvido em Java**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)
![Versão](https://img.shields.io/badge/Versão-v1.1.1-blue?style=for-the-badge)

*Disciplina de **Programação Orientada a Objetos (POO)** — Técnico Integrado em Informática*
*IFCE — Campus Maranguape*

</div>

---

## 📌 Sobre o Projeto

A **Agenda de Contatos** é um sistema de gerenciamento desenvolvido de forma **incremental**, onde cada versão evolui a estrutura anterior aplicando novos conceitos de Java e POO.

O objetivo é acompanhar na prática a progressão do aprendizado — partindo de variáveis simples até a arquitetura orientada a objetos com classes bem definidas e código estabilizado.

---

## 🎯 Objetivo

Desenvolver uma Agenda de Contatos em Java, acompanhando a evolução das estruturas de dados, modularização em pacotes e manutenção de código (correção de bugs) ao longo das etapas da disciplina.

---

## ⚙️ Funcionalidades

| # | Funcionalidade |
|---|----------------|
| ➕ | Adicionar contato |
| 📋 | Listar contatos |
| 🔎 | Procurar contato |
| ✏️ | Alterar contato |
| 🗑️ | Excluir contato |
| 🚪 | Sair do sistema |

---

## 📈 Evolução do Projeto

| Versão | Armazenamento / Arquitetura | Principais Conceitos |
|--------|-----------------------------|----------------------|
| **v0.0.0** | Variáveis simples | `String`, `Scanner`, `if-else`, `switch`, `while` |
| **v0.1.0** | Arrays | Vetores, índices, `for`, capacidade fixa |
| **v0.2.0** | `List` + `ArrayList` | Coleções dinâmicas, `add()`, `get()`, `remove()`, `size()` |
| **v0.3.0** | `List` + `ArrayList` | Alteração com `set()` e CRUD completo |
| **v1.0.0** | Modularização procedural | Métodos estáticos em classe única, pacote `br.edu.principal` |
| **v1.1.0** | Orientação a Objetos (POO) | Separação nas classes `Agenda`, `Uteis` e `Principal` |
| **v1.1.1** ✅ | Correção de Bugs (Patch) | Correção de tratamento de exceções, buffer do Scanner e ajustes finos |

---

### 🔹 v0.0.0 — Estrutura Base
Primeira versão do projeto. Utiliza variáveis simples para armazenar **apenas um contato por vez**, com menu interativo via `switch-case`.

### 🔹 v0.1.0 — Arrays
Substituição das variáveis por **arrays**, permitindo armazenar múltiplos contatos com capacidade fixa de até 5 registros.

### 🔹 v0.2.0 — Coleções Dinâmicas
Substituição dos arrays por **`List` e `ArrayList`**, eliminando o limite de registros e simplificando as operações de inserção e remoção.

### 🔹 v0.3.0 — CRUD Completo
Adição da funcionalidade de **alterar contatos** com o método `set()`, completando as quatro operações básicas do sistema (Create, Read, Update, Delete).

### 🔹 v1.0.0 — Modularização Procedural
Isolamento das operações em métodos estáticos dentro da classe `Principal`.

### 🔹 v1.1.0 — Orientação a Objetos (POO)
Transição para o paradigma orientado a objetos com a divisão do sistema nas classes `Agenda`, `Uteis` e `Principal`.

### 🔹 v1.1.1 — Correção de Bugs *(versão atual)*
Versão de manutenção (patch) focada exclusivamente em estabilidade:
* **Correção de Buffers:** Ajuste na leitura do `Scanner` para evitar falhas ao ler strings após inteiros.
* **Tratamento de Exceções:** Prevenção de erros ao tentar acessar ou excluir índices inexistentes na lista.
* **Ajustes de Exibição:** Correção de falhas de formatação no menu interativo e mensagens no console.

---

## 📂 Estrutura do Repositório

```text
Agenda_contatos/
├── .gitignore
├── README.md
├── v0.0.0/
├── v0.1.0/
├── v0.2.0/
├── v0.3.0/
├── v1.0.0/
├── v1.1.0/
└── v1.1.1/
    ├── README.md
    └── src/
        └── br/
            └── edu/
                └── principal/
                    ├── Agenda.java
                    ├── Principal.java
                    └── Uteis.java
