package AT_07;

public class Secretario extends Funcionario implements Registravel {
    private double salarioMensal;

    public Secretario(String nome, String matricula, double salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return this.salarioMensal;
    }

    @Override
    public void registrarPresenca() {
        System.out.println("Presença registrada para o(a) Secretário(a) " + this.nome + ".");
    }
}
