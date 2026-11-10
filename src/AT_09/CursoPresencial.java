package AT_09;

public class CursoPresencial extends Curso implements Certificavel {

    public CursoPresencial(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public double calcularValor() {
        // R$ 20,00 por hora + R$ 50,00 de material
        return (getCargaHoraria() * 20.0) + 50.0;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Certificado de conclusão do curso presencial '" + getNome() + "' emitido para " + nomeAluno + ".");
    }
}