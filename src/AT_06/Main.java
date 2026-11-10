package AT_06;

public class Main {
    public static void main(String[] args) {

        Conectavel impressora = new Impressora("Epson EcoTank");
        Conectavel caixaDeSom = new CaixaDeSom("JBL Flip 6");

        impressora.conectar();
        impressora.desconectar();

        caixaDeSom.conectar();
        caixaDeSom.desconectar();
    }
}
