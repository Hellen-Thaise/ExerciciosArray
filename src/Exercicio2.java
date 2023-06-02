//Escreva um programa para inserir um elemento (posição específica) em uma lista.

import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        // adiciona itens na lista
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Fernanda");
        nomes.add("José");
        nomes.add("Luiza");

        // Colocamos o número do elemento que desejamos adicionar e o elemento
        nomes.add(5, "Hellen");

        System.out.println("Os elementos adicionado foram: " + nomes );

        System.exit(0);
    }

    }

