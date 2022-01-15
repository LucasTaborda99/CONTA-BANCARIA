package contabancaria;

public class Conta {

// Declarando as variáveis
    String titular;
    int numero;
    float saldo = 0;
    int qtdContas;

// Método Construtor
    public Conta(String pTitular) {
        this.titular = pTitular;
        qtdContas++;
        this.numero = qtdContas;
        this.saldo = 0;
    }

    public void DadosBancarios() {
        System.out.println("----- Dados Bancários -----");
        System.out.println("-Número: " + this.numero);
        System.out.println("-Titular: " + this.titular);
        System.out.println("-Saldo: " + this.saldo);
        System.out.println("--- Fim Dados Bancários ---");
        System.out.println("");
    }

    public void Depositar(double valor) {
        System.out.println("");
        System.out.println(" ----- Realizando o Depósito -----");
        System.out.println("Saldo Anterior: " + this.saldo);
        this.saldo += valor;
        System.out.println("Saldo Atual: " + this.saldo);
        System.out.println("--- Fim do Depósito ---");
        System.out.println("");
    }

    public void Sacar(double valor) {
        System.out.println("");
        System.out.println(" ----- Realizando o Saque -----");
        System.out.println("Saldo Anterior: " + this.saldo);
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
        System.out.println("Saldo Atual: " + this.saldo);
        System.out.println("--- Fim do Saque ---");
        System.out.println("");
    }
}
