package menu;

import java.util.Scanner;

public class MenuHospede {

    private Scanner scanner;

    public MenuHospede() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("================ MENU DO HOSPEDE ================");
            System.out.println("1 - Pesquisar imoveis");
            System.out.println("2 - Fazer reserva");
            System.out.println("3 - Cancelar reserva");
            System.out.println("4 - Avaliar imovel");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Pesquisar imoveis...");
                    break;

                case 2:
                    System.out.println("Fazer reserva...");
                    break;

                case 3:
                    System.out.println("Cancelar reserva...");
                    break;

                case 4:
                    System.out.println("Avaliar imovel...");
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
