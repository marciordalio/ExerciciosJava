package ABitofGeometry;
import java.util.Scanner;

public class Quadrado {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();

        double resultado = lado1*lado2;


        System.out.println("Sua área é: " + resultado);



    }
}
