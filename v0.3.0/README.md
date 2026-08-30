# 📇 Agenda de Contatos - Versão V.0.3.0

> Quarta etapa do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral
Esta versão acrescenta a funcionalidade de **Alterar Contato**, finalizando a implementação de todas as operações básicas de um **CRUD** (Create, Read, Update, Delete) em listas dinâmicas.

## 🛠️ Tecnologias e Conceitos Aplicados
* **Operação de Atualização (`set()`):** Substituição de elementos existentes em determinada posição do `ArrayList`.
* **Fluxo de Atualização:** Busca da posição (`índice`) do elemento, validação e aplicação das alterações mantendo as listas sincronizadas.
* **CRUD Completo:**
    * **C**reate: `add()`
    * **R**ead: `get()` e `size()`
    * **U**pdate: `set()`
    * **D**elete: `remove()`

## ⚠️ Limitações da Versão
* **Listas Paralelas:** As informações ainda dependem do sincronismo entre três coleções distintas.

---
*Desenvolvido como projeto prático no IFCE Campus Maranguape.*