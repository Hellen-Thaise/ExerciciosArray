//Crie um programa para exibir todos os inteiros dentro do intervalo 100-150
// cuja soma de todos os dígitos é um número par.


public class Exercicio8 {
    public static void main(String[] args) {

//        for (int i = 100; i < 150; i++) {
//            System.out.println(i);
//        }
        int num=150;
        int soma=0;
        System.out.println("Os números entre o intervalo de 100 à 150: ");
        for(int j = 100; j<=150; j++){
            System.out.println(j);
        }


        for (int i =num; i >=100 ; i--) {
            int unidade=i %10;
            int dezena=(i %100)/10;
            int centena=(i/100);
            int somaDigito=unidade+dezena+centena;
            System.out.println(i + " Soma dos digitos -> " + somaDigito);
            if (somaDigito%2==0){
                soma+=i;
            }
        }
        System.out.println("Soma dos numeros do intervalo " + soma);

    }
}