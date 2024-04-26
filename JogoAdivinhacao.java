import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 10; 
        int tentativasRestantes = tentativas;

        System.out.println("Bem-vindo ao jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");

        while (tentativasRestantes > 0) {
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou corretamente o número " + numeroAleatorio + " em " + (tentativas - tentativasRestantes + 1) + " tentativa(s).");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativasRestantes--;
        }

        if (tentativasRestantes == 0) {
            System.out.println("Suas tentativas acabaram! O número era: " + numeroAleatorio);
        }

        scanner.close();
    }
}