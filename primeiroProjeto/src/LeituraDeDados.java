import java.util.Scanner;

public class LeituraDeDados {
    static void main(String[] args) {
        Scanner inputDeDados = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String nomeFilm = inputDeDados.nextLine();
        System.out.println(nomeFilm);
    }
}
