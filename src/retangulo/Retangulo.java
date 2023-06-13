package retangulo;

public class Retangulo {

    Integer ladoA;
    Integer ladoB;

    public Retangulo(Integer ladoA, Integer ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void mudaValorLados(Integer ladoA, Integer getLadoB){

        this.ladoA = ladoA;
        this.ladoB = ladoB;

    }

    public  Integer retornaValorDoLadoA(){

      return  this.ladoA;

    }
    public  Integer retornaValorDoLadoB(){

        return  this.ladoB;
    }

    public Integer calculaArea(){

        return ladoA * ladoB;

    }

    public Integer calculaPerimetro(){

        return (2 * ladoA) + (2 * ladoB);

    }

}
