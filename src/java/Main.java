import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Conta Maria_Luiza = new Conta("Maria Luiza", 1001, 2000); // Cria uma nova conta com titular "Ana" e número 1001
        Conta Pietro = new Conta("Pietro", 1002, 2000); // Cria uma nova conta com titular "Bruno" e número 1002

        Conta contaAtual = Maria_Luiza; // Define a conta atual como a conta de Ana

        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        System.out.println(Cores.ROSA + "Bem-vindo ao Aura Finance!" + Cores.RESET);
        Banco banco = new Banco();
        banco.adicionarConta(Maria_Luiza);
        banco.adicionarConta(Pietro);

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
                    System.out.println("Digite o número da conta de destino (1001 para Maria Luiza, 1002 para Pietro):");
                    int numeroDestino = sc.nextInt();
                    System.out.println("Digite o valor da transferência:");
                    double valorTransferencia = sc.nextDouble();
                    Conta contaDestino = null; // Inicializa a variável contaDestino como nula
                    if (numeroDestino == Maria_Luiza.getNumero()) {
                        contaDestino = Maria_Luiza;
                    } else if (numeroDestino == Pietro.getNumero()) {
                        contaDestino = Pietro;
                    }
                    contaAtual.transferir(contaDestino, valorTransferencia);
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
                    System.out.println("Trocar conta");
                    System.out.println("Digite o número da conta que deseja acessar (1001 para Maria Luiza, 1002 para Pietro):");
                    int numeroEscolhido = sc.nextInt();
                    if (numeroEscolhido == Maria_Luiza.getNumero()) {
                        contaAtual = Maria_Luiza;
                    } else if (numeroEscolhido == Pietro.getNumero()) {
                        contaAtual = Pietro;
                    } else {
                        System.out.println("Número de conta inválido");
                    }
                    break;
                case 0:
                    System.out.println("Atendimento encerrado. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}
