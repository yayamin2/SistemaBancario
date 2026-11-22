import java.time.OffsetDateTime;

public class Transferencia {
    private static int proximoId = 1;
    private int id;
    private double valor;
    private Conta origem;
    private Conta destino;
    private OffsetDateTime dataHora = OffsetDateTime.now();

    public Transferencia(Conta origem, Conta destino, double valor) {
        this.id = proximoId++;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public Conta getOrigem() {
        return origem;
    }

    public Conta getDestino() {
        return destino;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
