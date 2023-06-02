//Criar um programa que calcule a média de salários de uma empresa,
//pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);

        Map<String,Double> funcionarios = new HashMap<>();

        System.out.println(" .................................. ");
        System.out.println("Qual o número de funcionários da empresa: ");

        int qtdFun = entrada_do_usuario.nextInt();
        double sama = 0;
        double media = 0;

        for (int i = 0; i < qtdFun; i++){
            System.out.println("Digite o nome do " + (i + 1) + "°" + " funcionário: ");
            String nomeFun = entrada_do_usuario.next();
            System.out.println("Digite o salário do " + (i + 1) + "°" + " funcionário: ");
            double valorFun = entrada_do_usuario.nextDouble();

            funcionarios.put(nomeFun,valorFun);
            sama += valorFun;
            media = sama / qtdFun;

        }

        System.out.println("A grade de funcionários é: " + funcionarios);
        System.out.println("A média salarial dos funcionários é: " + media);
        }
    }

