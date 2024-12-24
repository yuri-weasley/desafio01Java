import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        /*Gerar um número aleatório*/
        int numeroSorteado = new Random().nextInt(100);
        System.out.println(numeroSorteado);
        //Cabeçalho do jogo
        System.out.println("Bem-vindo(a) ao jogo do número aleatório!");
        System.out.println("Você possui um total de 5 tentativas para advinhar qual o número aleatório (entre 0 e 100)");
        //variável de controle
        int tentativas = 0;

        while(tentativas < 5){
            System.out.println("Digite um número inteiro como sendo o seu chute: ");
            Scanner leitor = new Scanner(System.in);
            int chute = leitor.nextInt();
                if (chute == numeroSorteado) {
                    System.out.println("Parabéns, você acertou o número aleatório!");
                    break;
                } else if (chute > numeroSorteado){
                    System.out.println("O número aleatório é menor do que o seu palpite.");
                    tentativas++;
                    System.out.println("Você ainda possui " + (5 - tentativas) + " tentativas.");
                } else if (chute < numeroSorteado) {
                    System.out.println("O número aleatório é maior do que o seu palpite.");
                    tentativas++;
                    System.out.println("Você ainda possui " + (5 - tentativas) + " tentativas.");
                } else {
                    System.out.println("Você não conseguiu descobrir o número aleatório. Mais sorte da próxima!");
                    break;
                }
        }
        if(tentativas == 5) {
            System.out.println("Você tentou, mas não foi dessa vez! :(");
        }
    }
}
