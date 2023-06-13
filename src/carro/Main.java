package carro;

public class Main {

    public static void main(String[] args) {

    Carro carro1 = new Carro(2, "Onix", "Chevrolet", 1.0);
    Carro carro2 = new Carro(4, "HB20", "Hyundai");

    carro1.ligarCarro();
    System.out.println("-----------------------------------------------------------------------------");
    carro2.ligarCarro();

    }
}
