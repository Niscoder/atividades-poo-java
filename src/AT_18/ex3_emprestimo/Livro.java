package AT_18.ex3_emprestimo;

public class Livro {
    private String titulo;
    private SituacaoLivro situacao;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.situacao = SituacaoLivro.DISPONIVEL;
    }

    public String getTitulo() {
        return titulo;
    }

    public SituacaoLivro getSituacao() {
        return situacao;
    }

    public boolean emprestar() {
        if (situacao != SituacaoLivro.DISPONIVEL) {
            return false;
        }
        situacao = SituacaoLivro.EMPRESTADO;
        return true;
    }

    public boolean devolver() {
        if (situacao != SituacaoLivro.EMPRESTADO) {
            return false;
        }
        situacao = SituacaoLivro.DISPONIVEL;
        return true;
    }
}
