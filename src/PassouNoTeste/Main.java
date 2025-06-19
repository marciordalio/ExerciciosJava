//14 - Passou no Teste?
//Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5.
// Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S",
// o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.

package PassouNoTeste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int aprovados = 0;


        while (true) {
            float nota[] = new float[6];
            float soma = 0;

            for (int contador = 0; contador < 6; contador++) {
                System.out.println(" Digite a nota-" + (contador + 1) + ": ");
                nota[contador] = scanner.nextFloat();
                soma += nota[contador];
            }


            float media = soma / 6;

            if (media > 6.5) {
                System.out.println(" Aluno aprovado!");
                aprovados ++;
            } else {
                System.out.println("Aluno reprovado!");
            }


            System.out.print("\nCalcular a média de outro aluno? (S/N): ");
            scanner.nextLine();
            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("N")) {
                System.out.println("\nQuantidade de alunos aprovados: " + aprovados);
                break;

            }

        }


scanner.close();

    }
}

