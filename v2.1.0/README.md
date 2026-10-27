# 🗂️ Agenda de Contatos - Versão V2.1.0

> Oitava etapa (Persistência de Dados em Arquivo) do desenvolvimento incremental do projeto para a disciplina de **Programação Orientada a Objetos (POO)**.

---

## 📌 Visão Geral

Esta versão introduz a **persistência de dados em arquivo texto**. Os contatos deixam de existir apenas em memória: ao sair do programa, são gravados no arquivo `contatos.txt` e, na próxima execução, são carregados automaticamente.

Diferente das versões anteriores, em que todos os dados eram perdidos ao encerrar a aplicação, a **V2.1.0** mantém a agenda entre uma execução e outra, usando as classes de entrada e saída do pacote `java.io`.

---

## 🔄 O que Mudou na Versão V2.1.0?

* 💾 **Nova classe `Persistencia.java`:**
  * **`salvarContatos()`:** grava os contatos em `contatos.txt`, uma linha por contato, no formato `nome;celular;email`. Ao concluir, exibe a mensagem "Contatos salvos com sucesso!".
  * **`carregarContatos()`:** se o arquivo existir, lê linha por linha e preenche as três listas. Se o arquivo não existir, a agenda começa vazia.
  * **Validação na leitura:** cada linha deve ter exatamente 3 campos. Linhas fora desse padrão são ignoradas com o aviso "Registro inválido ignorado".
  * **Tratamento de erros:** falhas de leitura ou gravação (`IOException`) exibem uma mensagem, o motivo (`getMessage()`) e o rastreio do erro (`printStackTrace()`).
* 🔁 **Atualização do `Principal.java`:**
  * Os contatos são carregados do arquivo antes de o menu ser exibido.
  * A opção **6 - Sair** grava os contatos no arquivo antes de encerrar o programa.
* 🖥️ **Interface:** o banner inicial exibe a versão v2.1.0 e a opção 7 abre uma janela com informações sobre a agenda.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Persistência em Arquivo Texto (`java.io`):**
  * **Gravação:** `FileWriter` combinado com `PrintWriter` e o método `println()`.
  * **Leitura:** `FileReader` combinado com `BufferedReader` e o método `readLine()`.
  * **Verificação de existência:** classe `File` com o método `exists()`.
* **Tratamento de Exceções:** blocos `try/catch` para `IOException`.
* **Formato Delimitado:** campos separados por `;` e leitura com `split(";")`, validando a quantidade de campos de cada registro.
* **Ciclo de Vida dos Dados:** carregamento na inicialização e gravação no encerramento do programa.
* **Estrutura Multiclasse:** quatro arquivos Java no pacote `br.edu.principal`, com `Agenda` (CRUD), `Persistencia` (arquivo), `Uteis` (interface) e `Principal` (fluxo).
* **Passagem de Listas por Parâmetro:** os métodos recebem as listas `nomes`, `celulares` e `emails` e modificam diretamente seu conteúdo.

---

## 📁 Estrutura do Projeto

```text
src/
└── br/
    └── edu/
        └── principal/
            ├── Agenda.java        # Operações do CRUD sobre as listas de dados
            ├── Persistencia.java  # [NOVO] Leitura e gravação do arquivo contatos.txt
            ├── Principal.java     # [ATUALIZADO] Carrega contatos ao iniciar e salva ao sair
            └── Uteis.java         # Utilitários de interface e exibição de menu
```

---

## ⚠️ Limitações da Versão

* **Estrutura de listas paralelas:** cada contato é representado por três listas separadas (`List<String>`), ligadas apenas pela posição, em vez de um objeto `Contato` dedicado.
* **Contato sem e-mail é perdido:** se o e-mail ficar em branco, a linha gravada termina em `;` e, ao carregar, é tratada como registro inválido. O contato some do arquivo no próximo salvamento. O mesmo ocorre se algum campo contiver `;`.
* **Salvamento apenas ao sair:** os dados só são gravados pela opção 6. Se o programa fechar de outra forma, as alterações da sessão se perdem.
* **Falha ao salvar não impede o encerramento:** se a gravação der erro, a mensagem é exibida, mas o programa sai mesmo assim.
* **Entrada não numérica no menu:** digitar uma letra causa `InputMismatchException` e encerra o programa sem salvar.
* **Busca por nome completo e exato:** não há busca parcial. Com nomes repetidos, a pesquisa mostra todos, mas alterar atua no último contato encontrado e excluir atua no primeiro.
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