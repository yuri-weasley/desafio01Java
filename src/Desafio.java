import java.util.Scanner;

public class Desafio extends Conta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setNome("Yuri Ferreira");
        minhaConta.setTipo("Poupança");
        int opcao = 0;

        System.out.println("------- Dados iniciais do cliente -------");
        System.out.println("Nome: " + minhaConta.getNome());
        System.out.println("Tipo de conta: " + minhaConta.getTipo());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", minhaConta.getSaldo()));
        System.out.println("-----------------------------------------");

        String menu = """
                Digite sua opção:
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;

        Scanner leitor = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: R$ " + String.format("%.2f", minhaConta.getSaldo()));
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser depositado em R$: ");
                double valor = leitor.nextDouble();
                minhaConta.depositar(valor);
                System.out.println("Novo saldo: R$ " + String.format("%.2f", +minhaConta.getSaldo()));
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser transferido em R$: ");
                double valor = leitor.nextDouble();
                minhaConta.transferir(valor);
            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }
        }
    }
}
