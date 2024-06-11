import java.util.ArrayList;

public class Locadora {
    public static void main(String[] args) {
        //inicializarCatalogo();
        telaInicial();
    }
    private static void telaInicial() {
        int opcao;

        do {
        System.out.println("\n--- Locadora de Filmes ---");
        System.out.println("1. Cadastro");
        System.out.println("2. Login");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

        switch (opcao) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                fazerLogin();
                break;
            case 3:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        }
    } while (opcao != 3);
}
