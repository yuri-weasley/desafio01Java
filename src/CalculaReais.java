public class CalculaReais {
    public static void main(String[] args) {
        double valorEmDolares = 21.98;
        double contacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * contacaoDolar;
        String valorEmReaisFormatado = String.format("%.2f", valorEmReais);
        System.out.println("O valor em R$ é de: R$ " + valorEmReaisFormatado);
    }
}
