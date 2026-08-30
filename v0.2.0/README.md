# 📇 Agenda de Contatos - Versão V.0.2.0

> Terceira etapa do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral
Esta versão substitui os arrays de capacidade fixa por **coleções dinâmicas** (`List` e `ArrayList`), permitindo armazenar uma quantidade ilimitada de contatos sem a necessidade de predefinir tamanho.

## 🛠️ Tecnologias e Conceitos Aplicados
* **Coleções Java:** Uso de `List<String>` e `ArrayList<>` para manipulação dinâmica de dados.
* **Inserção Dinâmica:** Substituição do índice manual por `nomes.add()`.
* **Acesso e Tamanho:** Uso de `nomes.get(i)` para leitura de elementos e `nomes.size()` para obter o tamanho real da coleção.
* **Remoção Automática:** Uso de `nomes.remove(i)`, eliminando a necessidade de deslocamento manual de elementos (*shift*).
* **Simplificação de Código:** Remoção do contador manual (`quantidade`/`cont`) e do teste de agenda cheia.

## ⚠️ Limitações da Versão
* **Listas Paralelas:** Dados como nome, celular e e-mail continuam armazenados em listas separadas conectadas apenas pelo mesmo índice.

---
*Desenvolvido como projeto prático no IFCE Campus Maranguape.*