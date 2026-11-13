package AT_18.ex3_emprestimo;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Situação inicial: " + livro.getSituacao());
        System.out.println("----------------------------------------");

        boolean resultado = livro.emprestar();
        System.out.println("1º empréstimo -> retorno: " + resultado + " | situação: " + livro.getSituacao());

        resultado = livro.emprestar();
        System.out.println("2º empréstimo -> retorno: " + resultado + " | situação: " + livro.getSituacao());

        resultado = livro.devolver();
        System.out.println("Devolução     -> retorno: " + resultado + " | situação: " + livro.getSituacao());
    }
}
