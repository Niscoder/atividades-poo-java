package AT_09;

public class Main {
    public static void main(String[] args) {
        // Instanciando os cursos
        CursoPresencial presencial = new CursoPresencial("Programação Java Presencial", 40);
        CursoOnline online = new CursoOnline("Desenvolvimento Web On-line", 60);

        // Apresentação e emissão do Curso Presencial
        System.out.println("--- CURSO PRESENCIAL ---");
        presencial.exibirDados();
        System.out.printf("Valor Total do Curso: R$ %.2f\n", presencial.calcularValor());
        presencial.emitirCertificado("Ana Souza");

        System.out.println("\n------------------------\n");

        // Apresentação e emissão do Curso On-line
        System.out.println("--- CURSO ON-LINE ---");
        online.exibirDados();
        System.out.printf("Valor Total do Curso: R$ %.2f\n", online.calcularValor());
        online.emitirCertificado("Bruno Lima");
    }
}
