package DescansoMerecido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do empregado: ");
        int numeroDoEmpregado = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.println("\n=== DADOS DO EMPREGADO ===");
        System.out.println("Número do empregado: " + numeroDoEmpregado);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        // Verificar regras para aposentadoria
        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Resultado: Requerer aposentadoria");
        } else {
            System.out.println("Resultado: Não requerer");
        }

        scanner.close();
    }
}
