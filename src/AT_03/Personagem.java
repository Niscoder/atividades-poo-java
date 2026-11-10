package AT_03;

abstract class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }


    public abstract void atacar();


    public void exibirStatus() {
        System.out.println("--------------------------------");
        System.out.println("Personagem: " + this.nome);
        System.out.println("Nível: " + this.nivel);
    }
}

class Guerreiro extends Personagem {

    public Guerreiro(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " realiza: Golpe de espada!");
    }
}

class Mago extends Personagem {

    public Mago(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " realiza: Lança feitiço!");
    }
}
