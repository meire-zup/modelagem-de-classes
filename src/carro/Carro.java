package carro;

public class Carro {

    Integer quantidadeDePortas;

    String modelo;

    String marca;

    Double potencia;

    public Carro(Integer quantidadeDePortas, String modelo, String marca, Double potencia) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Carro(Integer quantidadeDePortas, String modelo, String marca) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public void ligarCarro() {
        System.out.println("O carro modelo "+this.modelo+" da marca "+this.marca+" com potência "+this.potencia+" acabou de ser ligado!");

    }
}
