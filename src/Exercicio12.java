// Ler um vetor A com 20 elementos. Construir dois vetores B e C,
// sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.

import java.util.Random;

public class Exercicio12 {
    public static void main(String[] args) throws Exception {
        Random r = new Random();

        int pares = 0, impares = 0;
        int[] vetorA = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            if ((vetorA[i] = r.nextInt(10)) % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        int[] vetorB = new int[pares];
        int[] vetorC = new int[impares];

        int par = 0, impar = 0;

        for (int n : vetorA) {
            if (n % 2 == 0) {
                vetorB[par++] = n;
            } else {
                vetorC[impar++] = n;
            }
        }

        System.out.println("Total nº par: " + pares);
        System.out.println("Total nº impar: " + impares);

        System.out.print("\nVetor A - ");
        for (int i : vetorA) {
            System.out.print(i + " ");
        }

        System.out.print("\nVetor B - ");
        for (int i : vetorB) {
            System.out.print(i + " ");
        }

        System.out.print("\nVetor C - ");
        for (int i : vetorC) {
            System.out.print(i + " ");
        }
    }
}
