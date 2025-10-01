import java.util.Scanner;

public class LeituraDeDados {
    static void main(String[] args) {
        Scanner inputDeDados = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String nomeFilm = inputDeDados.nextLine();
        System.out.println(nomeFilm);
        System.out.println("Qual ano de lancamento? ");
        int anoDeLancamento = inputDeDados.nextInt();
        System.out.println("Qual nota você da para o filme? ");
        double notaParaOFilme = inputDeDados.nextDouble();

        System.out.println(nomeFilm);
        System.out.println(anoDeLancamento);
        System.out.println(notaParaOFilme);


    }
}
