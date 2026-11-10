package AT_07;

public class Professor extends Funcionario implements Registravel {
    private int quantidadeHoras;
    private double valorHora;

    public Professor(String nome, String matricula, int quantidadeHoras, double valorHora) {
        super(nome, matricula);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return this.quantidadeHoras * this.valorHora;
    }

    @Override
    public void registrarPresenca() {
        System.out.println("Presença registrada para o(a) Professor(a) " + this.nome + ".");
    }
}
