package AT_03;

public class Main {
    public static void main(String[] args) {

        Personagem guerreiro = new Guerreiro("Thorin", 15);
        Personagem mago = new Mago("Gandalf", 20);

        guerreiro.exibirStatus();
        guerreiro.atacar();

        mago.exibirStatus();
        mago.atacar();
    }
}
