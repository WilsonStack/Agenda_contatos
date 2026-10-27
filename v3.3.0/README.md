# 🗂️ Agenda de Contatos - Versão V3.3.0

> Décima segunda etapa (Encapsulamento) do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral

Esta versão introduz o **encapsulamento** na classe `Contato`. Os atributos deixam de ser públicos e passam a ser acessados apenas por meio de **construtores**, **getters** e **setters**.

Diferente da versão V3.2.0, em que as demais classes liam e alteravam `contato.nome`, `contato.celular` e `contato.email` diretamente pelo operador ponto, a **V3.3.0** obriga todas as classes a usarem os métodos da própria `Contato` para acessar seus dados.

---

## 🔄 O que Mudou na Versão V3.3.0?

* 🔒 **Encapsulamento em `Contato.java`:**
  * Os atributos `nome`, `celular` e `email` passaram a ser **privados** (`private`).
  * A classe ganhou um construtor padrão (sem parâmetros) e um construtor com os três atributos, que usa `this` para diferenciar atributo e parâmetro.
  * Foram criados os métodos `get` e `set` de cada atributo.
* 📋 **`Agenda.java`:**
  * Ao adicionar, o contato é criado direto com `new Contato(nome, celular, email)`.
  * Listar, pesquisar, alterar e excluir leem os dados pelos getters (`getNome()`, `getCelular()`, `getEmail()`), e a alteração é feita pelos setters.
  * Foi removida uma variável sem uso no método `excluir`.
* 💾 **`Persistencia.java`:**
  * Ao gravar, monta cada linha do arquivo com os getters.
  * Ao carregar, cria cada contato com `new Contato(dados[0], dados[1], dados[2])`, em vez de preencher os atributos um a um.
* 🔁 **`Principal.java`:**
  * O laço do menu passou a ser `while (true)`, sem a variável `continuar`.
  * A opção Sair salva os contatos, exibe a mensagem de saída, fecha o `Scanner` e encerra o programa com `return`.
* 🖥️ **`Uteis.java`:**
  * Versão exibida atualizada para v3.3.0.
  * O método `sair()` passou a ser `void`, já que o controle de encerramento agora fica no `Principal`.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Orientação a Objetos (POO):**
  * **Encapsulamento:** uso do modificador de acesso `private` para ocultar os dados de `Contato`.
  * **Getters e Setters:** métodos públicos que controlam a leitura e a alteração dos atributos.
  * **Construtores:** construtor padrão e construtor com parâmetros (sobrecarga de construtores).
  * **Palavra-chave `this`:** diferencia o atributo do objeto do parâmetro de mesmo nome.
* **Acesso por Métodos:** substituição do operador ponto (`.`) por chamadas de métodos para acessar os dados do objeto.
* **Controle de Fluxo:** laço `while (true)` com encerramento do programa por `return`.
* **Coleções e Persistência:** `List<Contato>` e arquivo `contatos.txt` continuam como base do sistema.

---

## 📁 Estrutura do Projeto

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Agenda.java        # Operações do CRUD usando construtor, getters e setters
            ├── Contato.java       # Entidade encapsulada: atributos private, construtores, getters e setters
            ├── Persistencia.java  # Leitura e gravação do arquivo contatos.txt
            ├── Principal.java     # Ponto de entrada (main) e loop do menu
            └── Uteis.java         # Utilitários de interface e exibição de menu
```

---

## ⚠️ Limitações da Versão

* **Encapsulamento sem validação:** os setters e o construtor aceitam qualquer valor, inclusive texto vazio ou `null`. A classe protege o acesso, mas não garante dados válidos.
* **Classes apenas com métodos estáticos:** `Agenda`, `Persistencia` e `Uteis` não são instanciadas. A lista de contatos fica no `main` e é repassada por parâmetro.
* **Contato sem e-mail é perdido:** se o e-mail ficar em branco, a linha gravada termina em `;` e, ao carregar, é tratada como registro inválido. O contato some do arquivo no próximo salvamento. O mesmo ocorre se algum campo contiver `;`.
* **Salvamento apenas ao sair:** os dados só são gravados pela opção 6. Se o programa fechar de outra forma, as alterações da sessão se perdem.
* **Entrada não numérica no menu:** digitar uma letra causa `InputMismatchException` e encerra o programa sem salvar.
* **Busca por nome completo e exato:** não há busca parcial. Com nomes repetidos, alterar e excluir atuam apenas no último contato encontrado.
* **Interface gráfica na opção 7:** o uso de `JOptionPane` exige ambiente com interface gráfica.

---

## 🔧 Como Executar

Requer **JDK 14 ou superior**.

1. **Compilar todas as classes do pacote (a partir da pasta `src`):**
   ```bash
   javac br/edu/principal/*.java
   ```

2. **Executar a aplicação a partir do ponto de entrada:**
   ```bash
   java br.edu.principal.Principal
   ```

> O arquivo `contatos.txt` é criado e lido na pasta de onde o programa é executado.

---

_Desenvolvido como projeto prático no IFCE Campus Maranguape._