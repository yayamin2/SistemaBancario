# 🏦 Sistema Bancário em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

Aplicação de terminal desenvolvida em **Java** para simular as principais operações do dia a dia de um aplicativo bancário, incluindo autenticação com senha, movimentações financeiras e acompanhamento de extrato.

---

## 🎯 Funcionalidades

- 🔒 **Autenticação Segura (Login):** Acesso à conta protegido por senha, simulando a segurança de entrada de um app de banco.
- 💰 **Consulta de Saldo:** Exibição rápida e clara do saldo disponível em conta corrente.
- 💵 **Depósitos:** Entrada de valores com validação para impedir depósitos negativos ou zerados.
- 💸 **Saques:** Retirada de valores com verificação de saldo disponível em conta para evitar saldo negativo.
- 📲 **Transferências Bancárias:** Envio de valores para outra conta/chave (estilo Pix ou transferência entre contas) com validação de saldo.
- 📜 **Extrato Bancário:** Histórico das últimas movimentações realizadas (entradas e saídas com descrição).
- 🎨 **Terminal Colorido (Códigos ANSI):** Feedback visual para o usuário com mensagens em verde (sucesso), vermelho (erros/alertas) e ciano (consultas).
- 🧭 **Menu Interativo:** Navegação fluida no console através de laço de repetição e `switch/case`.

---

### 🧭 Menu do Programa

| Opção | Operação | O que faz |
|:-----:|----------|-----------|
| `1` | **Consultar Saldo** | Mostra o saldo atual disponível |
| `2` | **Depositar** | Adiciona fundos à conta bancária |
| `3` | **Sacar** | Realiza o saque caso haja saldo suficiente |
| `4` | **Transferência** | Transfere um valor para outra conta bancária |
| `5` | **Extrato** | Lista o histórico das transações realizadas |
| `0` | **Sair** | Encerra a sessão com segurança |

---

## 💼 Regras de Negócio

<details>
<summary><b>1. Autenticação e Acesso</b></summary>

- O acesso ao menu principal só é liberado após a validação correta da senha do titular.
- Em caso de senha incorreta, o sistema emite uma mensagem de erro e solicita nova tentativa.
</details>

<details>
<summary><b>2. Depósitos e Saques</b></summary>

- **Depósito:** O valor informado deve ser estritamente positivo (`valor > 0`).
- **Saque:** O valor deve ser maior que zero e não pode ultrapassar o saldo disponível (`valor <= saldo`).
- Cada operação bem-sucedida gera automaticamente um registro no extrato bancário.
</details>

<details>
<summary><b>3. Transferências e Extrato</b></summary>

- **Transferência:** Exige saldo disponível suficiente e valida o valor antes de efetuar o débito.
- **Extrato:** Armazena e exibe cada movimentação com seu tipo (Depósito, Saque ou Transferência) e o respectivo valor.
</details>

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17+
- **Gerenciador de Dependências:** Maven
- **Entrada e Saída:** `java.util.Scanner` e `System.out.printf` formatado
- **Controle de Fluxo:** `do-while`, `switch/case` e `if/else`
- **Interface:** ANSI Escape Codes para estilização e cores no terminal

---

## 💻 Como Executar

### Pré-requisitos
- Ter o **JDK 17+** instalado na sua máquina.
- Um terminal com suporte a cores ANSI (Windows Terminal, Terminal do IntelliJ, etc.).

### Pelo Terminal
Clone o repositório e execute a partir da raiz do projeto:

```bash
# Compilar os arquivos Java
javac -d bin src/main/java/*.java

# Executar a aplicação
java -cp bin Main
```
