package Exercicio4.Main;

import Exercicio4.Classes.Motorista;

public class MotoristaTest {
    public static void main(String[] args) {

        Motorista maria = new Motorista(
                "Maria",
                "144212",
                "154564",
                28,
                "Motorista",
                1500,
                "456464",
                "ABC1024");

        Motorista joao = new Motorista(
                "Joao",
                "2552222",
                "555555",
                50,
                "Motorista",
                1500,
                "888999",
                "ABC1010");

        maria.imprime();
        joao.imprime();
    }
}
