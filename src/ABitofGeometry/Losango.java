package ABitofGeometry;

import java.util.Scanner;

public class Losango {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a diagonal maior: ");
        double diagonalMaior = scanner.nextDouble();

        System.out.println("Digite a diagonal menor: ");
        double diagonalMenor = scanner.nextDouble();

        double resultado = (diagonalMaior*diagonalMenor)/2;


        System.out.println("Sua área é área é: " + resultado);
    }
}
