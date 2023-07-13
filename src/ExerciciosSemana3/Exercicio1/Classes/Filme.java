package ExerciciosSemana3.Exercicio1.Classes;

public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int classificacao;
    private String duracao;
    private double valor;
    private String tecnologia;
    private int poltronas = 100;

    public Filme() {
    }

    @Override
    public String toString() {
        return "Id do filme: " + id +
                ", Titulo: '" + titulo + '\'' +
                ", Genero: '" + genero + '\'' +
                ", Classificacao: " + classificacao +
                ", Duracao: '" + duracao + '\'' +
                ", Valor: " + valor +
                ", Tecnologia: '" + tecnologia + '\'' +
                ", Poltronas: " + poltronas +
                "             ";

    }

    public Filme(int id, String titulo, String genero, int classificacao, String duracao, double valor, String tecnologia, int poltronas) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.duracao = duracao;
        this.valor = valor;
        this.tecnologia = tecnologia;
        this.poltronas = poltronas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(int poltronas) {
        this.poltronas = poltronas;
    }
}
