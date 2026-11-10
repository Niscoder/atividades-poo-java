package AT_11;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String modelo, double valorBaseDiaria, int cilindradas) {
        super(placa, modelo, valorBaseDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularDiaria() {
        // Acrescenta R$ 20,00 ao valor-base
        return getValorBaseDiaria() + 20.0;
    }

    @Override
    public void ligar() {
        System.out.println("Moto " + getModelo() + " ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto " + getModelo() + " desligada.");
    }
}