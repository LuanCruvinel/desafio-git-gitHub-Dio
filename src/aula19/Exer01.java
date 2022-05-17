package aula19;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("coloque valor no vetorA da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println("valor do vetorA: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("valor do vetorB: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
