public class calculaCotacaoDolar {
    public static void main(String[] args) {
        double cotacaoDolar = 5.32;
        double quantidadeDedolares = 1000;
        double iof = 7.4;
        int conversaoParaReal = (int) (cotacaoDolar * quantidadeDedolares);
        double valorLiquido = conversaoParaReal - iof;

        System.out.println(valorLiquido);

    }
}
