import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        // Menu
        System.out.println("-------------- MENU --------------");
        System.out.println("Bem-vindo(a) à calculadora de áreas!");
        System.out.println("Escolha uma das seguintes opções: ");
        System.out.println("1. Calcular área de quadrado.");
        System.out.println("2. Calcular área de círculo.");
        Scanner leitor = new Scanner(System.in);
        int escolha = leitor.nextInt();

        if(escolha == 1) {
            System.out.println("Você deseja calcular a área de um quadrado, por favor, forneça o lado desse quadrado: ");
            double lado = leitor.nextDouble();
            double areaQuadrado = lado * lado;
            String areaQuadradoFormatada = String.format("%.2f", areaQuadrado);
            System.out.println("A área do quadrado em questão é: " + areaQuadradoFormatada + " u.a.");
        } else if(escolha == 2) {
            System.out.println("Você deseja calcular a área de um círculo, por favor digite o raio dessa círculo: ");
            double raio = leitor.nextDouble();
            double areaCirculo = Math.PI * raio * raio;
            String areaCirculoFormatada = String.format("%.2f", areaCirculo);
            System.out.println("A área do círculo é: " + areaCirculoFormatada + " u.a.");
        } else {
            System.out.println("Opção inválida, tente uma das opções do menu acima.");
        }
    }
}
