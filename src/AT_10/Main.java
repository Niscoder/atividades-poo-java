package AT_10;

public class Main {
    public static void main(String[] args) {
        // Instanciando as entregas
        EntregaBicicleta bike = new EntregaBicicleta("ENT-BIKE-01", 5.0);
        EntregaCaminhao caminhao = new EntregaCaminhao("ENT-CAM-02", 20.0);

        // Exibição e rastreamento - Entrega por Bicicleta
        System.out.println("--- ENTREGA POR BICICLETA ---");
        bike.exibirDados();
        System.out.printf("Valor do Frete: R$ %.2f\n", bike.calcularFrete());
        bike.rastrear();

        System.out.println("\n------------------------------\n");

        // Exibição e rastreamento - Entrega por Caminhão
        System.out.println("--- ENTREGA POR CAMINHÃO ---");
        caminhao.exibirDados();
        System.out.printf("Valor do Frete: R$ %.2f\n", caminhao.calcularFrete());
        caminhao.rastrear();
    }
}