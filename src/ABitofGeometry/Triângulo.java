package ABitofGeometry;
import java.util.Scanner;

public class Triângulo {
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite sua base: ");
        double base = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double resultado =(base*altura)/2;

        System.out.println("Sua área é: " + resultado);



    }
}
