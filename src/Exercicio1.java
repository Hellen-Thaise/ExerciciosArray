//Escreva um programa para remover um elemento específico de uma lista.

import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {
                // cria uma ArrayList que conterá strings
                ArrayList<String> nomes = new ArrayList<String>();

                // adiciona itens na lista
                nomes.add("Pedro");
                nomes.add("Maria");
                nomes.add("Fernanda");
                nomes.add("José");
                nomes.add("Luiza");

                // Colocamos o número do elemento que desejamos remover
                String elem = nomes.remove(3);

                System.out.println("O elemento removido foi: "
                        + elem);

                System.exit(0);
            }
        }





