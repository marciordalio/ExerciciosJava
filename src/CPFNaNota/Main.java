//20. CPF na nota?
//Faça um programa para ler:
//O nome do produto,
//A quantidade adquirida do produto,
//O preço unitário do produto.
//Agora o programa deve calcular e escrever:
//O valor da venda (valor da venda = quantidade adquirida * preço unitário),
//O percentual de desconto,
//O valor fixo de imposto que é 20%.
//O total a pagar (total a pagar = valor da venda - desconto).
//Sabendo-se que:
//Se quantidade <= 5 o desconto será de 2%
// -
//Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// -
//Se quantidade > 10 o desconto será de 5%
//No fim, escreva um recibo que detalhe a compra como uma nota fiscal.

package CPFNaNota;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.next();

        System.out.print("Digite a quantidade adquirida do produto: ");
        int quantidadeProduto = scanner.nextInt();


        System.out.print("Digite o preço unitário de cada produto: ");
        double precoUnitario = scanner.nextDouble();


        double valorVenda = quantidadeProduto*precoUnitario;



        double percentualDesconto;
        if (quantidadeProduto <= 5) {
            percentualDesconto = 0.02;
        } else if (quantidadeProduto <= 10) {
            percentualDesconto = 0.03;
        } else {
            percentualDesconto = 0.05;
        }




        double valorDesconto = valorVenda * percentualDesconto;


        double valorImposto = valorVenda * 0.20;


        double totalPagar = valorVenda - valorDesconto + valorImposto;

        System.out.print("O valor total a pagar é: "+ totalPagar);







    }
}
