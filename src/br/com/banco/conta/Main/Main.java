/*Para fazer a transferência deve pedir para o usuário digitar os dados da conta: agencia, conta, cpf, se existir uma conta com esses dados, deve realizar a transferência
senão, deve avisar que não foi possível realizar a transferência.*/

package br.com.banco.conta.Main;

import br.com.banco.conta.Model.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Bradesco", "Aryelle", "1594", "1001871-4", "12345678910", 1000);
        ContaBancaria contaBancaria2 = new ContaBancaria("Banco do Brasil", "Pedro", "1064", "145789-7", "98765432110", 1000);

        ContaBancaria listaDeContasBancarias[] = new ContaBancaria[2];
        listaDeContasBancarias[0] = contaBancaria1;
        listaDeContasBancarias[1] = contaBancaria2;

        System.out.printf("1 - Depositar;" +
                "2 - transferir;" +
                "3 - sacar.");

        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.nextLine();

        System.out.print("Digite a agência: ");
        String agenciaCorrespondente = scanner.next();
        System.out.print("Digite a conta: ");
        String contaCorrespondente = scanner.next();
        System.out.print("Digite o CPF: ");
        String cpfCorrespondente = scanner.next();

        for (int i = 0; i < listaDeContasBancarias.length; i++){
            if (listaDeContasBancarias[i].agencia.equals(agenciaCorrespondente) && listaDeContasBancarias[i].conta.equals(contaCorrespondente) && listaDeContasBancarias[i].cpf.equals(cpfCorrespondente)){
                if (opcao == "1"){
                    System.out.print("Digite o valor a depositar: ");
                    double valor = scanner.nextDouble();
                    listaDeContasBancarias[i].valorEmConta += valor;
                } else if(opcao == "2"){

                }


        }

    }
}


/*

        System.out.printf("Digite a Agência:");

                Scanner x = new Scanner(System.in);
                String numeroDaAgencia = x.nextLine();

                System.out.printf("Digite a Conta:");

                Scanner y = new Scanner(System.in);
                String numeroDaConta = y.nextLine();

                System.out.printf("Digite o CPF:");

                Scanner z = new Scanner(System.in);
                String numeroDoCPF = z.nextLine();*/