
//19. É o quê?
//Crie um programa para ler 3 valores (A, B e C) representando as medidas
// dos lados de um triângulo e escrever se formam ou não um triângulo.
//
//Obs: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.


package ÉOQuê;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor1: ");
        double valor1 = scanner.nextDouble();


        System.out.print("Digite o valor2: ");
        double valor2= scanner.nextDouble();

        System.out.print("Digite o valor3: ");
        double valor3 = scanner.nextDouble();


        double soma = valor1+valor2+valor3;

        if (valor1 < valor2 + valor3 &&
                valor2 < valor1 + valor3 &&
                valor3 < valor1 + valor2) {
            System.out.println("Os valores formam um triângulo!");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }



        }

    }
