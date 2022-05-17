package aula19;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("coloque valor no VetorA: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
        System.out.println("Mostrando o VetorA");
        for (int j : vetorA) {
            System.out.print(j + " ");

        }
        System.out.println();

        System.out.println("Mostrando o VetorB");
        for (int j : vetorB) {
            System.out.print(j + " ");

        }

    }
}
