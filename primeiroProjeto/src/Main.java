public  class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: John Wick 4");

        int anoDeLancamento = 2023;
        System.out.println("Ano de Lançamento: " + anoDeLancamento + "\n");
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 9.0) /3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
                    Filme Jhon Wick
                    Filme de ação
                    Muito Bom!
                    Ano de Lançamento:
                   """ + anoDeLancamento;
        System.out.println("Sinopse: " + sinopse);

        // famoso casting converte um double para number
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}