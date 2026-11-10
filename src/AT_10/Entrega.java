package AT_10;

public abstract class Entrega {
    private String codigo;
    private double distanciaKm;

    public Entrega(String codigo, double distanciaKm) {
        this.codigo = codigo;
        this.distanciaKm = distanciaKm;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void exibirDados() {
        System.out.println("Código da Entrega: " + this.codigo);
        System.out.println("Distância: " + this.distanciaKm + " km");
    }

    public abstract double calcularFrete();
}