# 📇 Agenda de Contatos - Versão V.0.1.0

> Segunda etapa do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral
Esta versão evolui a estrutura da aplicação permitindo o armazenamento de múltiplos contatos por meio de **arrays (vetores)** de tamanho fixo com capacidade para até 5 registros[cite: 1].

## 🛠️ Tecnologias e Conceitos Aplicados
* **Arrays Unidimensionais:** Uso de `String[]` para gerenciar listas de nomes, celulares e e-mails vinculados pelo mesmo índice[cite: 1].
* **Controle de Posição:** Utilização de um contador (`quantidade`) para indicar a quantidade de cadastros e o próximo índice livre[cite: 1].
* **Laço `for`:** Percorrimento de vetores para listagem, busca por nome e reorganização de elementos[cite: 1].
* **Algoritmo de Exclusão:** Deslocamento de elementos à esquerda (*shift*) para eliminar "buracos" no array após remoções[cite: 1].
* **Tratamento de Limite:** Verificação de capacidade máxima para evitar exceção de estouro de array (`ArrayIndexOutOfBoundsException`)[cite: 1].

## ⚠️ Limitações da Versão
* **Tamanho Fixo:** O número máximo de contatos precisa ser predefinido na inicialização do sistema[cite: 1].

---
*Desenvolvido como projeto prático no IFCE Campus Maranguape.*
