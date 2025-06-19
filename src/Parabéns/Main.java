
// 10 - Parabéns
//Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre
// e a seguinte mensagem:
// PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

package Parabéns;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);


        float nota[] = new float[4];
        float soma =0;

        for(int contador=0; contador<4; contador++ ){
            System.out.println(" Digite a nota-" + (contador+1)+ ": ");
            nota[contador] = scanner.nextFloat();
            soma += nota[contador];
        }



        float media = soma/4;

        if(media>6){
            System.out.println(" PARABÉNS! Você foi aprovado!");
        }else{
            System.out.println("Você foi reprovado!");
        }
    }
}
