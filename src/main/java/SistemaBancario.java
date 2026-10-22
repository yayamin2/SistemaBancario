public class SistemaBancario {
    // Cores para deixar o terminal colorido
    public static final String RESET    = "\u001B[0m";  // Reseta para a cor padrão
    public static final String VERMELHO = "\u001B[31m"; // Para erros e saídas
    public static final String VERDE    = "\u001B[32m"; // Para sucesso e depósitos
    public static final String AMARELO  = "\u001B[33m"; // Para avisos e menu
    public static final String CIANO    = "\u001B[36m"; // Para consultas de saldo
    public static final String NEGRITO  = "\u001B[1m";  // Para texto em destaque

    /**
     * Realiza um depósito na conta bancária
     * @param saldo - saldo atual da conta
     * @param valor - valor a ser depositado
     * @return - novo saldo após o depósito
     */
    public static double depositar(double saldo, double valor) {
        // Verifica se o valor do depósito é positivo
        if (valor <= 0) {
            System.out.println(VERMELHO + NEGRITO + "Erro: O valor do depósito deve ser positivo!" + RESET);
            return saldo;
        }
        
        // Adiciona o valor ao saldo
        double novoSaldo = saldo + valor;
        
        // Exibe mensagem de sucesso
        System.out.println(VERDE + "\n---------------------------------" + RESET);
        System.out.println(VERDE + NEGRITO + "  Depósito realizado com sucesso!" + RESET);
        System.out.printf(VERDE + "  Valor depositado: R$ %.2f\n" + RESET, valor);
        System.out.printf(VERDE + "  Saldo anterior: R$ %.2f\n" + RESET, saldo);
        System.out.printf(VERDE + "  Novo saldo: R$ %.2f\n" + RESET, novoSaldo);
        System.out.println(VERDE + "---------------------------------" + RESET);
        
        return novoSaldo;
    }

    public static void consultarSaldo(double saldo) {
        System.out.println(CIANO + "\n---------------------------------" + RESET);
        System.out.printf(CIANO + NEGRITO + "  Saldo Atual: R$ %.2f\n" + RESET, saldo);
        System.out.println(CIANO + "---------------------------------" + RESET);
    }

}