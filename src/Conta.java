public class Conta {
    private String nome;
    private String tipo;
    private double saldo = 1000;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void transferir(double valor) {
        if(valor <= saldo) {
            System.out.println("Transferência realizada com sucesso.");
            saldo -= valor;
            System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
        } else {
            System.out.println("Saldo insuficiente para realizar a operação.");
        }
    }
}
