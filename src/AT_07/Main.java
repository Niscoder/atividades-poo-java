package AT_07;

public class Main {
    public static void main(String[] args) {
        // Instanciando o Professor (80 horas a R$ 40,00 por hora)
        Professor professor = new Professor("Carlos Andrade", "PROF-001", 80, 40.00);

        // Instanciando o Secretário (Salário fixo de R$ 2.500,00)
        Secretario secretario = new Secretario("Mariana Silva", "SEC-002", 2500.00);

        // Exibindo dados do Professor
        System.out.println("--- DADOS DO PROFESSOR ---");
        professor.exibirDados();
        System.out.printf("Salário: R$ %.2f\n", professor.calcularSalario());
        professor.registrarPresenca();

        // Exibindo dados do Secretário
        System.out.println("--- DADOS DO SECRETÁRIO ---");
        secretario.exibirDados();
        System.out.printf("Salário: R$ %.2f\n", secretario.calcularSalario());
        secretario.registrarPresenca();
    }
}