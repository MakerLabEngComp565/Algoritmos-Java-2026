import java.util.Random;
import java.util.Scanner;
public class Jogo_adivinhacao_numero {
public static void main(String[] args) {
    Scanner digitador = new Scanner(System.in);
    Random random = new Random();

    // Variaveis
    int numero_sorteado, palpite, contador;
    numero_sorteado = random.nextInt(100) + 1;
    System.out.println(numero_sorteado);
    // Sortear um número
    numero_sorteado = 30;

    // Receber um palpite
    System.out.println("Digite um número entre 1 e 100: ");
    palpite = digitador.nextInt();
    contador = 1;
    // Testar
   while(palpite != numero_sorteado){
    if(palpite < numero_sorteado){
        System.out.println("Número baixo! ");
    } else {
        System.out.println("Número alto! ");
   }
    System.out.println("Digite um número entre 1 e 100: ");
    palpite = digitador.nextInt();
    contador++;
   }

     System.out.println("Parabéns, você acertou o número! Com " + contador + " palpites.");

    
}
            }