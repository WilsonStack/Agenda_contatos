# 🗂️ Agenda de Contatos - Versão V1.1.1

> Sétima etapa (Versão de Correção de Bugs e Ajustes de Interface) do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral

Esta versão **V1.1.1** é uma atualização focada em **correção de bugs (bugfix)** e melhorias na experiência de uso. O objetivo principal foi corrigir o problema no fluxo de encerramento do programa, além de adicionar a funcionalidade de informações sobre o sistema através de uma interface gráfica simples (`JOptionPane`).

---

## 🔄 O que Mudou na Versão V1.1.1?

* 🐛 **Correção do Bug na Opção de Sair (`sair()`):**
  * Na versão anterior, a opção 6 exibia uma mensagem informando que a opção não estava disponível e retornava `true`, mantendo o usuário preso no loop do programa.
  * Agora, o método `sair()` na classe `Uteis` exibe a mensagem `"Saindo da Agenda de Contatos..."` e retorna `false`, encerrando o loop `while` corretamente e finalizando a aplicação.
* ℹ️ **Nova Opção "Sobre" (Opção 7):**
  * Adicionado a opção **7 - Informações Sobre a Agenda de Contatos** no menu principal.
  * Implementado o método `sobre()` na classe `Uteis`, que utiliza a biblioteca `javax.swing.JOptionPane` para exibir uma caixa de diálogo gráfica com a informação de autoria do sistema.
* 🛠️ **Ajustes nos Métodos da Classe `Agenda`:**
  * Os métodos da classe `Agenda` foram definidos de forma estática (`public static`), recebendo as listas (`nomes`, `celulares`, `emails`) e o `Scanner` diretamente por parâmetro.
  * Atualização da mensagem do cabeçalho inicial para **v1.1.1**.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Linguagem Java SE:** Organização do código dividida entre as classes `Principal`, `Agenda` e `Uteis` no pacote `br.edu.principal`.
* **Interface Gráfica Swing (`JOptionPane`):** Uso do método `showMessageDialog()` para exibição de mensagens popup em janela gráfica.
* **Controle de Fluxo e Loops:** Controle de encerramento do loop principal `while (continuar)` através do retorno booleano do método `Uteis.sair()`.
* **Estrutura de Dados:** Manipulação de listas dinâmicas (`List<String>`) repassadas por parâmetro aos métodos utilitários do CRUD.

---

## 📋 Funcionalidades do Menu

1. **Adicionar Contato:** Cadastra nome, celular e e-mail.
2. **Listar Contatos:** Exibe todos os contatos da agenda.
3. **Procurar Contato:** Busca contato pelo nome.
4. **Alterar Contato:** Atualiza os dados de um contato existente.
5. **Excluir Contato:** Remove o contato da agenda.
6. **Sair:** Encerra a aplicação corretamente (bug corrigido nesta versão).
7. **Informações Sobre a Agenda de Contatos:** Exibe uma janela popup gráfica com informações sobre o projeto e autoria.

---

## 📁 Estrutura do Projeto

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Agenda.java     # Métodos do CRUD (adicionar, listar, pesquisar, atualizar, excluir)
            ├── Principal.java  # Classe principal com o método main e controle de fluxo
            └── Uteis.java      # Utilitários de tela, tratamento de saída e exibição do popup "Sobre"
```

---

## 🔧 Como Executar

1. **Compilar todas as classes:**
   ```bash
   javac br/edu/principal/*.java
   ```

2. **Executar a aplicação:**
   ```bash
   java br.edu.principal.Principal
   ```

---

_Desenvolvido como projeto prático no IFCE Campus Maranguape._