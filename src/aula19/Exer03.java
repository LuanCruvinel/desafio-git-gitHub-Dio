package aula19;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];
        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("coloque valor no VetorA: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.println("Mostrando o VetorA");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Mostrando o VetorB");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");

        }
        System.out.println();
    }
}