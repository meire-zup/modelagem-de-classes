package pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Paula", 15, 165.0);
        System.out.println(pessoa1.toString());
        pessoa1.peso = 60;
        System.out.println(pessoa1.toString());
        pessoa1.envelhecer(10);
        pessoa1.engordar(3);
        System.out.println(pessoa1.toString());
        pessoa1.emagrecer(10);
        System.out.println(pessoa1.toString());

    }
}
