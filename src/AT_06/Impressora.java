package AT_06;

public class Impressora implements Conectavel {
    private String modelo;

    public Impressora(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void conectar() {
        System.out.println("Impressora (" + this.modelo + ") conectada por USB.");
    }

    @Override
    public void desconectar() {
        System.out.println("Impressora (" + this.modelo + ") desconectada.");
    }
}