package jardinagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jardinagem jardinagem = new Jardinagem("Jardim Tropical", 100, 30, 50);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do preço do adubo (caixa de 1 kg):");


        jardinagem.valorAdubo = scanner.nextDouble();

        System.out.println("Quantidade de adubo usado para "+ jardinagem.qtdMetrosGrama+" m² de grama: "+jardinagem.usarAdubo()+" g");

        System.out.printf("Preço total de adubo para %d m² de grama: R$ %,.2f\n", jardinagem.qtdMetrosGrama, jardinagem.precoAdubo());

        jardinagem.valorMetroGrama = 2.0;

        System.out.printf("Preço do corte da grama: R$ %,.2f\n", jardinagem.precoCorteGrama());

    }
}
