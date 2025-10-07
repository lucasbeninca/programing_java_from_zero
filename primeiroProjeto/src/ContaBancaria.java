import java.util.Scanner;

public class ContaBancaria {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 2500.00;
        String nome = "Teste CRU";
        System.out.println("************************\n\n");
        System.out.println("Olá " + nome + "!");
        System.out.println("O Seu saldo é: " + saldo);
        System.out.println("************************\n\n");
        System.out.println("Operações: \n");
        System.out.println("1 - Consultar Saldos");
        System.out.println("2 - Receber Valor");
        System.out.println("3 - Realizar Transferencia");
        System.out.println("4 - Sair");

        int opcao = input.nextInt();


    }
}
