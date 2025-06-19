//11 - BOOOOMMM
//Crie uma bomba relógio (usando somente código - para deixar claro!)
// cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e
// no final da repetição escreva "EXPLOSÃO".

package BOOOOMMM;

public class Main {
    public static void main (String[] args){
        for(int contador=0; contador<30; contador++){
            System.out.println(contador+1);
        }

        System.out.println("EXPLOSÃO");
    }

}
