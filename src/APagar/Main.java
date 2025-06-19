//18. A pagar
//Desenvolva um programa para uma revendedora de carros usados que calcula o salário final de seus funcionários vendedores.
// O algoritmo deve receber como entrada o número de carros vendidos, o valor total das vendas, o salário fixo mensal do
// vendedor e a comissão fixa por carro vendido.
//
//O salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por carro vendido e 5% do valor
// total das vendas realizadas pelo vendedor.
//
//
//Considere que o salário inicial é de R$ 5.000,00.
//O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.
package APagar;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner= new Scanner(System.in);


        double salarioFixo = 5000.00;

        System.out.print("Digite o numero de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double totalVendas = scanner.nextDouble();


        System.out.print("Digite a comissão por carro: ");
        double comissaoPorCarro = scanner.nextDouble();



        double totalComissaoFixa = carrosVendidos * comissaoPorCarro;
        double comissaoPercentual = totalVendas * 0.05;
        double salarioFinal = salarioFixo + totalComissaoFixa + comissaoPercentual;



        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Carros vendidos: %d%n", carrosVendidos);
        System.out.printf("Comissão fixa por carro: R$ %.2f%n", comissaoPorCarro);
        System.out.printf("Total da comissão fixa: R$ %.2f%n", totalComissaoFixa);
        System.out.printf("Valor total das vendas: R$ %.2f%n", totalVendas);
        System.out.printf("Comissão de 5%% sobre vendas: R$ %.2f%n", comissaoPercentual);
        System.out.printf("Salário final do vendedor: R$ %.2f%n", salarioFinal);


        scanner.close();





    }

}
