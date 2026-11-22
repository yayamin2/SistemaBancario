import java.util.LinkedList;

public class Banco {
    LinkedList<Conta> contas = new LinkedList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
}
