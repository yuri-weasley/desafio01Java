import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("---------- Tabuada ----------");
        System.out.println("Escolha um número de 1 a 10 para calcularmos a sua tabuada:");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        System.out.println("O número digitado é o " + numero + ", e sua taduaba é: ");

        for(int multi = 1; multi <= 10; multi++) {
            System.out.println(multi + " x " + numero + " = " + multi * numero);
        }
    }
}
