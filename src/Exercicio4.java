import java.util.*;

//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
// Fazer um algoritmo que calcule e escreva:
// a. a maior e a menor altura do grupo;
// b. média de altura dos homens;
// c. o número de mulheres.
public class Exercicio4 {

    public static void main(String[] args) {

        ArrayList<String> sexo = new ArrayList<>();

        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("masculino");
        sexo.add("feminino");
        sexo.add("feminino");

        ArrayList<Double> altura = new ArrayList<>();

        altura.add(1.57);
        altura.add(1.60);
        altura.add(1.91);
        altura.add(1.95);
        altura.add(1.50);
        altura.add(1.65);
        altura.add(1.87);
        altura.add(1.55);
        altura.add(1.80);
        altura.add(1.61);

        Collections.sort(altura);
        System.out.println(altura);

        double menor = altura.get(0);
        double maior = altura.get(9);

        System.out.println("A menor altura é: " + menor);
        System.out.println("A maior altura é: " + maior);

        double soma = 0;
        for (int i =0; i < altura.size(); i++ ){
            soma = soma + altura.get(i);
        }
        System.out.println("A média de altura do sexo masculino é: " + (soma/10));

        int mulher = 0;
        for (int j=0; j < sexo.size(); j++){
            if(sexo.get(j)=="feminino"){
                mulher++;
            }
        }
        System.out.println("O número de mulheres é: " + mulher);













    }
}