package AT_13;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", 500.00);

        String[] tentativas = {"100", "600", "-50", "abc"};

        for (String entrada : tentativas) {
            System.out.println("Tentativa de saque com entrada: \"" + entrada + "\"");

            try {
                double valor = Double.parseDouble(entrada);
                conta.sacar(valor);
                System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valor);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida! Digite apenas valores numéricos.");

            } catch (IllegalArgumentException e) {
                System.out.println("Erro de Validação: " + e.getMessage());

            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro de Saldo: " + e.getMessage());

            } finally {
                System.out.printf("Saldo atual da conta: R$ %.2f%n", conta.getSaldo());
            }
        }

        System.out.println("Dados finais da conta:");
        conta.exibirDados();
    }
}