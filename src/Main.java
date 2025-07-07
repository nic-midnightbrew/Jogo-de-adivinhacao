import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);
        Scanner input = new Scanner(System.in);

        System.out.println("---------------JOGO DE ADIVINHAÇÃO---------------");
        System.out.println("Você tem 5 tentativas para acertar o número entre 1 e 100");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(String.format("Digite sua %d° tentativa:", i));
            int jogador = Integer.parseInt(input.nextLine());

            if (jogador > 100 || jogador < 0) {
                System.out.println("Valor incorreto!");
            }
            if (jogador > numeroAleatorio){
                System.out.println("Sua tentativa é MAIOR que o número aleatório!");

            } else if (jogador < numeroAleatorio) {
                System.out.println("Sua tentativa é MENOR que o número aleatório!");
            } else if (jogador == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                break;
            }

        }
        System.out.println("Fim do jogo!");
        System.out.println("O número era: "+ numeroAleatorio);
    }
}
