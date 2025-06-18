
//5 - 1, 2 e 3
//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
package UmDoisETres;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu numero: ");
        double numero = scanner.nextDouble();

        if(numero>0){
            System.out.println("Seu numero é positivo");
        }else if(numero<0){
            System.out.println("Seu numero é negativo");
        }else{
            System.out.println("Seu numero é neutro");
        }

    }
}
