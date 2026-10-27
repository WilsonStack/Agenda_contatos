# 📒 Agenda de Contatos

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Versão atual](https://img.shields.io/badge/vers%C3%A3o-v3.3.0-success)
![Interface](https://img.shields.io/badge/interface-console-lightgrey)
![IFCE](https://img.shields.io/badge/IFCE-Campus%20Maranguape-2e7d32)

> Projeto prático desenvolvido no **IFCE – Campus Maranguape**, na disciplina de Programação Orientada a Objetos (POO).

Sistema de gerenciamento de contatos em Java construído de forma **incremental**: cada versão parte da anterior e acrescenta um conceito novo no pacote `src/br/edu/principal`, evoluindo de variáveis simples até encapsulamento, passando por coleções, modularização em classes dedicadas e persistência em arquivo.

Toda a evolução do código-fonte está registrada no **histórico de commits** deste repositório, modificando os arquivos em uma única estrutura de pacotes (`src/br/edu/principal`).

---

## ✨ Funcionalidades (v3.3.0)

| Funcionalidade | O que faz | Onde fica |
|---|---|---|
| ➕ Adicionar | Cadastra um contato com nome, celular e e-mail | `Agenda.adicionar()` |
| 📋 Listar | Mostra todos os contatos cadastrados | `Agenda.listar()` |
| 🔍 Pesquisar | Busca contatos | `Agenda.pesquisar()` |
| ✏️ Atualizar | Altera os dados de um contato | `Agenda.atualizar()` |
| 🗑️ Excluir | Remove um contato | `Agenda.excluir()` |
| 💾 Persistência | Carrega e salva automaticamente em `contatos.txt` | `Persistencia.carregarContatos()` e `Persistencia.salvarContatos()` |

---

## 📊 Evolução das Versões (Histórico de Commits)

| Versão | Abordagem | Principais conceitos |
|---|---|---|
| **v0.0.0** | Variáveis simples | `Scanner`, `if/else`, `while`, 1 contato em memória |
| **v0.1.0** | Arrays | Vetores, índices, `for`, capacidade fixa |
| **v0.2.0** | `List` + `ArrayList` | Coleções dinâmicas: `add()`, `get()`, `remove()`, `size()` |
| **v0.3.0** | `List` + `ArrayList` | `set()` e CRUD completo |
| **v1.0.0** | Modularização procedural | Métodos estáticos, pacote `br.edu.principal` |
| **v1.1.0** | Separação de responsabilidades | Classes `Agenda`, `Uteis` e `Principal` |
| **v1.1.1** | Correção de bugs (patch) | Fluxo da opção Sair, buffer do `Scanner`, mensagens |
| **v2.1.0** | Persistência em arquivo TXT | Classe `Persistencia`, `java.io`, `contatos.txt` |
| **v3.0.0** | Classes e objetos | Entidade `Contato`, atributos, `new` |
| **v3.1.0** | Coleção de objetos | `List<Contato>`, `for-each`, Generics |
| **v3.2.0** | CRUD orientado a objetos | CRUD e persistência operando sobre `List<Contato>` |
| **v3.3.0** ✅ | **Encapsulamento** *(atual)* | `private`, construtor parametrizado, `this`, getters e setters |

<details>
<summary><strong>📚 Ver histórico detalhado de cada versão</strong></summary>

<br>

**v0.0.0 — Variáveis simples.** Cadastro e exibição de um único contato por execução, usando apenas variáveis em memória.

**v0.1.0 — Arrays.** Múltiplos contatos com vetores de tamanho fixo, percorridos por índice em laços de repetição.

**v0.2.0 — Coleções dinâmicas.** `List` e `ArrayList` no lugar dos arrays, eliminando o limite de registros.

**v0.3.0 — CRUD completo.** Alteração de contatos com `set()`, fechando as quatro operações básicas (Create, Read, Update, Delete).

**v1.0.0 — Modularização procedural.** Operações isoladas em métodos estáticos, deixando o `main` mais enxuto.

**v1.1.0 — Separação de responsabilidades.** O sistema passa a ter três classes:
- `Agenda`: operações e regras do CRUD.
- `Uteis`: menus e leitura de opções.
- `Principal`: ponto de entrada e loop principal.

**v1.1.1 — Correções.** Ajuste do encerramento pela opção Sair, correção da leitura de `String` após `int` com o `Scanner` e melhoria das mensagens no console.

**v2.1.0 — Persistência em TXT.** Classe `Persistencia` com `BufferedReader`, `BufferedWriter` e `File`. Os contatos são carregados ao iniciar e gravados ao encerrar, no formato `nome;celular;email`.

**v3.0.0 — Primeira classe de domínio.** Criação da classe `Contato` (`nome`, `celular`, `email`) e instanciação de objetos com `new`. Início da transição do estilo procedural para POO.

**v3.1.0 — `List<Contato>`.** Objetos agrupados em uma lista tipada e percorridos com `for-each` e `for` indexado.

**v3.2.0 — CRUD orientado a objetos.** As três listas paralelas de `String` (`nomes`, `celulares`, `emails`) foram substituídas por uma única `List<Contato>`. `Agenda` e `Persistencia` passaram a trabalhar com objetos `Contato`.

**v3.3.0 — Encapsulamento.** Atributos `private`, construtor parametrizado (`new Contato(nome, celular, email)`) com `this`, e acesso aos dados apenas por getters e setters em `Agenda` e `Persistencia`.

</details>

---

## 🏗️ Estrutura do Projeto (v3.3.0)

### Arquivos

```text
Agenda_contatos/
├── .gitignore
├── README.md
└── src/
    └── br/
        └── edu/
            └── principal/
                ├── Agenda.java
                ├── Contato.java
                ├── Persistencia.java
                ├── Principal.java
                └── Uteis.java
```

O arquivo `contatos.txt` é criado pelo programa ao ser encerrado, na pasta de onde ele é executado.

### Classes

Tudo fica no pacote `br.edu.principal`, com uma única coleção `List<Contato>`:

```text
Principal  (controla o loop do menu e mantém a List<Contato>)
   │
   ├── Uteis          → menus e leitura de opções
   ├── Agenda         → adicionar() · listar() · pesquisar() · atualizar() · excluir()
   └── Persistencia   → carregarContatos() · salvarContatos()

Contato  → entidade usada por todas as classes acima
```

| Classe | Responsabilidade |
|---|---|
| `Contato` | Entidade com atributos privados, construtor parametrizado, getters e setters |
| `Agenda` | CRUD sobre a `List<Contato>` |
| `Persistencia` | Leitura e escrita do arquivo `contatos.txt` |
| `Uteis` | Exibição de menus e métodos auxiliares |
| `Principal` | Ponto de entrada da aplicação |

---

## ▶️ Como Executar

**Pré-requisito:** JDK 8 ou superior instalado (`java -version` e `javac -version` devem funcionar).

1. Compile as classes do pacote a partir da raiz do projeto:

```bash
javac -d out src/br/edu/principal/*.java
```

2. Execute a aplicação:

```bash
java -cp out br.edu.principal.Principal
```

---

## 💾 Formato dos Dados

A partir da v2.1.0, os contatos são gravados em `contatos.txt`, um por linha, separados por ponto e vírgula:

```text
Maria Silva;85999990000;maria@email.com
```

---

<p align="center">Desenvolvido no <strong>IFCE – Campus Maranguape</strong></p>
