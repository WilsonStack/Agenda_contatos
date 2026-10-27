# 🗂️ Agenda de Contatos - Versão V3.0.0

> Nona etapa (Introdução a Classes e Objetos) do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral

Esta versão marca a transição da abordagem procedural para a **Programação Orientada a Objetos (POO)**, com a criação da classe `Contato`, que agrupa nome, celular e e-mail em uma única estrutura.

Nesta etapa, a classe é apresentada e testada no `Principal`, enquanto o CRUD da agenda continua operando sobre as três listas de `String` (`nomes`, `celulares` e `emails`). A **V3.0.0** introduz o objeto como forma de representar um contato, preparando o terreno para as próximas versões.

---

## 🔄 O que Mudou na Versão V3.0.0?

* 🧱 **Nova classe `Contato.java`:**
  * Define os atributos públicos `nome`, `celular` e `email`.
  * Não possui construtor explícito, então usa o construtor padrão do Java.
* 🧪 **Atualização do `Principal.java`:**
  * Cria dois objetos `Contato` com o operador `new`, atribui valores diretamente aos atributos e exibe os dados em memória com o título "=== Teste de Objetos (v3.0.0) ===", antes do menu.
  * Em seguida, carrega os contatos do arquivo e executa o menu em um laço `do-while`, com `switch` clássico (`case` e `break`).
  * A opção **0 - Sair** salva os contatos e encerra o programa.
* 📦 **Base anterior mantida:**
  * `Agenda.java`, `Persistencia.java` e `Uteis.java` continuam trabalhando com as listas `nomes`, `celulares` e `emails`, ligadas apenas pela posição.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Orientação a Objetos (POO):**
  * **Classe e Objeto:** a classe `Contato` como molde e cada contato como uma instância.
  * **Atributos de Classe:** `nome`, `celular` e `email`.
  * **Instanciação:** uso do operador `new` com o construtor padrão.
  * **Acesso Direto aos Atributos:** leitura e escrita pelo operador ponto (`c1.nome`).
  * **Objetos Independentes:** `c1` e `c2` têm estados próprios.
* **Persistência em Arquivo Texto:** `BufferedReader` com `FileReader` para ler e `BufferedWriter` com `FileWriter` para gravar, usando `try-with-resources`. O arquivo `contatos.txt` guarda uma linha por contato, no formato `nome;celular;email`, e o nome do arquivo fica em uma constante (`ARQUIVO`).
* **Estrutura Multiclasse:** cinco arquivos Java no pacote `br.edu.principal`, com métodos estáticos nas classes `Agenda`, `Persistencia` e `Uteis`.
* **Controle de Fluxo:** laço `do-while` com `switch` clássico e opção 0 para encerrar.

---

## 📁 Estrutura do Projeto

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Agenda.java        # Operações do CRUD sobre as listas de dados
            ├── Contato.java       # [NOVO] Classe que modela a entidade Contato
            ├── Persistencia.java  # Leitura e gravação do arquivo contatos.txt
            ├── Principal.java     # [ATUALIZADO] Ponto de entrada e teste de instanciação de objetos
            └── Uteis.java         # Utilitários de interface e exibição de menu
```

---

## ⚠️ Limitações da Versão

* **`Contato` ainda não é usado pela agenda:** os objetos existem apenas no teste do `Principal`. O CRUD e a persistência continuam com listas paralelas de `String`.
* **Código de teste a cada execução:** os dois contatos de exemplo são impressos antes do menu, sem fazer parte da agenda.
* **Atributos públicos:** os dados são acessados diretamente pelo operador ponto, sem encapsulamento.
* **Contato sem e-mail é perdido sem aviso:** se o e-mail ficar em branco, a linha gravada termina em `;` e, ao carregar, é descartada em silêncio. O contato some do arquivo no próximo salvamento. O mesmo ocorre se algum campo contiver `;`.
* **Salvamento apenas ao sair:** os dados só são gravados pela opção 0.
* **Entrada não numérica no menu:** digitar uma letra causa `InputMismatchException` e encerra o programa sem salvar.
* **Vários `Scanner` sobre a entrada padrão:** `lerOpcao()` e cada método de `Agenda` criam o próprio `Scanner`, sem fechá-lo. Funciona na digitação normal, mas pode perder dados quando a entrada é colada ou redirecionada.
* **Busca por nome completo e exato:** não há busca parcial. Alterar e excluir atuam apenas no primeiro contato com o nome informado.

---

## 🔧 Como Executar

Requer **JDK 8 ou superior** (esta versão usa `switch` clássico, sem `->`).

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