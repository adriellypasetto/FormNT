package ExerciciosSemana1.Exercicio2;

public class NumerosPrimos {

    public static void main(String[] args) {
        int numero = 1000;
        for (int i = 2; i <= numero; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        }
    }
}
