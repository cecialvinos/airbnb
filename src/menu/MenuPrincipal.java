package menu;

import java.util.Scanner;

public class MenuPrincipal {

    private Scanner scanner;

    public MenuPrincipal() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("================ AIRBNB ================");
            System.out.println("1 - Entrar como Hospede");
            System.out.println("2 - Entrar como Proprietário");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    MenuHospede menuHospede = new MenuHospede();
                    menuHospede.exibirMenu();
                    break;

                case 2:
                    MenuProprietario menuProprietario = new MenuProprietario();
                    menuProprietario.exibirMenu();
                    break;

                case 0:
                    System.out.println("A sair do Airbnb...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
            scanner.close();
        } while (opcao != 0);
    }
}
