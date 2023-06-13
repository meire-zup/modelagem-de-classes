package contaCorrente;

public class ContaCorrente {

    String numeroConta;

    String nomeCorrentista;

    Double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista, Double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(String numeroConta, String nomeCorrentista) {

        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;

    }
    public void depositoConta(double valorDeposito){

        this.saldo += valorDeposito;
        System.out.println("Numero da conta: "+this.numeroConta);
        System.out.println("Correntista: "+this.nomeCorrentista);
        System.out.println("Valor do deposito: "+valorDeposito);
        System.out.println("Saldo atual: "+this.saldo);
    }


    public void saqueConta(double valorSaque) {

        this.saldo -= valorSaque;
        System.out.println("Numero da conta: "+this.numeroConta);
        System.out.println("Correntista: "+this.nomeCorrentista);
        System.out.println("Valor do saque: "+valorSaque);
        System.out.println("Saldo atual: "+this.saldo);

    }
}
