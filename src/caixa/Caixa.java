package caixa;

public class Caixa {

    Double saldo;

    public Caixa() {

        this.saldo = 1000.0;

    }

    public void credito(Double valor){

        this.saldo = this.saldo + valor;
    }
    public void debito(Double valor){

        this.saldo = this.saldo - valor;
    }


}
