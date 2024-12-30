import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) à calculadora de Fatorial!");
        System.out.println("Digite um número e calcularemos seu fatorial:");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        /*
            num! = num.(num - 1).(num - 2).(num - 3).....(num - (num - 1))
            7! = 7.6.5.4.....1
            num! = num.(num - 1)
        */
    }
}
