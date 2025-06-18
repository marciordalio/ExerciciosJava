//7.1 - 5 vezes?
//Faça um programa que leia 5  valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.

package cincovezes;

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

        float valor4;
        while (true) {
            System.out.println("Digite o valor4: ");
            valor4 = scanner.nextFloat();
            if (valor4 == valor1 || valor4 == valor2) {
                System.out.println("Valor repetido! Tente novamente.");
            } else {
                break;
            }
        }

        float valor5;
        while (true) {
            System.out.println("Digite o valor5: ");
            valor5 = scanner.nextFloat();
            if (valor5 == valor1 || valor5 == valor2) {
                System.out.println("Valor repetido! Tente novamente.");
            } else {
                break;
            }
        }






        float menor;
        if (valor1 < valor2 && valor1 < valor3 && valor1<valor4 && valor1<valor5) {
            menor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3 && valor2<valor4 && valor2<valor5) {
            menor = valor2;
        } else if(valor3 < valor1 && valor3 < valor2 && valor3<valor4 && valor3<valor5){
            menor = valor3;
        }else if(valor4 < valor1 && valor4 < valor2 && valor4<valor3 && valor4<valor5){
            menor = valor4;
        }else{
            menor= valor5;
        }

        float Resultado = (valor1 + valor2 + valor3 + valor4+ valor5) - menor;
        System.out.println("A soma dos numeros é: "+ Resultado);

    }

}