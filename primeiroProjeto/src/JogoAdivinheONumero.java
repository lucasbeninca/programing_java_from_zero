import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinheONumero {
    static void main(String[] args) {
        System.out.println("Bem vindo a jogo de adivinhar o número");
        Scanner numeroChute = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100) + 1;
        int numeroEscolhido = 0;
        int totalDeTentativas = 0;

        while(numeroSecreto != numeroEscolhido){
            System.out.println("Chute um número de 0 a 100");
            numeroEscolhido = numeroChute.nextInt();
            if (numeroEscolhido < numeroSecreto) {
                System.out.println("Você Errou o numero Secreto é maior que: " + numeroEscolhido);
            }else {
                System.out.println("Você Errou o numero Secreto é menor que: " + numeroEscolhido);
            }
            totalDeTentativas++;
        }
        System.out.println("Parabéns você acertou  o número secreto era: " + numeroSecreto + " Você Precisou de " + totalDeTentativas+" tentativas");
    }
}
