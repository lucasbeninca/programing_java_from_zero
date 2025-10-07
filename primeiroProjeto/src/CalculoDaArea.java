import java.util.Scanner;

public class CalculoDaArea {
    static void main(String[] args) {
        double pi = 3.14;

        System.out.println("Bem vindo para calcular a área do Quadrado digite: 1 para calcular a área do circulo digite: 2");
        Scanner input = new Scanner(System.in);
        int opcaoEscolhida = input.nextInt();
        if(opcaoEscolhida == 1){
            System.out.println("Vamos calcular a área do circulo digite o raio: ");
            double raio = input.nextDouble();
            double area = (pi * (raio * raio));
            System.out.println("A área do circulo é " + area);
        } else if(opcaoEscolhida == 2){
            System.out.println("Vamos calcular a ára de um quadrado digite o lado: ");
            double lado = input.nextDouble();
            double area = (lado * lado);
            System.out.println("A área do quadrado é " + area);

        }
    }
}
