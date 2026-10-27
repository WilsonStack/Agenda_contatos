# 📒 Agenda de Contatos em Java

Projeto didático desenvolvido em **Java** para acompanhar a evolução dos conceitos trabalhados na disciplina de Programação Orientada a Objetos (POO). O sistema é construído de forma incremental, onde cada versão introduz novos conceitos, estruturas arquiteturais e melhorias sobre a anterior.

---

## 🎯 Objetivo

Construir uma Agenda de Contatos completa, iniciando com soluções procedurais simples e evoluindo gradualmente para uma aplicação organizada com os paradigmas da Programação Orientada a Objetos, persistência de dados em ficheiros e manipulação avançada de coleções.

---

## 📈 Evolução e Histórico de Versões

| Versão | Armazenamento / Recursos | Descrição Principal |
| :---: | :--- | :--- |
| **v0.0.0** | Variáveis simples | Permite armazenar apenas um contato em memória. |
| **v0.1.0** | Arrays | Permite vários contatos com capacidade fixa. |
| **v0.2.0** | `List` + `ArrayList` | Introdução a listas dinâmicas com Generics (`List<String>`). |
| **v0.3.0** | `List` + `ArrayList` | Adiciona a opção de alteração de contatos cadastrados (CRUD). |
| **v1.0.0** | Modularização | Separação das funcionalidades em métodos na classe principal. |
| **v1.1.0** | Separação em Classes | Criação das classes `Agenda` e `Uteis` para organizar o código. |
| **v1.1.1** | Correção de Fluxo | Ajuste no fluxo de encerramento do sistema (opção Sair). |
| **v2.1.0** | Arquivo TXT (`java.io`) | Persistência de dados em arquivo texto utilizando `BufferedReader` e `BufferedWriter`. |
| **v3.0.0** | Classes e Objetos | Transição para POO com a criação e instanciação da entidade `Contato`[cite: 11]. |
| **v3.1.0** | Coleção de Objetos | Armazenamento e manipulação de múltiplos objetos utilizando `List<Contato>`. |
| **v3.2.0** | CRUD Orientado a Objetos | Adaptação das operações do CRUD para operar diretamente com objetos `Contato`. |
| **v3.3.0** | Encapsulamento | Proteção de dados com atributos `private`, métodos `getters`, `setters` e construtores. |

---

## 🗂️ Estrutura do Repositório

O projeto está organizado em pastas separadas por versões, permitindo visualizar o progresso de cada etapa:

```text
agenda_contatos/
├── v0.0.0/ ... v2.1.0/         # Versões procedurais e de persistência básica
├── v3.0.0/                     # Introdução a Classes e Objetos[cite: 11]
│   └── src/br/edu/principal/
│       ├── Agenda.java
│       ├── Contato.java        [NOVO] Classe que modela a entidade Contato[cite: 11]
│       ├── Persistencia.java
│       ├── Principal.java      [ATUALIZADO] Testes de instanciação de objetos[cite: 11]
│       └── Uteis.java
├── v3.1.0/                     # Coleção de Objetos List<Contato>[cite: 13]
│   └── src/br/edu/principal/
│       ├── Agenda.java
│       ├── Contato.java
│       ├── Persistencia.java
│       ├── Principal.java      [ATUALIZADO] Listas de objetos e laços for/for-each[cite: 13]
│       └── Uteis.java
├── .gitignore
└── README.md