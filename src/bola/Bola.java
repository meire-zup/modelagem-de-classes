package bola;

public class Bola {

    Double circunferencia;
    String cor;
    String marca;
    String material;
    String velocidade;

    public void trocaCor(String cor) {

        this.cor = cor;

    }

    public String mostrarCor() {

        return "A cor da bola é "+this.cor+".";

    }

    public void mostraBola() {

        System.out.println("*********************");
        System.out.println("CARACTERÍSTICAS:");
        System.out.println("CIRCUNFERENCIA: "+this.circunferencia);
        System.out.println("COR: "+this.cor);
        System.out.println("MARCA: "+this.marca);
        System.out.println("MATERIAL: "+this.material);
        System.out.println("VELOCIDADE: "+this.velocidade);
        System.out.println("*********************");

    }

}
