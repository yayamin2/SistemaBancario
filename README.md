# 🏦 Sistema Bancário em Java (Fourbank)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

Aplicação de terminal desenvolvida em **Java** para simular as principais operações do dia a dia de um aplicativo bancário (Fourbank), incluindo gerenciamento de contas, autenticação por senha, movimentações financeiras seguras e histórico detalhado de transações via `LinkedList`.

---

## 🎯 Funcionalidades

- 🔒 **Autenticação Segura (Login):** Acesso à conta protegido por senha, simulando a segurança de entrada de um aplicativo de banco.
- 💰 **Consulta de Saldo:** Exibição clara e atualizada do saldo disponível em conta corrente.
- 💵 **Depósitos:** Entrada de valores com validação estrita para impedir depósitos negativos ou zerados.
- 💸 **Saques:** Retirada de valores com verificação de saldo disponível em conta para evitar saldo negativo.
- 📲 **Transferências Bancárias:** Envio de valores entre contas com validação de saldo e integridade de destino.
- 📜 **Extrato Bancário:** Histórico das últimas movimentações realizadas (entradas e saídas com registros temporais).
- 🎨 **Terminal Colorido (Códigos ANSI):** Feedback visual para o usuário com mensagens estilizadas (sucesso, erros/alertas e consultas).
- 🧭 **Menu Interativo:** Navegação fluida no console através de laço de repetição (`do-while`) e `switch/case`.

---

### 🧭 Menu do Programa

| Opção | Operação | O que faz |
|:-----:|----------|-----------|
| `1` | **Transferir** | Envia valores para outra conta bancária |
| `2` | **Depositar** | Adiciona fundos à conta em atendimento |
| `3` | **Listar Transferências** | Exibe o histórico de envios realizados |
| `4` | **Listar Depósitos** | Exibe o histórico de depósitos recebidos |
| `5` | **Consultar Saldo** | Mostra o saldo atual disponível |
| `6` | **Trocar Conta** | Alterna o atendimento entre diferentes contas (ex: Ana / Bruno) |
| `0` | **Finalizar** | Encerra a sessão com segurança e mensagem de despedida |

---

## 💼 Regras de Negócio

<details>
<summary><b>1. Autenticação e Troca de Contas</b></summary>

- O acesso aos serviços exige validação correta da senha do titular.
- A troca de contas preserva os estados, históricos e contadores em memória durante toda a execução.
</details>

<details>
<summary><b>2. Depósitos e Saques</b></summary>

- **Depósito:** O valor informado deve ser estritamente positivo (`valor > 0`).
- **Saque / Transferência:** O valor deve ser maior que zero e não pode ultrapassar o saldo disponível (`valor <= saldo`).
- Operações recusadas não consomem identificadores (IDs) de controle nem alteram saldos ou históricos.
</details>

<details>
<summary><b>3. Histórico e Listagens (`LinkedList`)</b></summary>

- Cada operação concluída gera um registro contendo ID sequencial (gerenciado via `static`), dados da transação e carimbo de data/hora (`OffsetDateTime`).
- As listagens mantêm a ordem cronológica dos eventos, do mais antigo para o mais recente.
</details>

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17+
- **Estruturas de Dados:** `java.util.LinkedList` para controle de históricos
- **Manipulação de Tempo:** `java.time.OffsetDateTime` para registro temporal com fuso
- **Entrada e Saída:** `java.util.Scanner` e `System.out.printf` formatado
- **Controle de Fluxo:** `do-while`, `switch/case` e `if/else`
- **Interface:** Códigos de escape ANSI para estilização e cores no terminal

---

## 💻 Como Executar

### Pré-requisitos
- Ter o **JDK 17+** instalado na sua máquina.
- Um terminal com suporte a cores ANSI (Windows Terminal, Terminal do IntelliJ, etc.).

### Pelo Terminal
Clone o repositório e execute a partir da raiz do projeto:

```bash
# Compilar os arquivos Java
javac -d bin src/*.java

# Executar a aplicação
java -cp bin Main
```

---

## 👩‍💻 Autora

**Yasmin**

Graduanda em Engenharia de Software | Trainee Fourcamp (Foursys) | Foco em Back-end, Java e FinTechs

[![GitHub](https://img.shields.io/badge/GitHub-yayamin2-181717?style=flat-square&logo=github)](https://github.com/yayamin2)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-yasminmorenomendes-0077B5?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/yasminmorenomendes)
