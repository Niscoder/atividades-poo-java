package AT_10;

public class EntregaBicicleta extends Entrega implements Rastreavel {

    public EntregaBicicleta(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularFrete() {
        // R$ 2,00 por quilômetro
        return getDistanciaKm() * 2.0;
    }

    @Override
    public void rastrear() {
        System.out.println("Rastreamento [" + getCodigo() + "]: Encomenda em deslocamento via Bicicleta.");
    }
}