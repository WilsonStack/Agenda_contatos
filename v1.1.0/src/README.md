# 🗂️ Agenda de Contatos - Versão V1.1.0

> Sexta etapa (Refatoração Arquitetural e Orientação a Objetos) do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral

Esta versão marca a transição da arquitetura procedural para os **conceitos fundamentais da Programação Orientada a Objetos (POO)**. O código foi totalmente refatorado e dividido em **múltiplas classes com responsabilidades bem definidas** (Separação de Conceitos / *Separation of Concerns*).

Diferente das versões anteriores em que toda a lógica e os dados residiam estaticamente na classe `Principal`, a versão **V1.1.0** encapsula o estado e as operações do sistema na classe `Agenda` e isola os métodos de interface/utilitários na classe `Uteis`.

---

## 🔄 O que Mudou na Versão V1.1.0?

* 🏗️ **Divisão de Responsabilidades em Classes:**
  * **`Agenda.java`:** Agora é responsável por gerenciar a regra de negócio e os dados dos contatos (`nomes`, `celulares`, `emails`). As operações do CRUD deixaram de ser estáticas e passaram a ser métodos de instância.
  * **`Uteis.java`:** Classe dedicada exclusivamente a funções utilitárias da interface de usuário em console (`mostraInicializacao()`, `mostraMenu()`, `selecionaOpcao()`, `sair()`).
  * **`Principal.java`:** Teve seu tamanho drasticamente reduzido, atuando apenas como ponto de entrada (`main`), instanciando o objeto `Agenda` e controlando o fluxo do menu.
* 📦 **Encapsulamento de Atributos:**
  * Os atributos de dados (`nomes`, `celulares`, `emails`) na classe `Agenda` passaram a ser **privados** (`private`), impedindo o acesso direto e não autorizado por outras partes do código.
* 🧼 **Passagem de Parâmetros Simplificada:**
  * Não é mais necessário passar as três listas (`nomes`, `celulares`, `emails`) como parâmetros em cada chamada de método, pois os métodos da classe `Agenda` acessam diretamente seus próprios atributos de instância.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Orientação a Objetos (POO):**
  * **Instanciação de Objetos:** Uso do operador `new` para criar o objeto `Agenda` na classe `Principal`.
  * **Encapsulamento:** Uso do modificador de acesso `private` para proteger as coleções de dados na classe `Agenda`.
  * **Métodos de Instância vs. Métodos Estáticos:** Separação entre comportamento de objeto (`Agenda`) e funções utilitárias auxiliares (`Uteis`).
* **Estrutura Multiclasse:** Organização modular do código distribuído em três arquivos Java dentro do pacote `br.edu.principal`.
* **Fluxo de Leitura Aprimorado:** Correção no consumo do caractere de quebra de linha (`sc.nextLine()`) após a leitura numérica no método `selecionaOpcao()`.

---

## 📁 Estrutura do Projeto

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Agenda.java     # Gerenciamento de dados e regras do CRUD
            ├── Principal.java  # Ponto de entrada (main) e loop de execução
            └── Uteis.java      # Utilitários de interface e exibição de menu
```

---

## ⚠️ Limitações da Versão

* **Estrutura Interna de Listas Paralelas:** Embora os dados estejam encapsulados na classe `Agenda`, eles ainda utilizam três listas separadas (`List<String>`) para representar cada contato, em vez de um objeto `Contato` dedicado.
* **Armazenamento Volátil:** Os dados continuam sendo mantidos exclusivamente em memória RAM.

---

## 🔧 Como Executar

1. **Compilar todas as classes do pacote:**
   ```bash
   javac br/edu/principal/*.java
   ```

2. **Executar a aplicação a partir do ponto de entrada:**
   ```bash
   java br.edu.principal.Principal
   ```

---

_Desenvolvido como projeto prático no IFCE Campus Maranguape._