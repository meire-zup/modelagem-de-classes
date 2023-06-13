package jardinagem;

public class Jardinagem {

    String nomeJardim;

    Integer qtdMetros;

    Integer qtdPlantas;

    Integer qtdMetrosGrama;

    Integer gramaAdubo;

    Double valorAdubo;

    Double valorMetroGrama;

    Double valorCorteGrama;

    public Jardinagem(String nomeJardim, Integer qtdMetros, Integer qtdPlantas, Integer qtdMetrosGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
    }

    public Double usarAdubo() {
          double qtdAduboUsar = this.qtdMetrosGrama * 50;
          return qtdAduboUsar;
    }

    public Double precoAdubo(){

        double quantidadeDeCaixaAdubo = (usarAdubo() / 1000);
        int quantidadeDeCaixaAduboArredondado = (int) Math.ceil(quantidadeDeCaixaAdubo);

        return quantidadeDeCaixaAduboArredondado * this.valorAdubo;

    }

    public Double precoCorteGrama(){
        this.valorCorteGrama = this.qtdMetrosGrama * this.valorMetroGrama;
        return valorCorteGrama;

    }

}
