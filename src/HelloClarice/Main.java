package HelloClarice;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //chamamos ela de nome
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();  //  é o símbolo que diz “vou guardar o que está do lado direito
        // dentro da variável que está do lado esquerdo guardar o que o user digitou dentro de NOME

        System.out.println("Seu nome è: " + nome);

    }


}
