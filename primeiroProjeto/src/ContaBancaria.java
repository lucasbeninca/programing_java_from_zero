import java.util.Scanner;
import java.util.InputMismatchException;


public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 2500.0;
        int opcao = 0;

        do {
            System.out.println("\n************************");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Realizar Transferência");
            System.out.println("4 - Sair");
            System.out.println("************************");
            System.out.print("Escolha sua opção: ");

            try {
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Seu saldo atual é: R$ " + saldo);
                        break;

                    case 2:
                        System.out.println("Digite o valor a Receber:");
                        double valorAReceber = input.nextDouble();
                        input.nextLine();

                        if (valorAReceber > 0) {
                            saldo += valorAReceber;
                            System.out.println("Depósito realizado! Seu novo saldo é: R$ " +  saldo);
                        } else {
                            System.out.println("Valor inválido.");
                        }
                        break;

                    case 3:
                        System.out.println("Digite o valor a Transferir:");
                        double valorATransferir = input.nextDouble();
                        input.nextLine();

                        if (valorATransferir > saldo) {
                            System.out.println("Saldo insuficiente!");
                        } else if (valorATransferir <= 0) {
                            System.out.println("Valor de transferência inválido.");
                        } else {
                            saldo -= valorATransferir;
                            System.out.println("Transferência realizada! Seu novo saldo é: R$ " +  saldo);
                        }
                        break;

                    case 4:
                        System.out.println("Obrigado por utilizar nosso sistema. Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida! Por favor, escolha um número de 1 a 4.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Você deve digitar um número! Tente novamente.");
                input.nextLine();
                opcao = 0;
            }

        } while (opcao != 4);

        input.close();
    }
}