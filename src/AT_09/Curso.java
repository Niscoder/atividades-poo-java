package AT_09;

public abstract class Curso {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Nome do Curso: " + this.nome);
        System.out.println("Carga Horária: " + this.cargaHoraria + "h");
    }

    public abstract double calcularValor();
}