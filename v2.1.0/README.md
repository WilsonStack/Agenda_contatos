# 📒 Agenda de Contatos em Java

Um sistema de gestão de contactos desenvolvido em **Java**, focado na aplicação prática dos conceitos de Programação Orientada a Objetos (POO), manipulação de dados e persistência de informações. 

O projeto está organizado em diferentes versões (da `v0.0.0` até à `v2.1.0`), demonstrando a evolução gradual da arquitetura e das funcionalidades do código ao longo do desenvolvimento.

---

## 🚀 Funcionalidades

* **Adicionar Contactos:** Registo de novos contactos na agenda.
* **Listar Contactos:** Visualização organizada de todos os contactos guardados.
* **Pesquisar / Filtrar:** Procura rápida de contactos existentes.
* **Remover Contactos:** Exclusão de registos com validação caso o contacto não seja encontrado.
* **Persistência de Dados:** Gravação e leitura dos contactos (implementada a partir das versões mais recentes através da classe `Persistencia`) para que os dados não se percam ao fechar o programa.

---

## 🗂️ Estrutura do Projeto (Versão Atual - v2.1.0)

O código-fonte principal encontra-se estruturado no pacote `br.edu.principal`:

```text
agenda_contatos/
├── v0.0.0/ ... v1.1.1/       # Versões anteriores de evolução do projeto
├── v2.1.0/                   # Versão mais recente e completa
│   └── src/
│       └── br/edu/principal/
│           ├── Principal.java    # Ponto de entrada (main) e menu interativo
│           ├── Agenda.java       # Regras de negócio e manipulação da lista de contactos
│           ├── Persistencia.java # Gestão de armazenamento e leitura de dados
│           └── Uteis.java        # Métodos auxiliares, formatações e validações
└── README.md