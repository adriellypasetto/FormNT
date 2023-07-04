package ExerciciosSemana1.Exercicio3;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String textoConvertido = texto.replace(" ", "").toLowerCase();
        String textoDeTrazPraFrente = "";

        for (int i = (textoConvertido.length() - 1); i >= 0; i--) {
            textoDeTrazPraFrente += textoConvertido.charAt(i);
        }

 
        if (textoDeTrazPraFrente.equals(textoConvertido)) {
            System.out.println("A palavra " + texto + " é palindromo");
        } else {
            System.out.println("A palavra " + texto + " não é palindromo");
        }


    }
}
