//7 - Qual o quê?
//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
package Qualoquê;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor1: ");
        float valor1 = scanner.nextFloat();

        float valor2;
        while (true) {
            System.out.println("Digite o valor2: ");
            valor2 = scanner.nextFloat();
            if (valor2 == valor1) {
                System.out.println("Valor repetido! Tente novamente.");
            } else {
                break;
            }
        }

        float valor3;
        while (true) {
            System.out.println("Digite o valor3: ");
            valor3 = scanner.nextFloat();
            if (valor3 == valor1 || valor3 == valor2) {
                System.out.println("Valor repetido! Tente novamente.");
            } else {
                break;
            }
        }

        float menor;
        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
        } else {
            menor = valor3;
        }

        float Resultado = (valor1 + valor2 + valor3) - menor;
        System.out.println("A soma dos numeros é: "+ Resultado);

    }

}