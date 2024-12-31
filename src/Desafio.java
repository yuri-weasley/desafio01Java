import java.util.Scanner;

public class Desafio extends Conta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setNome("Yuri Ferreira");
        minhaConta.setTipo("Poupança");

        System.out.println("------- Dados iniciais do cliente -------");
        System.out.println("Nome: " + minhaConta.getNome());
        System.out.println("Tipo de conta: " + minhaConta.getTipo());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", minhaConta.getSaldo()));
        System.out.println("-----------------------------------------");

        System.out.println("Operações:");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
        System.out.println("Digite a opção desejada:");
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        while(opcao >= 1 && opcao <= 4) {
            if (opcao == 1) {
                System.out.println("Seu saldo atual é: R$ " + String.format("%.2f", minhaConta.getSaldo()));
                break;
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser depositado em R$: ");
                double valor = leitor.nextDouble();
                minhaConta.depositar(valor);
                System.out.println("Novo saldo: R$ " + String.format("%.2f", +minhaConta.getSaldo()));
                break;
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser transferido em R$: ");
                double valor = leitor.nextDouble();
                minhaConta.transferir(valor);
                break;
            } else if (opcao == 4) {
                System.out.println("Encerrando o programa. Até a próxima!");
                break;
            }
        }
        if(opcao < 1 || opcao > 4) {
            System.out.println("Opção digitada inválida. Tente novamente.");
        }

    }
}
