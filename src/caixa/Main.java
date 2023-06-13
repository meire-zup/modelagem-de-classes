package caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Caixa caixa = new Caixa();
        System.out.println(caixa.saldo);

        System.out.println("Informe a quantidade de lançamentos que deseja realizar:");

        int quantidadeLancamento;

        do {

            quantidadeLancamento = scanner.nextInt();

            if (quantidadeLancamento <= 0){
                System.out.println("Valor inválido!");
            }

        } while (quantidadeLancamento <= 0);

        for (int i = 0; i < quantidadeLancamento ; i++) {

            int tipoLancamento;

            do {
                System.out.println("Informe 1 para credito ou 2 para debito");
                tipoLancamento = scanner.nextInt();

                if (tipoLancamento < 1 || tipoLancamento > 2) {
                    System.out.println("Valor inválido!");
                }

            } while (tipoLancamento < 1 || tipoLancamento > 2);

            System.out.println("Informe o valor do lançamento: ");
            double valorLancamento = scanner.nextDouble();

            if(tipoLancamento == 2 && caixa.saldo > valorLancamento){

                caixa.debito(valorLancamento);

            } else if (tipoLancamento == 2 && caixa.saldo < valorLancamento){

                System.out.println("SALDO INSUFICIENTE!");

            } else {

                caixa.credito(valorLancamento);

            }

        }

        System.out.println("SALDO FINAL: "+caixa.saldo);

    }
}
