package AT_02;

// Classe abstrata Entrega
abstract class Entrega {
    protected String codigoPedido;


    public Entrega(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public abstract double calcularValorFrete();

    public void exibirResumo() {
        System.out.println("--------------------------------");
        System.out.println("Código do Pedido: " + this.codigoPedido);
        System.out.printf("Valor do Frete: R$ %.2f\n", this.calcularValorFrete());
    }
}

class EntregaLocal extends Entrega {

    public EntregaLocal(String codigoPedido) {
        super(codigoPedido);
    }

    @Override
    public double calcularValorFrete() {
        return 10.00;
    }
}

class EntregaNacional extends Entrega {
    private double distancia; // em km

    public EntregaNacional(String codigoPedido, double distancia) {
        super(codigoPedido);
        this.distancia = distancia;
    }

    @Override
    public double calcularValorFrete() {
        return this.distancia * 1.5;
    }
}


