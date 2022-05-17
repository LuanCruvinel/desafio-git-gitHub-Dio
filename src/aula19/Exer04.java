package aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("coloque valor nas posições " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println("mostrar valore do VetorA ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("mostrar valore do VetorB ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }

        System.out.println();
    }
}
