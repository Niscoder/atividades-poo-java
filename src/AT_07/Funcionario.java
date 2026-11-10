package AT_07;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
    }

    public abstract double calcularSalario();
}