package AT_18.ex1_semaforo;

public class Main {
    public static void main(String[] args) {
        CorSemaforo cor = CorSemaforo.VERMELHO;

        switch (cor) {
            case VERMELHO -> System.out.println("Pare.");
            case AMARELO -> System.out.println("Atenção.");
            case VERDE -> System.out.println("Siga.");
        }
    }
}
