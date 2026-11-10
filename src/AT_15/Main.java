package AT_15;

public class Main {
    public static void main(String[] args) {
        // Criando o objeto livro
        Livro livroObj = new Livro("8535902775", "Dom Casmurro");

        // Referência do tipo da interface Emprestavel
        Emprestavel livro = livroObj;

        System.out.println("=== DADOS DO MATERIAL ===");
        livroObj.exibirDados();
        livroObj.exibirSituacao();
        System.out.println("----------------------------------------");

        // 1. Simulação: Empréstimo (Sucesso esperado)
        System.out.println(">>> Tentativa 1: Empréstimo");
        try {
            livro.emprestar();
        } catch (IllegalStateException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } finally {
            livroObj.exibirSituacao();
            System.out.println("----------------------------------------");
        }

        // 2. Simulação: Novo empréstimo do mesmo livro (Falha esperada)
        System.out.println(">>> Tentativa 2: Novo Empréstimo (livro já emprestado)");
        try {
            livro.emprestar();
        } catch (IllegalStateException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } finally {
            livroObj.exibirSituacao();
            System.out.println("----------------------------------------");
        }

        // 3. Simulação: Devolução (Sucesso esperado)
        System.out.println(">>> Tentativa 3: Devolução");
        try {
            livro.devolver();
        } catch (IllegalStateException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } finally {
            livroObj.exibirSituacao();
            System.out.println("----------------------------------------");
        }

        // 4. Simulação: Nova devolução (Falha esperada)
        System.out.println(">>> Tentativa 4: Nova Devolução (livro já disponível)");
        try {
            livro.devolver();
        } catch (IllegalStateException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } finally {
            livroObj.exibirSituacao();
            System.out.println("----------------------------------------");
        }
    }
}