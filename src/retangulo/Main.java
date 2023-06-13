package retangulo;

import quadrado.Quadrado;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(5, 10);
        System.out.println("LADO A: "+retangulo.retornaValorDoLadoA());
        System.out.println("LADO B: "+retangulo.retornaValorDoLadoB());
        System.out.println("ÁREA: "+retangulo.calculaArea());
        System.out.println("PERÍMETRO: "+retangulo.calculaPerimetro());

        retangulo.mudaValorLados(6, 12);
        System.out.println("--------------");

        System.out.println("LADO A: "+retangulo.retornaValorDoLadoA());
        System.out.println("LADO B: "+retangulo.retornaValorDoLadoB());
        System.out.println("ÁREA: "+retangulo.calculaArea());
        System.out.println("PERÍMETRO: "+retangulo.calculaPerimetro());


    }
}
