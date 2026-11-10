package AT_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Armazenamento dos dados (nome e nota correspondem pela posição)
        String[] nomes = new String[5];
        double[] notas = new double[5];

        // 2. Cadastro dos alunos
        System.out.println("=== CADASTRO DE ALUNOS ===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do " + (i + 1) + "º aluno: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Nota final de " + nomes[i] + ": ");
            double nota = scanner.nextDouble();
            while (nota < 0 || nota > 10) {
                System.out.print("Nota inválida! Digite um valor entre 0 e 10: ");
                nota = scanner.nextDouble();
            }
            notas[i] = nota;
            scanner.nextLine(); // consome a quebra de linha que sobra após nextDouble()
        }

        // 3. Listagem dos resultados
        System.out.println("\n=== RESULTADOS ===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%s - Nota: %.2f - Situação: %s%n", nomes[i], notas[i], situacao(notas[i]));
        }

        // 4. Resumo da turma
        double soma = 0;
        int indiceMaior = 0;
        int indiceMenor = 0;
        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

            // Usa > e < (e não >= e <=) para manter o primeiro aluno em caso de empate
            if (notas[i] > notas[indiceMaior]) {
                indiceMaior = i;
            }
            if (notas[i] < notas[indiceMenor]) {
                indiceMenor = i;
            }

            if (notas[i] >= 7.0) {
                aprovados++;
            } else if (notas[i] >= 5.0) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.println("\n=== RESUMO DA TURMA ===");
        System.out.printf("Média da turma: %.2f%n", media);
        System.out.printf("Maior nota: %.2f (%s)%n", notas[indiceMaior], nomes[indiceMaior]);
        System.out.printf("Menor nota: %.2f (%s)%n", notas[indiceMenor], nomes[indiceMenor]);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Em recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);

        // 5. Pesquisa por nome
        System.out.print("\nDigite o nome do aluno para pesquisar: ");
        String busca = scanner.nextLine();

        int encontrado = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                encontrado = i;
                break; // para no primeiro encontrado
            }
        }

        if (encontrado != -1) {
            System.out.printf("%s - Nota: %.2f - Situação: %s%n",
                    nomes[encontrado], notas[encontrado], situacao(notas[encontrado]));
        } else {
            System.out.println("Aluno não encontrado.");
        }

        scanner.close();
    }

    // Retorna a situação do aluno de acordo com a nota final
    static String situacao(double nota) {
        if (nota >= 7.0) {
            return "Aprovado";
        } else if (nota >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
