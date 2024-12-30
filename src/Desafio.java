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
    }
}
