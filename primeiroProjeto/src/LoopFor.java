import java.util.Scanner;

public class LoopFor {
    static void main(String[] args) {
        Scanner inputDeDados = new Scanner(System.in);
        double mediaFilmeDeAvaliacao = 0;
        double notaParaOFilme = 0;

        for (int i = 1; i < 4; i++) {
            System.out.println("Qual nota você da para o: " + i + "° filme?");
            notaParaOFilme = inputDeDados.nextDouble();
            mediaFilmeDeAvaliacao += notaParaOFilme;
        }

        int mediaEmEstrelas = (int) (mediaFilmeDeAvaliacao / 3) / 2;
        System.out.println("O Filme alcançou o ranking de " + mediaEmEstrelas + " Estrelas");
    }
}
