# 🗂️ Agenda de Contatos - Versão V3.2.0

> Décima primeira etapa (CRUD Orientado a Objetos) do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral

Esta versão conclui a migração do CRUD para a **Programação Orientada a Objetos**: as operações da agenda e a persistência em arquivo passam a trabalhar diretamente com objetos `Contato`, armazenados em uma única `List<Contato>`.

Diferente da versão V3.1.0, em que a `List<Contato>` aparecia apenas no código de teste do `main` e a agenda real continuava usando três listas de `String` (`nomes`, `celulares`, `emails`), a **V3.2.0** usa a lista de objetos em todo o fluxo da aplicação.

---

## 🔄 O que Mudou na Versão V3.2.0?

* 🧱 **Dados reunidos em objetos:**
  * A `List<Contato>` substitui as três listas paralelas. Cada contato é um objeto `Contato` com `nome`, `celular` e `email`.
  * Os métodos do CRUD deixam de receber três listas e passam a receber apenas `List<Contato>`.
* 📋 **`Agenda.java`:**
  * Ao adicionar, cria um objeto com `new Contato()`, preenche seus atributos e o insere na lista.
  * Listar, pesquisar, alterar e excluir percorrem a lista de objetos com `for-each`. A exclusão usa `contatos.remove(objeto)`.
  * A listagem exibe cada contato em bloco (nome, celular e e-mail em linhas separadas) e cada operação mostra um cabeçalho `=== ... ===`.
* 💾 **`Persistencia.java`:**
  * `salvarContatos` e `carregarContatos` passam a receber `List<Contato>`. A gravação usa `PrintWriter` com `FileWriter`.
  * Ao carregar, cada linha válida vira um objeto `Contato`. Linhas inválidas geram o aviso "Registro inválido ignorado".
  * Ao salvar, é exibida a mensagem "Contatos salvos com sucesso!".
* 🧹 **`Principal.java`:**
  * O código de teste (contatos de exemplo criados e impressos ao iniciar) foi removido. O `main` cria uma única `List<Contato>`, carrega o arquivo e repassa a lista às operações do menu.
* 🖥️ **`Uteis.java`:**
  * Versão exibida atualizada para v3.2.0, textos do menu revisados e pergunta "Escolha uma opção" movida para `selecionaOpcao()`.
  * A janela "Sobre" passa a exibir os créditos do desenvolvedor.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Coleções de Objetos:**
  * **`List<Contato>` e `ArrayList`:** uma única estrutura no lugar das listas paralelas.
  * **Passagem de coleção como parâmetro** e percurso com `for-each`.
  * **Busca e remoção de objetos:** comparação do nome com `equalsIgnoreCase` e `remove(objeto)`.
* **Orientação a Objetos (POO):**
  * **Instanciação de Objetos:** uso de `new Contato()` dentro das operações do CRUD.
  * **Objeto como unidade de dados:** nome, celular e e-mail agrupados em um único objeto.
* **Persistência em Arquivo Texto:** arquivo `contatos.txt` com uma linha por contato, no formato `nome;celular;email`, usando `PrintWriter` e `BufferedReader`.
* **Estrutura Multiclasse:** cinco arquivos Java no pacote `br.edu.principal`.

---

## 📁 Estrutura do Projeto

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Agenda.java        # Operações do CRUD sobre List<Contato>
            ├── Contato.java       # Entidade Contato (atributos públicos)
            ├── Persistencia.java  # Leitura e gravação do arquivo contatos.txt
            ├── Principal.java     # Ponto de entrada (main) e loop do menu
            └── Uteis.java         # Utilitários de interface e exibição de menu
```

---

## ⚠️ Limitações da Versão

* **Sem encapsulamento:** os atributos de `Contato` são públicos e acessados diretamente pelo operador ponto (tema da próxima versão).
* **Contato sem e-mail é perdido:** se o e-mail ficar em branco, a linha gravada termina em `;` e, ao carregar, é tratada como registro inválido. O contato some do arquivo no próximo salvamento. O mesmo ocorre se algum campo contiver `;`.
* **Salvamento apenas ao sair:** os dados só são gravados pela opção 6. Se o programa fechar de outra forma, as alterações da sessão se perdem.
* **Entrada não numérica no menu:** digitar uma letra causa `InputMismatchException` e encerra o programa sem salvar.
* **Busca por nome completo e exato:** não há busca parcial. Com nomes repetidos, alterar e excluir atuam apenas no último contato encontrado.
* **Sem validação de dados:** campos vazios são aceitos, e a opção 7 (`JOptionPane`) exige interface gráfica.

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