//15 - Uma Brincadeira Sobre Alturas
//Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.
//
//Construa um programa que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.
package UmaBrincadeiraSobreAlturas;

public class Main {
    public static void main (String[] args){

        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;
        int anos =0;

        while (alturaFelisberto<=alturaAnacleto){
            alturaFelisberto += 0.3;
            alturaAnacleto += 0.2;
            anos ++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Felisberto seja mais alto que Anacleto.");

    }
}
