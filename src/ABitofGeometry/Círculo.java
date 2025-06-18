//Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas
// respectivas áreas. O usuário irá informar
// os valores de cada variável. Crie um arquivo para cada fórmula e poste os  arquivos no GitHub. Link do repositório abaixo.
package ABitofGeometry;

import java.util.Scanner;

public class Círculo {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu raio: ");
        double raio = scanner.nextDouble();

        double resultado = (raio*raio)*Math.PI;

        System.out.println("Sua área é: " + resultado);




    }
}
