package ABitofGeometry;

import java.util.Scanner;

public class Retângulo {
     public static void main (String[] args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Digite o valor da base do retângulo: ");
         double base = scanner.nextDouble();

         System.out.println("Digite o valor da altura: ");
         double altura = scanner.nextDouble();

         double area = base*altura;

         System.out.println("A área do retângulo é: " + area);

         scanner.close();

     }
}
