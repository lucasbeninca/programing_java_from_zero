public class Condicional {
    static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento > 2024){
            System.out.println("Filme Lançamento!");
        } else {
            System.out.println("Filme Retrô");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a mais");
        }
    }

}
