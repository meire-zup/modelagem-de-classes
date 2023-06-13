package pessoa;

public class Pessoa {

    String nome;
    Integer idade;
    Integer peso;
    Double altura;

    public Pessoa(String nome, Integer idade, Integer peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = 0;
    }
    public void envelhecer (Integer quantidadeAnos){
        if(this.idade < 21) {
            this.altura = this.altura + (quantidadeAnos * 0.5);
        }
        this.idade = this.idade +quantidadeAnos;

    }

        public  void engordar(Integer quilo) {
        this.peso += quilo;
        }

        public void emagrecer(Integer quilo){
        this.peso -= quilo;
        }

        public void crescer(Double valorCentimetros){

            this.altura += valorCentimetros;

        }
    @Override
    public String toString() {
        return "Pessoa:\n{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}'+"\n***************************************************\n";
    }
}
