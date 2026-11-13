package AT_18.ex2_chamado;

public class Main {
    public static void main(String[] args) {
        for (PrioridadeChamado prioridade : PrioridadeChamado.values()) {
            System.out.println(prioridade + ": " + prioridade.getPrazoHoras() + " horas");
        }
    }
}
