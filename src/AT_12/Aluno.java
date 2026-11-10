package AT_12;

public class Aluno {
    private String nome;
    private String idade; // Atributo guardado como String

    public Aluno(String nome, String idade) {
        Integer.parseInt(idade);

        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
    }
}