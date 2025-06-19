//17. Custa quanto?
//O custo de um carro novo ao consumidor é a soma do custo de fábrica com
// a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//
//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45% sobre o valor da fábrica,
// escreva um programa para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
package CustaQuanto;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do carro: ");
        double carro = scanner.nextDouble();

        System.out.println("Digite a porcentagem do distribuidor: ");
        double distribuidor = scanner.nextDouble();

        System.out.println("Digite a porcentagem dos Impostos:");
        double impostos = scanner.nextDouble();



        double valorDistribuidor = carro * distribuidor / 100;
        double valorImpostos = carro * impostos / 100;
        double custoFinal = carro + valorDistribuidor + valorImpostos;

        System.out.println("O custo final foi: "+ custoFinal);


        scanner.close();
    }
}
