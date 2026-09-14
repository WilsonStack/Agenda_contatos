![# 📇 Agenda de Contatos - Versão v1.0.0

> Quinta etapa do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral
Esta versão finaliza a refatoração do sistema por meio da **modularização total do código em métodos estáticos**, organizando a aplicação e aprimorando o controle do fluxo de execução.

## 🛠️ Tecnologias e Conceitos Aplicados
* **Modularização Completa:** Organização de todas as operações do sistema (`adicionar`, `listar`, `pesquisar`, `atualizar`, `excluir`, `mostraMenu` e `sair`) em métodos dedicados.
* **Controle de Fluxo por Retorno Booleano:** Correção do encerramento do laço `while`, utilizando o retorno `boolean` do método `sair()` para atualizar a variável de controle no `main`.
* **Tratamento de Entrada do Scanner:** Leitura das opções do menu ajustada com `Integer.parseInt(sc.nextLine())` para evitar quebras de linha pendentes (*buffer*) durante a leitura dos dados.
* **Consolidação do CRUD:** Interface orquestrada pelo método `main`, delegando cada responsabilidade a seu respectivo procedimento.

## ⚠️ Limitações da Versão
* **Listas Paralelas:** As informações dos contatos ainda dependem do sincronismo entre três coleções dinâmicas distintas (`nomes`, `celulares` e `emails`).

---
*Desenvolvido como projeto prático no IFCE Campus Maranguape.*](image.png)