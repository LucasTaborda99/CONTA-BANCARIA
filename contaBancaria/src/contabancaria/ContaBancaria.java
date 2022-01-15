package contabancaria;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        // Declarando Variáveis
        // Construindo o input
        Scanner input = new Scanner(System.in);
        String aux;
        int opcao;
        double valor;

        System.out.println("Digite o nome do titular da conta: ");
        aux = input.nextLine();

        Conta novaConta = new Conta(aux);

        // Menu
        do {
            System.out.println("MENU");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Dados Bancários");
            System.out.println("2. Depósito");
            System.out.println("3. Saque");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    novaConta.DadosBancarios();
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    valor = input.nextDouble();
                    novaConta.Depositar(valor);
                    break;

                case 3:
                    System.out.println("Digite o valor de saque da conta: ");
                    valor = input.nextDouble();
                    novaConta.Sacar(valor);
                    break;

                case 0:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 0);
    }
}
