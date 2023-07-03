package Exercicio1;

public class NumerosPares {

    public static void main(String[] args) {
        int numero = 100;
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
// Para cada numero entre 0 e o  valor informado na variavel número, divide por 2 e se o resto da divisão for 0, significa que é par.
