public class SwitchCase {
    static void main(String[] args) {
        int anoDeLancamento = 2021;
        switch (anoDeLancamento) {
            case 2021:
                System.out.println(anoDeLancamento + "\n");
                break;
            case 2022:
                System.out.println(anoDeLancamento + "\n");
                break;
            case 2024:
                System.out.println(anoDeLancamento + "\n");
                break;

            default:
                System.out.println("Nenhuma das opções possiveis");
                break;
        }

        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
