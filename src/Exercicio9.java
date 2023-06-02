//Crie um programa para exibir a soma de 20 números usando uma matriz

public class Exercicio9 {
    public static void main(String[] args) {

        int matriz[][] = new int[4][5];
        int soma = 0;

        matriz[0][0] = 10;
        matriz[0][1] = 9;
        matriz[0][2] = 5;
        matriz[0][3] = 6;
        matriz[0][4] = 5;

        matriz[1][0] = 8;
        matriz[1][1] = 6;
        matriz[1][2] = 4;
        matriz[1][3] = 3;
        matriz[1][4] = 2;

        matriz[2][0] = 11;
        matriz[2][1] = 5;
        matriz[2][2] = 6;
        matriz[2][3] = 7;
        matriz[2][4] = 8;

        matriz[3][0] = 1;
        matriz[3][1] = 4;
        matriz[3][2] = 6;
        matriz[3][3] = 2;
        matriz[3][4] = 8;

//
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                soma += matriz[linha][coluna];

            }
            System.out.println(soma);
        }
    }
}