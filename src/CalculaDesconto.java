public class CalculaDesconto {
    public static void main(String[] args) {
        double precoOriginal = 50.00;
        double percentualDesconto = 10;
        double precoComDesconto = precoOriginal - (precoOriginal * percentualDesconto / 100);
        System.out.println("O preço final é: R$ " + precoComDesconto);
    }
}
