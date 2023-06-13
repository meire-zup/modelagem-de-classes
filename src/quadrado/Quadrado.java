package quadrado;

public class Quadrado {
    Integer lado;

    public Quadrado(Integer lado) {
        this.lado = lado;
    }

    public void mudaValorLado(Integer lado) {
        this.lado = lado;
    }

    public Integer retornaValorLado(){

        return this.lado;
    }

    public  Integer calculaArea(){
        return this.lado * this.lado;
    }

}
