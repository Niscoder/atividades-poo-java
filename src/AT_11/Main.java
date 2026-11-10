package AT_11;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC1D23", "Onix", 100.0, 4);
        Veiculo moto = new Moto("XYZ9A87", "CG 160", 60.0, 160);

        System.out.println("=== CARRO ===");
        carro.exibirDados();
        System.out.println("Portas: " + ((Carro) carro).getQuantidadePortas());
        System.out.printf("Locação por 3 dias: R$ %.2f\n\n", carro.calcularLocacao(3));

        System.out.println("=== MOTO ===");
        moto.exibirDados();
        System.out.println("Cilindradas: " + ((Moto) moto).getCilindradas());
        System.out.printf("Locação por 3 dias: R$ %.2f\n\n", moto.calcularLocacao(3));

        System.out.println("=== OPERAÇÕES ===");
        Operavel opCarro = carro;
        opCarro.ligar();
        opCarro.desligar();

        Operavel opMoto = moto;
        opMoto.ligar();
        opMoto.desligar();

        System.out.println("\nTotal de veículos criados: " + Veiculo.getTotalVeiculos());
    }
}