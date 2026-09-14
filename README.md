# 🗂️ Agenda de Contatos - Versão V1.0.0

> Quinta etapa (Versão Final Refatorada / Versão 1.0.0) do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral

Esta versão representa a **consolidação da versão 1.0.0** da **Agenda de Contatos**, integrando todas as operações do ciclo **CRUD** (*Create, Read, Update, Delete*) de forma funcional e com uma estrutura modularizada em métodos estáticos. 

O projeto simula um sistema completo de gerenciamento de contatos via linha de comando (CLI), permitindo a inclusão, listagem, busca por nome, alteração de dados e exclusão de registros em memória.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Linguagem Java:** Estruturação básica de código em Java SE (`package br.edu.principal`).
* **Coleções Dinâmicas (`ArrayList`):** Manipulação de listas da API de coleções do Java para armazenar dinamicamente nomes, celulares e e-mails.
* **Leitura de Dados (`Scanner`):** Leitura via *Stream* padrão de entrada com tratamento simples de fluxo.
* **Operações do CRUD Completo:**
  * 🆕 **Create (`add()`):** Adição de novos registros ao final de cada lista paralela.
  * 📖 **Read (`get()`, `size()`, `equalsIgnoreCase()`):** Leitura de elementos, percurso por laços (`for`) e busca insensível a maiúsculas/minúsculas.
  * 🔄 **Update (`set()`):** Localização do índice correspondente e substituição dos elementos.
  * ❌ **Delete (`remove()`):** Remoção física do registro mantendo o alinhamento de índices.
* **Modularização de Código:** Divisão das responsabilidades do sistema em métodos estáticos (`mostraMenu()`, `adicionar()`, `listar()`, `pesquisar()`, `atualizar()`, `excluir()`, `sair()`).

---

## 📋 Funcionalidades do Menu

1. **Adicionar Contato:** Solicita nome, celular e e-mail e os adiciona ao sistema.
2. **Listar Contatos:** Percorre e exibe a lista completa de contatos cadastrados ou uma mensagem caso a agenda esteja vazia.
3. **Procurar Contato:** Realiza busca por nome exato (ignorando diferenças de maiúsculas/minúsculas) e exibe os detalhes.
4. **Alterar Contato:** Localiza o registro informado e atualiza os três campos (nome, celular, e-mail).
5. **Excluir Contato:** Remove o contato informado e ajusta o tamanho das listas.
6. **Sair:** Encerra a execução do loop principal da aplicação.

---

## ⚠️ Limitações da Versão

* **Listas Paralelas:** As informações ainda dependem do sincronismo manual entre três coleções distintas (`nomes`, `celulares`, `emails`).
* **Armazenamento Volátil:** Os dados são salvos apenas em memória RAM e são perdidos ao encerrar a execução do programa.
* **Ausência de Orientação a Objetos Plena:** O modelo ainda não utiliza uma classe `Contato` com atributos e métodos encapsulados, padrão que será adotado em refatorações futuras.

---

## 🔧 Como Executar

1. **Compilar o arquivo:**
   ```bash
   javac br/edu/principal/Principal.java
   ```

2. **Executar a aplicação:**
   ```bash
   java br.edu.principal.Principal
   ```

---

*Desenvolvido como projeto prático no IFCE Campus Maranguape.*