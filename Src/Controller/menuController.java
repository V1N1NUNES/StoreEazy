package Controller;

import View.Menus;

import java.util.Scanner;

public abstract class menuController {
    public void menuPrincipalController(Scanner r, int option) {
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                Menus.menuEncerramento(r);
                break;
            default:
                System.out.println("Entrada inválida, tente novamendo"); //retornar ao menu principal
        }
    }

    public static void menuCadastroController(Scanner r, int option) {
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                Menus.menuPrincipal(r);
                break;
            default:
                System.out.println("Entrada inválida, tente novamendo"); //retornar ao menu principal

        }
    }
}
