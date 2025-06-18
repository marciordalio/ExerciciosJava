
//6.1 - Qual o maior? (4 vezes pior)
//Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.

package QualOMaiorDois;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor1: ");
        float valor1 = scanner.nextFloat();

        float valor2;
        while(true) {
            System.out.println("Digite o valor2: ");
            valor2 = scanner.nextFloat();
            if (valor2 == valor1) {
                System.out.println("Valor repetido! Tente novamente.");
            } else {
                break;
            }
        }

        float valor3;
        while(true) {
            System.out.println("Digite o valor3: ");
            valor3 = scanner.nextFloat();
            if (valor3 == valor1 || valor3 == valor2) {
                System.out.println("Valor repetido! Tente novamente.");
            } else {
                break;
            }
        }

        float valor4;
        while(true) {
            System.out.println("Digite o valor4: ");
            valor4 = scanner.nextFloat();
            if (valor4 == valor1 || valor4 == valor2) {
                System.out.println("Valor repetido! Tente novamente.");
            } else {
                break;
            }
        }



        float maior;

        if (valor1 > valor2 && valor1 > valor3 && valor1>valor4) {
            maior = valor1;

        } else if (valor2 > valor1 && valor2 > valor3 && valor2>valor4) {
            maior = valor2;

        } else if (valor3>valor1 && valor3>valor2 && valor3>valor4){
            maior = valor3;
        }else{
            maior = valor4;

        }

        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
