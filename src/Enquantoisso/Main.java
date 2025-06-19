//Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido
// um novo valor - ou seja, para o segundo valor não pode ser aceito o
// valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

package Enquantoisso;

import javax.lang.model.util.SimpleTypeVisitor7;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        float valor1 = scanner.nextFloat();

        System.out.println("Digite o valor 2: ");
        float valor2;
        while (true) {
            valor2 = scanner.nextFloat();
          if( valor2>0){
              break; // valor válido, sai do loop
          } else {
              System.out.println("Valor inválido! Tente novamente.");
          }
        }


        float resultado = valor1/valor2;
        System.out.println(""+ resultado);


    }
}
