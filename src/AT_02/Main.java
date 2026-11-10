package AT_02;

public class Main {
    public static void main(String[] args) {

        Entrega entrega1 = new EntregaLocal("PED-1001");
        Entrega entrega2 = new EntregaNacional("PED-2002", 150.0); // 150 km de distância

        entrega1.exibirResumo();
        entrega2.exibirResumo();
    }
}