package AT_15;

public abstract class MaterialBiblioteca {
    private final String codigo;
    private final String titulo;

    public MaterialBiblioteca(String codigo, String titulo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O código não pode ser nulo nem vazio.");
        }
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo nem vazio.");
        }
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo + " | Título: " + titulo);
    }

    public abstract void exibirSituacao();
}