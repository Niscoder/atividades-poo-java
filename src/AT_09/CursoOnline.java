package AT_09;

public class CursoOnline extends Curso implements Certificavel {

    public CursoOnline(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public double calcularValor() {
        // R$ 15,00 por hora
        return getCargaHoraria() * 15.0;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Certificado de conclusão do curso on-line '" + getNome() + "' emitido para " + nomeAluno + ".");
    }
}
