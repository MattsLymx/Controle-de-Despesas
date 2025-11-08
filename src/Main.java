
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== SISTEMA DE CONTROLE DE DESPESAS ===");
            System.out.println("1. Entrar Despesa");
            System.out.println("2. Anotar Pagamento");
            System.out.println("3. Listar Despesas em Aberto no período");
            System.out.println("4. Listar Despesas Pagas no período");
            System.out.println("5. Gerenciar Tipos de Despesa");
            System.out.println("6. Gerenciar Usuários");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            // Verifica se a entrada é um número
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, digite um número válido: ");
                scanner.next(); // descarta entrada inválida
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("-> Entrar Despesa");
                    break;
                case 2:
                    System.out.println("-> Anotar Pagamento");
                    break;
                case 3:
                    System.out.println("-> Listar Despesas em Aberto");
                    break;
                case 4:
                    System.out.println("-> Listar Despesas Pagas");
                    break;
                case 5:
                    System.out.println("-> Gerenciar Tipos de Despesa");
                    break;
                case 6:
                    System.out.println("-> Gerenciar Usuários");
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();

        } while (opcao != 7);

        scanner.close();
    }
}
