public class ConversorTemperatura {
    public static void main(String[] args) {
        double tempEmCelsius = 23;
        double tempEmFaren = ((9 * tempEmCelsius)/ 5) + 32;
        System.out.println(tempEmFaren);
        int temperaturaInteira = (int) (tempEmFaren);
        System.out.println("A parte inteira da temperatura é: " + temperaturaInteira);
    }
}
