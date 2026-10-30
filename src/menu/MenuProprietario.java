package menu;

import service.ImovelService;

import java.util.Scanner;

public class MenuProprietario {

    private Scanner scanner;

    public MenuProprietario() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("================ MENU DO PROPRIETARIO ================");
            System.out.println("1 - Cadastrar imóvel");
            System.out.println("2 - Editar imóvel");
            System.out.println("3 - Remover imóvel");
            System.out.println("4 - Visualizar reservas");
            System.out.println("5 - Consultar meus anúncios");
            System.out.println("0 - Voltar ao menu principal");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    ImovelService imovelService = new ImovelService();
                    imovelService.cadastrarEndereco();
                    break;

                case 2:
                    System.out.println("Editar imovel...");
                    break;

                case 3:
                    System.out.println("Remover imovel...");
                    break;

                case 4:
                    System.out.println("Visualizar reservas...");
                    break;

                case 5:
                    System.out.println("Consultar meus anuncios...");
                    break;

                case 0:
                    System.out.println("A voltar ao menu principal...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);
    }
}
