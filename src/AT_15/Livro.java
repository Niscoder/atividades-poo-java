package AT_15;

public class Livro extends MaterialBiblioteca implements Emprestavel {
    private boolean emprestado;

    public Livro(String codigo, String titulo) {
        super(codigo, titulo);
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public void emprestar() {
        if (emprestado) {
            throw new IllegalStateException("O livro '" + getTitulo() + "' já está emprestado.");
        }
        emprestado = true;
        System.out.println("Empréstimo realizado com sucesso!");
    }

    @Override
    public void devolver() {
        if (!emprestado) {
            throw new IllegalStateException("O livro '" + getTitulo() + "' já está disponível (não foi emprestado).");
        }
        emprestado = false;
        System.out.println("Devolução realizada com sucesso!");
    }

    @Override
    public void exibirSituacao() {
        System.out.println("Situação: " + (emprestado ? "Emprestado" : "Disponível"));
    }
}