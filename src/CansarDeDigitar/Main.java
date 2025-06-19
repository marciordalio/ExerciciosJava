//9 -  Cansar de Digitar
//Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os
// números informados e escreva a média aritmética desses valores lidos.

package CansarDeDigitar;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        float[] numeros = new float[10];
        float soma = 0;

        for (int contador=0; contador<10; contador ++ ){
            System.out.println("Digite o " + (contador + 1) + "º valor:");
            numeros[contador] = scanner.nextFloat();
            soma += numeros[contador];

        }

        float resultado = soma/10;
        System.out.println("A média aritimética é: "+ resultado);

    }
}
