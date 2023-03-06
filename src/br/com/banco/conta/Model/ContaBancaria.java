/*Crie uma classe chamada ContaBancaria.

        Nesta classe existem os atributos:
        instituição financeira
        titular da conta
        agencia
        conta
        cpf
        valor em conta
        Adicione os seguintes métodos:
        depositar dinheiro
        retirar dinheiro*/
package br.com.banco.conta.Model;

import java.sql.SQLOutput;

public class ContaBancaria {
   public String instituicaoFinanceira;
   public String titularDaConta;
   public String agencia;
   public String conta;
   public String cpf;
   public double valorEmConta;

    public ContaBancaria(String instituicaoFinanceira, String titularDaConta, String agencia, String conta, String cpf, double valorEmConta) {
        this.instituicaoFinanceira = instituicaoFinanceira;
        this.titularDaConta = titularDaConta;
        this.agencia = agencia;
        this.conta = conta;
        this.cpf = cpf;
        this.valorEmConta = valorEmConta;
    }

    public void depositar ( double valor){
        valorEmConta += valor;
        System.out.print("Deposito realizado com sucesso!");
    }

    public void sacar ( double valor){
        if (valor <= valorEmConta) {
            valorEmConta -= valor;
            System.out.printf("Operação concluida!");
        } else{
            System.out.printf("Saldo insuficiente");
        }
    }

    public void transferir(){}
    }


