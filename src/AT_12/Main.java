package AT_12;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        String idadeTexto = scanner.nextLine();

        try {
            // Passa a String idadeTexto diretamente para o construtor do Aluno
            Aluno aluno = new Aluno(nome, idadeTexto);
            System.out.println("\n--- Cadastro Realizado ---");
            aluno.exibirDados();
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida! Digite um número inteiro.");
        } finally {
            System.out.println("Tentativa de cadastro finalizada.");
            scanner.close();
        }
    }
}