import java.time.OffsetDateTime;

public class Deposito {
    private static int proximoId = 1;
    private int id;
    private double valor;
    private Conta conta;
    private OffsetDateTime dataHora = OffsetDateTime.now();

    public Deposito(Conta conta, double valor) {
        this.id = proximoId++;
        this.valor = valor;
        this.conta = conta;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public Conta getConta() {
        return conta;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}