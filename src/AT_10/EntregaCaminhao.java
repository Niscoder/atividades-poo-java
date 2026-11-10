package AT_10;

public class EntregaCaminhao extends Entrega implements Rastreavel {

    public EntregaCaminhao(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularFrete() {
        // R$ 5,00 por quilômetro + R$ 30,00 taxa fixa
        return (getDistanciaKm() * 5.0) + 30.0;
    }

    @Override
    public void rastrear() {
        System.out.println("Rastreamento [" + getCodigo() + "]: Encomenda em deslocamento via Caminhão.");
    }
}