package DeQuantoAtéQuanto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int soma = 0;
        int numeros = 0;

        // Inclui valor1 e valor2 na contagem
        for (int contador = valor1; contador <= valor2; contador++) {
            soma += contador;
            numeros++;
        }

        double media = (double) soma / numeros;

        System.out.println("A média aritmética dos números entre " + valor1 + " e " + valor2 + " é: " + media);

        scanner.close();
    }
}
