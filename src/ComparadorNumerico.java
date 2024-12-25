import java.util.Scanner;

public class ComparadorNumerico {
    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) ao comparador de dois números!");
        System.out.println("Digite o primeiro número inteiro que deseja comparar: ");
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = leitor.nextInt();

        if(num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if(num1 < num2) {
            System.out.println("O número " + num1 + " é menor que " + num2 + ".");
        } else if(num1 > num2) {
            System.out.println("O número " + num1 + " é maior que " + num2 + ".");
        }
    }
}
