package AT_13;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular não pode ser nulo ou vazio.");
        }
        if (saldoInicial < 0 || !Double.isFinite(saldoInicial)) {
            throw new IllegalArgumentException("O saldo inicial deve ser um número não negativo e finito.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0 || !Double.isFinite(valor)) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero e um número finito.");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a operação. Saldo disponível: R$ " + String.format("%.2f", saldo));
        }

        this.saldo -= valor;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}