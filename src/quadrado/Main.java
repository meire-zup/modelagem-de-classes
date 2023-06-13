package quadrado;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado1 = new Quadrado(5);
        System.out.println("LADO: "+quadrado1.lado);
        System.out.println("ÁREA: "+quadrado1.calculaArea());
        quadrado1.mudaValorLado(6);
        System.out.println("---------");
        System.out.println("LADO: "+quadrado1.lado);
        System.out.println("ÁREA: "+quadrado1.calculaArea());

    }

}
