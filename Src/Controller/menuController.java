package Controller;

import Model.Enums.Sessao;
import View.Menus;

import java.util.Scanner;

public abstract class menuController {
    public static void menuPrincipalController(Scanner r, int option) {
        switch (option) {
            case 1:
                Menus.menuCadastro(r);
                break;
            case 2:
                Menus.menuEdicao(r);
                break;
            case 3:
                Menus.menuExclusao(r);
                break;
            case 4:
                Menus.menuListagem(r);
                break;
            case 5:
                Menus.menuAreaRestrita(r);
                break;
            case 6:
                Menus.menuEncerramento(r);
                break;
            default:
                System.out.println("Entrada inválida"); //retornar ao menu principal
                System.out.println("Voltando ao menu principal");
                Menus.menuPrincipal(r);
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
                System.out.println("Entrada inválida"); //retornar ao menu principal
                System.out.println("Voltando ao menu principal");
                Menus.menuPrincipal(r);

        }
    }
    public static Sessao menuCadastroController_sessao(Scanner r, int option) {

        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida"); //retornar ao menu principal
                System.out.println("Voltando ao menu de cadastro");
                Menus.menuCadastro(r);
        }
    }

    public static void menuEditcaoController(Scanner r, int option) {
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Entrada inválida"); //retornar ao menu principal
                System.out.println("Voltando ao menu principal");
                Menus.menuPrincipal(r);
        }
    }
}
