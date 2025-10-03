import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem Vindo ao Calculadora escolha a operacão 1-Soma , 2-Subtracão , 3-Divisão , 4-Multiplicacão ou 5-Para Sair");
        int operacao = input.nextInt();
        System.out.println("Digite o primeiro numero: ");
        double primeiro = input.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double segundo = input.nextDouble();

        switch (operacao) {
            case 1:
                double soma =  primeiro + segundo;
                System.out.println("O Resultado da soma é: " + soma);
                break;
            case 2:
               double  subtracao =  primeiro - segundo;
                System.out.println("O Resultado da Subtracão é: " + subtracao);
                break;
            case 3:
                double multiplicacao =  primeiro * segundo;
                System.out.println("O Resultado da Multiplicacão é: " + multiplicacao);
                break;
            case 4:
                double divisao =  primeiro / segundo;
                System.out.println("O Resultado da Divisão é: " + divisao);
                break;
            case 5:
                break;

        }






    }
}
