package bola;

public class Main {
    public static void main(String[] args) {
        Bola bola1 = new Bola();
        Bola bola2 = new Bola();
        bola1.circunferencia = 25.0;
        bola1.marca = "Penalty";
        bola1.material = "Sintetico";
        bola1.velocidade = "Alta";
        bola1.cor = "verde";
        System.out.println(bola1.mostrarCor());
        bola1.trocaCor("azul");
        bola1.mostraBola();

        System.out.println();

        bola2.circunferencia = 30.0;
        bola2.marca = "Adidas";
        bola2.material = "Sintetico";
        bola2.velocidade = "Baixa";
        bola2.cor = "amarela";
        System.out.println(bola2.mostrarCor());
        bola2.trocaCor("rosa");
        bola2.mostraBola();

    }
}
