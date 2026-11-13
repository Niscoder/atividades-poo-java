package AT_18.ex2_chamado;

public enum PrioridadeChamado {
    BAIXA(48),
    MEDIA(24),
    ALTA(4);

    private final int prazoHoras;

    PrioridadeChamado(int prazoHoras) {
        this.prazoHoras = prazoHoras;
    }

    public int getPrazoHoras() {
        return prazoHoras;
    }
}
