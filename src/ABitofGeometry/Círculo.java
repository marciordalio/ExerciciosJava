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
