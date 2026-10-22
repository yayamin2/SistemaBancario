public class SistemaBancario {
    // Cores para deixar o terminal colorido
    public static final String RESET    = "\u001B[0m";  // Reseta para a cor padrão
    public static final String VERMELHO = "\u001B[31m"; // Para erros e saídas
    public static final String VERDE    = "\u001B[32m"; // Para sucesso e depósitos
    public static final String AMARELO  = "\u001B[33m"; // Para avisos e menu
    public static final String CIANO    = "\u001B[36m"; // Para consultas de saldo
    public static final String NEGRITO  = "\u001B[1m";  // Para texto em destaque

    public static void consultarSaldo(double saldo) {
        System.out.println(CIANO + "\n---------------------------------" + RESET);
        System.out.printf(CIANO + NEGRITO + "  Saldo Atual: R$ %.2f\n" + RESET, saldo);
        System.out.println(CIANO + "---------------------------------" + RESET);
    }

}