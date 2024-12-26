import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        System.out.println("---------- É ímpar ou par? ----------");
        System.out.println("Digite um número inteiro qualquer, e lhe diremos se ele é ímpar ou par:");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        if(numero % 2 == 0) {
            System.out.println("O número digitado foi o " + numero + " e ele é um número par.");
        } else {
            System.out.println("O número digitado foi o " + numero + " e ele é ímpar.");
        }
    }
}
