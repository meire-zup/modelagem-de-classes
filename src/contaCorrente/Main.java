package contaCorrente;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("345556-2", "Joao da Silva");

        conta1.depositoConta(500.0);
        System.out.println("-------------------------------------");
        conta1.saqueConta(200.0);

    }
}
