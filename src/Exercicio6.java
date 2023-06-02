//Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7


import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para verificarmos se é multiplo de 5 ou 7: ");
        int number = entrada.nextInt();

        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("O número " + number + " é multiplo de 5 e 7");
        } else if
        (number % 5 == 0) {
            System.out.println("O número " + number + " é multiplo de 5");
        } else if (number % 7 == 0) {
            System.out.println("O número " + number + " é multiplo de 7");
        } else {
            System.out.println("O número " + number + " não é multiplo de 5 e 7");
        }

    }
}
