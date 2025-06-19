//24. Jornada de trabalho
//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
// mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//
//Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário,
// que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)

package JornadaDeTrabalho;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor do salário por hora: R$ ");
        double salarioPorHora = scanner.nextDouble();


        double horasNormais = 160;
        double salarioTotal;

        if (horasTrabalhadas <= horasNormais) {

            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {

            double horasExtras = horasTrabalhadas - horasNormais;
            double valorHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasNormais * salarioPorHora) + (horasExtras * valorHoraExtra);
        }


        System.out.printf("Salário total do funcionário: R$ %.2f%n", salarioTotal);

        scanner.close();
    }
}

