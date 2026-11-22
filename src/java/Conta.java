import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;
    private LinkedList<Deposito> depositos = new LinkedList<>();
    private LinkedList<Transferencia> transferencias = new LinkedList<>();

    public Conta(String titular, int numero, double saldo) { // Construtor da classe Conta
        this.titular = titular; // Inicializa o titular da conta
        this.numero = numero; // Inicializa o número da conta
        this.saldo = saldo; // Inicializa o saldo da conta
    }

    public String getTitular() { // Método para obter o titular da conta
        return titular;
    }

    public int getNumero() { // Método para obter o número da conta
        return numero;
    }

    public double getSaldo() {// Método para obter o saldo da conta
        return saldo;
    }

    public void consultarSaldo() {
        System.out.printf("Conta %d - Saldo da conta R$: %.2f%n", numero, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor; // Adiciona o valor ao saldo da conta
            Deposito deposito = new Deposito(this, valor);
            depositos.add(deposito); // Adiciona o depósito à lista de depósitos da conta
            System.out.printf(Cores.VERDE + "Depósito nº %d realizado com sucesso! Valor: R$ %.2f, horário do depósito: %s%n", deposito.getId(), valor, deposito.getDataHora() + Cores.RESET);
        } else {
            System.out.println(Cores.VERMELHO + "Valor de depósito inválido, o valor deverá ser maior que zero." + Cores.RESET);

        }
    }

    public void listarDepositos() {
        if (depositos.isEmpty()) { // Verifica se a lista de depósitos está vazia
            System.out.println(Cores.VERMELHO + "Nenhum depósito realizado." + Cores.RESET);
        } else {
            System.out.println(Cores.VERDE + "Depósitos realizados:" + Cores.RESET);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss XXX");
            for (Deposito deposito : depositos) {
                System.out.printf(Cores.VERDE + "Depósito nº %d, numero da conta %d, titular: %s - Valor: R$ %.2f, horário do depósito: %s%n", deposito.getId(), deposito.getConta().getNumero(), deposito.getConta().getTitular(), deposito.getDataHora().format(formato) + Cores.RESET);
            }
        }
    }

    public void transferir(Conta destino, double valor) {
        if (destino == null) { // Verifica se a conta de destino é nula
            System.out.println(Cores.VERMELHO + "Recusado: conta de destino inválida" + Cores.RESET);
        } else if (destino == this) { // Verifica se a conta de destino é a mesma que a conta de origem
            System.out.println(Cores.VERMELHO + "Recusado: transferência para a própria conta" + Cores.RESET);
        } else if (valor <= 0) {
            System.out.println(Cores.VERMELHO + "Recusado: valor de transferência inválido, o valor deverá ser maior que zero." + Cores.RESET);
        } else if (valor > saldo) {
            System.out.println(Cores.VERMELHO + "Recusado: saldo insuficiente" + Cores.RESET);
        } else {
            saldo -= valor; // Subtrai o valor do saldo da conta de origem
            destino.saldo += valor; // Adiciona o valor ao saldo da conta de destino
            Transferencia transferencia = new Transferencia(this, destino, valor);
            transferencias.add(transferencia); // Adiciona a transferência à lista de transferências da conta de origem
            System.out.printf(Cores.VERDE + "Transferência realizada com sucesso! Valor: R$ %.2f, ID %d" + Cores.RESET, valor, transferencia.getId());
        }
    }

    public void listarTransferencias() {
        if (transferencias.isEmpty()) {
            System.out.println(Cores.VERMELHO + "Nenhuma transferência realizada." + Cores.RESET);
        } else {
            System.out.println(Cores.VERDE + "Transferências realizadas:" + Cores.RESET);
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss XXX");
            for (Transferencia transferencia : transferencias) {
                System.out.printf(Cores.VERDE + "Transferência nº %d, de %s para %s - Valor: R$ %.2f, horário da transferência: %s%n" + Cores.RESET, transferencia.getId(), transferencia.getOrigem().getTitular(), transferencia.getDestino().getTitular(), transferencia.getValor(), transferencia.getDataHora().format(formato));
            }
        }
    }
}
