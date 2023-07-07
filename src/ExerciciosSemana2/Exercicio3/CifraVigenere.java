package ExerciciosSemana2.Exercicio3;

public class CifraVigenere {

    public static String cifraVigenere(String texto, String chave, boolean criptografar) {
        texto = texto.toUpperCase();
        chave = chave.toUpperCase();
        StringBuilder resultado = new StringBuilder();

        int tamanhoTexto = texto.length();
        int tamanhoChave = chave.length();

        char[][] matrizVigenere = construirMatrizVigenere();

        for (int i = 0; i < tamanhoTexto; i++) {
            char caractereTexto = texto.charAt(i);
            char caractereChave = chave.charAt(i % tamanhoChave);

            if (!Character.isLetter(caractereTexto)) {
                resultado.append(caractereTexto);
                continue;
            }

            int valorTexto = caractereTexto - 'A';
            int valorChave = caractereChave - 'A';

            char caractereCriptografado;
            if (criptografar == true) {
                caractereCriptografado = matrizVigenere[valorTexto][valorChave];
            } else {
                caractereCriptografado = descriptografarCaractere(matrizVigenere[valorChave], caractereTexto);
            }

            resultado.append(caractereCriptografado);
        }

        return resultado.toString();
    }

    private static char[][] construirMatrizVigenere() {
        char[][] matrizVigenere = new char[26][26];

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                matrizVigenere[i][j] = (char) ('A' + (i + j) % 26);
            }
        }

        return matrizVigenere;
    }

    private static char descriptografarCaractere(char[] linha, char caractere) {
        for (int i = 0; i < linha.length; i++) {
            if (linha[i] == caractere) {
                return (char) ('A' + i);
            }
        }
        return caractere;
    }
}




