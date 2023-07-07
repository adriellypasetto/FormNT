package ExerciciosSemana2.Exercicio2;

import java.util.Scanner;

public class CifraCesar {

    public static String cifraCesar(String textoEntrada, int chave, int opcao) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < textoEntrada.length(); i++) {
            char letras = textoEntrada.charAt(i);

            if (Character.isLetter(letras)) {
                char base = Character.isLowerCase(letras) ? 'a' : 'A';
                int codigo = (int) letras - base;

                if (opcao == 1) {
                    codigo = (codigo + chave) % 26;
                } else if (opcao == 2) {
                    codigo = (codigo - chave + 26) % 26;
                }

                resultado.append((char) (codigo + base));
            } else {
                resultado.append(letras);
            }
        }

        return resultado.toString();
    }
}

