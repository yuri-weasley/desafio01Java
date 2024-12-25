import java.util.Scanner;

public class AnalisadorNumerico {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro qualquer: ");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        if(numero > 0) {
            System.out.println("O número digitado é um inteiro positivo.");
        } else if(numero < 0) {
            System.out.println("O número digitado é um inteiro negativo");
        } else {
            System.out.println("O número digitado é o ZERO.");
        }
    }
}
