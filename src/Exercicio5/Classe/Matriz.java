package Exercicio5.Classe;

public class Matriz {

    private int numero =  3;
    private int[][] matriz =  MatrizIdentidade(numero);


    public int[][] MatrizIdentidade(int numero) {
        int[][] matriz = new int[numero][numero];

        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }

        public void imprimeMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

        }
    }

    public Matriz() {
    }

    public Matriz(int numero, int[][] matriz) {
        this.numero = numero;
        this.matriz = matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int[][] getMatriz() {
        return matriz;
    }
}

