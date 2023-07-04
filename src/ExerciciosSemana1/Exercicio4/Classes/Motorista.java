package ExerciciosSemana1.Exercicio4.Classes;

public class Motorista extends Funcionario {
    private String cnh;
    private String placaCarro;

    public Motorista() {

    }

    public Motorista(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
        super(nome, cpf, rg, idade, cargo, salario);
        this.cnh = cnh;
        this.placaCarro = placaCarro;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "cnh='" + cnh + '\'' +
                ", placaCarro='" + placaCarro + '\'' +
                '}';
    }
public void imprime(){
    System.out.println("-------------------------------");
    System.out.println("Nome: " +this.getNome());
    System.out.println("Cargo: " + this.getCargo());
    System.out.println("Número da CNH:" + this.getCnh());
    System.out.println("Sálario: " + this.getSalario());
    System.out.println("Placa do carro: " +this.getPlacaCarro());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Número do RG: " + this.getRg());
    System.out.println("Número do CPF: " + this.getCpf());
    System.out.println("-------------------------------");
}

}

