import java.util.Scanner;

public class VerificaSeONumeroEPositivo {
    static void main(String[] args) {
        System.out.println("Digite um número para verificar se ele é positivo: ");
        Scanner input = new Scanner(System.in);
        int numeroDigitado = input.nextInt();

        if (numeroDigitado >= 0){
            System.out.println("O Número Digitado é positivo");
        }else {
            System.out.println("O Número Digitado é negativo");
       }

    }
}
