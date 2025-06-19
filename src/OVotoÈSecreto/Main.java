//16. O Voto é secreto
//Escreva um programa para ler:
//o número total de eleitores de um município.
//Agora o programa deve receber a quantindade (percentual):
//o número de votos brancos;
//o número de votos válidos;
//o número de votos nulos.
//Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos)
// representa em relação ao total
//de eleitores.
package OVotoÈSecreto;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o numero de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.println("Digite o numeros de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.println("Digite o numeros de votos válidos: ");
        int votosValidos = scanner.nextInt();

        System.out.println("Digite o numeros de votos Nulos: ");
        int votosNulos = scanner.nextInt();

        int somaDosVotos = votosBrancos+votosNulos+votosValidos;

        if(somaDosVotos >totalEleitores){
            System.out.println("A soma dos votos é maior que o total de eleitores!");
        }else{
            double porcentualBranco = (double) votosBrancos/totalEleitores*100;
            double porcentualNulo = (double) votosNulos/totalEleitores*100;
            double porcentualValidos =(double) votosValidos/totalEleitores*100;

            System.out.println("Porcentual de Votos Brancos: "+ porcentualBranco);
            System.out.println("Porcentual de Votos Nulos: "+ porcentualNulo);
            System.out.println("Porcentual de Votos Válidos: "+ porcentualValidos);
        }

    }
}
