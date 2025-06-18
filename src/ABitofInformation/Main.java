//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o
// programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem
// "Olá, [NomeDoUsuario], sua idade é [idade]".
package ABitofInformation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.println("Qual é seu nome: ");
        String SeuNome = nome.nextLine();

        System.out.println("Sua idade é: ");
        Scanner idade = new Scanner(System.in);
        int SuaIdade = idade.nextInt();
        System.out.println("Olá "+SeuNome + " Sua idade é: " + SuaIdade);

    }

}
