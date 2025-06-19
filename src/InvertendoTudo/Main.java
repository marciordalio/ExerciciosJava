//25. Invertendo tudo
//Escreva um programa que para ler doze números informados pelo usuário e que serão armazenados em um vetor/array.
//
//No fim o programa deve dar duas saídas:
//1) o programa deve processar os dados invertendo a posição dos elementos trocando o primeiro elemento com
// o último, o segundo com penúltimo etc.
//2) o programa deve processar os dados invertendo a posição dos elementos trocando, mas separando os dados por tipo.
//
//Exemplo:
//Usuário informa: A, 1, B, 2, C, 3 D, 4, E, 5, F, 6
//Saída 1:  6, F, 5, E, 4, D, 3, 2, B, 1
//Saída 2:  6, 5, 4, 3, 2, 1 - F, E, D, C, A, B
package InvertendoTudo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> dados = new ArrayList<>();

        System.out.println("Digite 12 valores (letras ou números):");
        for (int i = 0; i < 12; i++) {
            dados.add(scanner.next());
        }


        System.out.print("Saída 1: ");
        for (int i = dados.size() - 1; i >= 0; i--) {
            System.out.print(dados.get(i));
            if (i > 0) System.out.print(", ");
        }
        System.out.println();


        ArrayList<String> numeros = new ArrayList<>();
        ArrayList<String> letras = new ArrayList<>();

        for (String item : dados) {
            if (item.matches("\\d+")) {
                numeros.add(item);
            } else {
                letras.add(item);
            }
        }

        Collections.reverse(numeros);
        Collections.reverse(letras);

        System.out.print("Saída 2: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) System.out.print(", ");
        }

        System.out.print(" - ");

        for (int i = 0; i < letras.size(); i++) {
            System.out.print(letras.get(i));
            if (i < letras.size() - 1) System.out.print(", ");
        }

        scanner.close();
    }
}

