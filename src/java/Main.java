import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Conta mariaLuiza = new Conta("Maria Luiza", 1001, 2000); // Cria uma nova conta com titular "Ana" e número 1001
        Conta pietro = new Conta("pietro", 1002, 500); // Cria uma nova conta com titular "Bruno" e número 1002
        Conta Marie = new Conta("Marie", 1003, 15000); // Cria uma nova conta com titular "Marie" e número 1003

        Conta contaAtual = mariaLuiza; // Define a conta atual como a conta de Ana

        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        System.out.println(Cores.ROSA + "Bem-vindo ao Aura Finance!" + Cores.RESET);
        Banco banco = new Banco();
        banco.adicionarConta(mariaLuiza);
        banco.adicionarConta(pietro);
        banco.adicionarConta(Marie);

        while (opcao != 0) {

            System.out.println(Cores.ROSA + "Conta em atendimento: " + contaAtual.getTitular() + " Número da conta: " + contaAtual.getNumero() + Cores.RESET);
            System.out.println("1 - Transferir");
            System.out.println("2 - Depositar");
            System.out.println("3 - Listar Transferências");
            System.out.println("4 - Listar Depósitos");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Trocar conta");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número da conta de destino :");
                    int numeroDestino = sc.nextInt();
                    System.out.println("Digite o valor da transferência:");
                    double valorTransferencia = sc.nextDouble();
                    Conta contaDestino = banco.buscarConta(numeroDestino);
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = sc.nextDouble();
                    contaAtual.depositar(valorDeposito);
                    break;
                case 3:
                    contaAtual.listarTransferencias();
                    break;
                case 4:
                    contaAtual.listarDepositos();
                    break;
                case 5:
                    contaAtual.consultarSaldo(); // Chama o método consultarSaldo da conta atual para exibir o saldo
                    break;
                case 6:
                    banco.listarContas();
                    System.out.println("Trocar conta");
                    System.out.println("Digite o número da conta que deseja acessar:");
                    int numeroEscolhido = sc.nextInt();
                    Conta encontrada = banco.buscarConta(numeroEscolhido);
                    if (encontrada != null) {
                        contaAtual = encontrada; // Atualiza a conta atual para a conta encontrada
                        System.out.println(Cores.VERDE + "Conta trocada com sucesso! Agora você está acessando a conta de " + contaAtual.getTitular() + Cores.RESET);
                    } else {
                        System.out.println(Cores.VERMELHO + "Conta não encontrada. Por favor, tente novamente." + Cores.RESET);
                    }
                    break;
                case 0:
                    System.out.println(Cores.ROSA + " Obrigado por utilizar o Aura Finance!" + Cores.RESET);
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}
