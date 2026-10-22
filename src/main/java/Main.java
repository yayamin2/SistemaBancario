import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Saldo inicial é R$ 1000,00

        double saldo = 1000.00;
        int opcao;
        do {

            // Menu colorido
            System.out.println(SistemaBancario.AMARELO + "\n=================================" + SistemaBancario.RESET);
            System.out.println(SistemaBancario.AMARELO + SistemaBancario.NEGRITO + "       SISTEMA BANCÁRIO          " + SistemaBancario.RESET);
            System.out.println(SistemaBancario.AMARELO + "=================================" + SistemaBancario.RESET);
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println(SistemaBancario.VERMELHO + "4 - Sair" + SistemaBancario.RESET);
            System.out.println(SistemaBancario.AMARELO + "---------------------------------" + SistemaBancario.RESET);
            System.out.print(SistemaBancario.NEGRITO + "Escolha uma opção: " + SistemaBancario.RESET);

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    // Solicita o valor do depósito ao usuário
                    System.out.print(SistemaBancario.AMARELO + "Digite o valor para depositar: " + SistemaBancario.RESET);
                    double valorDeposito = sc.nextDouble();
                    // Chama o método depositar e atualiza o saldo
                    saldo = SistemaBancario.depositar(saldo, valorDeposito);
                    break;
                case 2:
                    System.out.println(SistemaBancario.AMARELO + "Opção: Sacar (a implementar)" + SistemaBancario.RESET);
                    break;
                case 3:
                    SistemaBancario.consultarSaldo(saldo);
                    break;
                case 4:
                    System.out.println(SistemaBancario.VERDE + "Obrigado por usar o sistema. Até logo!" + SistemaBancario.RESET);
                    break;
                default:
                    System.out.println(SistemaBancario.VERMELHO + "Opção inválida! Escolha entre 1 e 4." + SistemaBancario.RESET);
            }
        } while (opcao != 4);
        sc.close();
    }
}
