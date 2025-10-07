import java.util.Scanner;

public class VerificaParOuImpar {
    static void main(String[] args) {
        System.out.println("Digite um numero par ou impar: ");
        Scanner input = new Scanner(System.in);
        int numeroDigitado = input.nextInt();

        if(numeroDigitado % 2 == 0){
            System.out.println("O Número é par!");
        }else {
            System.out.println("O Número é impar!");
        }
    }
}
