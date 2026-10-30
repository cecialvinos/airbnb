package programa;

import menu.MenuPrincipal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MenuPrincipal menu = new MenuPrincipal();
        menu.exibirMenu();
    }
}