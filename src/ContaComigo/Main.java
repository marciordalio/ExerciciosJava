//22. Conta comigo
// Escreva um algoritmo que imprima as seguintes seqüências de números:
//
//(1, 1 2 3 4 5 6 7 8 9 10)
//(2, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
//(3, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
//
//E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20.

package ContaComigo;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){


        int contador = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");


            for (int j = 0; j < 10; j++) {
                System.out.print(contador);
                if (j < 9) {
                    System.out.print(" ");
                }

                contador++;
            }
            System.out.println(")");
        }
    }
}




