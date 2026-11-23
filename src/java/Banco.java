import java.util.LinkedList;

public class Banco {
  private LinkedList<Conta> contas = new LinkedList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null; // Retorna null se a conta não for encontrada
    }
    public void listarContas() {
        System.out.println(Cores.ROSA + "Listagem de contas:" + Cores.RESET);
        for (Conta conta : contas) {
            System.out.printf("Conta nº %d, titular: %s%n", conta.getNumero(), conta.getTitular());
        }
    }
}
