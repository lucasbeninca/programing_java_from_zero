import java.util.Scanner;

public class LoopWhile {
       public static void main(String[] args) {
            Scanner inputDeDados = new Scanner(System.in);
            double mediaFilmeDeAvaliacao = 0;
            double notaParaOFilme = 0;
            int totalDeNotasSomadas = 0;

            while (notaParaOFilme != -1) {
                System.out.println("Digite sua nota para os filmes ou -1 para encerrar ");
                notaParaOFilme = inputDeDados.nextDouble();
                if (notaParaOFilme == -1) {
                    mediaFilmeDeAvaliacao += notaParaOFilme;
                    totalDeNotasSomadas++;
                }
            }

            int mediaEmEstrelas = (int) (mediaFilmeDeAvaliacao / totalDeNotasSomadas) / 2;
            System.out.println("O Filme alcançou o ranking de " + mediaEmEstrelas + " Estrelas");
        }
    }


