package ABitofGeometry;
import java.util.Scanner;

public class Trapézio {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base maior: ");
        double baseMaior = scanner.nextDouble();

        System.out.println("Digite a base menor: ");
        double baseMenor = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double area = (baseMaior + baseMenor) * altura / 2;

        System.out.println("A área do seu Trapézio é: " + area);


   scanner.close();

    }
}
